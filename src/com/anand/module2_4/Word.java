package com.anand.module2_4;

public class Word {
    private String word;

    public Word(String word) {
        this.word = word.toLowerCase().replaceAll("[^a-z]", "");
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj) return true;
        if (obj == null || getClass() != obj.getClass()) return false;
        Word word1 = (Word) obj;
        return word.equals(word1.word);
    }

    @Override
    public int hashCode() {
        return word.hashCode();
    }

    @Override
    public String toString() {
        return word;
    }
}
