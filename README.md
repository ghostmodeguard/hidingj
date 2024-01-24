# Hiding reader library

## Overview

The GhostModeGuard package provides functionality for reading computed hiding risk messages. It employs asymmetric cryptography, specifically AES, for secure message handling.

## Installation

To use the GhostModeGuard library in your project, you can include it as a dependency. For example, if you are using Maven, add the following to your `pom.xml`:

```xml
<dependency>
    <groupId>com.ghostmodeguard</groupId>
    <artifactId>ghostmodeguard</artifactId>
    <version>1.0.0</version>
</dependency>
```

## Usage

Request a private key as explained [here](https://www.npmjs.com/package/ghost-mode-guard-hiding):

```bash
curl -X 'POST' \
'https://api.ghostmodeguard.com/trust/v1/client?domain=[domain of your frontend application]' \
-H 'accept: application/json'
```

Store it on your application, then create an `AESReader` instance

The `AESReader` class is the main component of GhostModeGuard for decrypting messages. It provides methods for initializing the reader with a key and decrypting messages.

Constructor

```java
public AESReader(String key)
```

Parameters:

 - key - The key string used for decrypting messages (32 digits)

Read a Computed Hiding Risk Message

```java
public ComputedHidingRisk decrypt(String ciphertext) throws GhostModeGuardException
```

Parameters:

 - ciphertext - The encrypted message in Base64-encoded format.

Returns:

 - A `ComputedHidingRisk` object representing the decrypted message.

Throws:
 - `GhostModeGuardException` - If an error occurs during the decryption process.

The Read method decrypts the given message using the private key and returns a ComputedHidingRisk structure, containing the parsed message.

## Example

```java
public class Example {
    public static void main(String[] args) {
        String key = "your_secret_key";
        AESReader aesReader = new AESReader(key);

        String encryptedMessage = "base64_encoded_ciphertext";
        try {
            ComputedHidingRisk decryptedMessage = aesReader.decrypt(encryptedMessage);
            System.out.println("Decrypted Message: " + decryptedMessage);
        } catch (GhostModeGuardException e) {
            System.err.println("Error: " + e.getMessage());
            e.printStackTrace();
        }
    }
}
```

## Exception Handling

The `AESReader` class throws a `GhostModeGuardException` in case of any error during the decryption process. Make sure to handle this exception appropriately in your code.

## Important Notes

- Ensure that you handle errors appropriately, especially during the creation of the AESReader instance and when reading the computed hiding risk message.
- The private key should be kept confidential and not shared publicly.

## License

GhostModeGuard hiding library reader is licensed under the MIT License. Feel free to use, modify, and distribute it according to the terms of the license.
