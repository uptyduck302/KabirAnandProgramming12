package com.anand.module2_5;

public class Main {
    public static void main(String[] args) {
        // Create an instance of CaesarCipher with a shift of 3
        CaesarCipher cipher = new CaesarCipher(3);

        // The original message
        String originalMessage = "defend the east wall of the castle";

        // Encrypt the message
        String encryptedMessage = cipher.encrypt(originalMessage);

        // Decrypt the message
        String decryptedMessage = cipher.decrypt(encryptedMessage);

        // Print the original, encrypted, and decrypted messages
        System.out.println("Original: " + originalMessage);
        System.out.println("Encrypted: " + encryptedMessage);
        System.out.println("Decrypted: " + decryptedMessage);
    }
}
