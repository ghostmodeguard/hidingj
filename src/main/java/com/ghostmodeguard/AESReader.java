package com.ghostmodeguard;

import java.io.IOException;
import java.security.InvalidAlgorithmParameterException;
import java.security.InvalidKeyException;
import java.security.NoSuchAlgorithmException;
import java.util.Base64;
import javax.crypto.BadPaddingException;
import javax.crypto.Cipher;
import javax.crypto.IllegalBlockSizeException;
import javax.crypto.NoSuchPaddingException;
import javax.crypto.spec.IvParameterSpec;
import javax.crypto.spec.SecretKeySpec;
import com.fasterxml.jackson.databind.ObjectMapper;

// Instance that allow to read computed hiding risk message
public class AESReader {

    // Key used to decrypt message
    private final SecretKeySpec keySpec;

    // Mapper that unmarshall json content of a decrypted message
    private final ObjectMapper objectMapper;

    // Constructor that build an AES reader from a key string
    public AESReader(String key) {
        byte[] keyBytes = key.getBytes();
        keySpec = new SecretKeySpec(keyBytes, "AES");
        this.objectMapper = new ObjectMapper();
    }

    // Decrypt a message using AES
    public ComputedHidingRisk decrypt(String ciphertext) throws GhostModeGuardException {
        try {
            byte[] cipherTextWithIV = Base64.getDecoder().decode(ciphertext);
            Cipher cipher = Cipher.getInstance("AES/CFB/NoPadding");
            byte[] iv = new byte[cipher.getBlockSize()];
            System.arraycopy(cipherTextWithIV, 0, iv, 0, iv.length);
            IvParameterSpec ivParams = new IvParameterSpec(iv);
            cipher.init(Cipher.DECRYPT_MODE, keySpec, ivParams);

            byte[] decryptedBytes = cipher.doFinal(cipherTextWithIV, iv.length, cipherTextWithIV.length - iv.length);
            return objectMapper.readValue(decryptedBytes, ComputedHidingRisk.class);
        } catch (NoSuchPaddingException | NoSuchAlgorithmException | InvalidAlgorithmParameterException |
                 InvalidKeyException | IllegalBlockSizeException | BadPaddingException | IOException e) {
            throw new GhostModeGuardException("An error occurred during the decryption process", e);
        }
    }
}
