package com.anand.Globalvariables;

import java.util.List;

public class WordLength {
    public static int LONG_WORD_LENGTH = 5;
    public static String longestWord;

    public static void countLongWords(List<String> words){
        int n = 0;
        longestWord = "";
        for(String word : words){
            if(word.length() > LONG_WORD_LENGTH) n++;
            if(word.length() > longestWord.length()) longestWord = word;
        }
        System.out.println(n);
    }

    public static String countLongWords(List<String> words, int wordsize){
        int n = 0;
        String largestWord = "";
        for(String word : words){
            if(word.length() > wordsize) n++;
            if(word.length() > largestWord.length()) largestWord = word;
        }
        System.out.println(n);
        return largestWord;
    }
}