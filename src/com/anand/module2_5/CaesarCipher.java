package com.anand.module2_5;

import java.util.HashMap;
import java.util.Map;

public class CaesarCipher {
    private static final String ALPHABET = "abcdefghijklmnopqrstuvwxyz";
    private int shift;
    private Map<Character, Character> encryptMap;
    private Map<Character, Character> decryptMap;

    public CaesarCipher(int shift) {
        this.shift = shift;
        encryptMap = new HashMap<>();
        decryptMap = new HashMap<>();
        for (int i = 0; i < ALPHABET.length(); i++) {
            char originalChar = ALPHABET.charAt(i);
            char encryptedChar = ALPHABET.charAt((i + shift) % ALPHABET.length());
            encryptMap.put(originalChar, encryptedChar);
            decryptMap.put(encryptedChar, originalChar);
        }
    }

    public String encrypt(String message) {
        StringBuilder encrypted = new StringBuilder();
        for (char c : message.toLowerCase().toCharArray()) {
            encrypted.append(encryptMap.getOrDefault(c, c));
        }
        return encrypted.toString();
    }

    public String decrypt(String message) {
        StringBuilder decrypted = new StringBuilder();
        for (char c : message.toLowerCase().toCharArray()) {
            decrypted.append(decryptMap.getOrDefault(c, c));
        }
        return decrypted.toString();
    }

    public static void main(String[] args) {
        CaesarCipher cipher = new CaesarCipher(1);
        String encrypted = cipher.encrypt("defend the east wall of the castle");
        System.out.println("Encrypted: " + encrypted);
        String decrypted = cipher.decrypt(encrypted);
        System.out.println("Decrypted: " + decrypted);
    }
}
