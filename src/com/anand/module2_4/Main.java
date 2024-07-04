package com.anand.module2_4;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.HashSet;
import java.util.Set;

public class Main {
    public static void main(String[] args) {
        Set<Word> uniqueWords = new HashSet<>();
        String filePath = "src/com/anand/module2_4/illiad.txt"; // Ensure this path is correct
        try (BufferedReader reader = new BufferedReader(new FileReader(filePath))) {
            String line;
            while ((line = reader.readLine()) != null) {
                String[] words = line.split("\\W+");
                for (String w : words) {
                    uniqueWords.add(new Word(w));
                }
            }
        } catch (IOException e) {
            e.printStackTrace();
        }

        System.out.println("Number of unique words: " + uniqueWords.size());
    }
}
