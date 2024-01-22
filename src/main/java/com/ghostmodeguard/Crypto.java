package com.ghostmodeguard;

import java.util.Base64;
import javax.crypto.Cipher;
import javax.crypto.spec.IvParameterSpec;
import javax.crypto.spec.SecretKeySpec;
import com.fasterxml.jackson.databind.ObjectMapper;

public class Crypto {

    private final SecretKeySpec keySpec;

    private final ObjectMapper objectMapper;

    public Crypto(String key) {
        // Ensure that the key is 16, 24, or 32 bytes long (128, 192, or 256 bits)
        byte[] keyBytes = key.getBytes();
        keySpec = new SecretKeySpec(keyBytes, "AES");
        this.objectMapper = new ObjectMapper();
    }

    // Decrypt a message using AES
    public ComputedHidingRisk decrypt(String ciphertext) throws Exception {
        byte[] cipherTextWithIV = Base64.getDecoder().decode(ciphertext);
        Cipher cipher = Cipher.getInstance("AES/CFB/NoPadding");
        byte[] iv = new byte[cipher.getBlockSize()];
        System.arraycopy(cipherTextWithIV, 0, iv, 0, iv.length);
        IvParameterSpec ivParams = new IvParameterSpec(iv);
        cipher.init(Cipher.DECRYPT_MODE, keySpec, ivParams);

        byte[] decryptedBytes = cipher.doFinal(cipherTextWithIV, iv.length, cipherTextWithIV.length - iv.length);
        return objectMapper.readValue(decryptedBytes, ComputedHidingRisk.class);
    }
}
