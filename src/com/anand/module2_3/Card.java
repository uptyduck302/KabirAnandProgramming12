package com.anand.module2_3;

public class Card {
    private Suit suit;
    private int value; // 1-10 for number cards, 11-13 for face cards
    private boolean isFaceCard;

    public Card(Suit suit, int value) {
        this.suit = suit;
        this.value = value;
        this.isFaceCard = (value > 10);
    }

    public Suit getSuit() {
        return suit;
    }

    public int getValue() {
        return value;
    }

    public boolean isFaceCard() {
        return isFaceCard;
    }

    @Override
    public String toString() {
        return "Card{" +
                "suit=" + suit +
                ", value=" + value +
                ", isFaceCard=" + isFaceCard +
                '}';
    }
}
