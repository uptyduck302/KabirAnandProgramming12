package com.anand.module2_2;

import java.util.LinkedList;

public class Deck {
    private LinkedList<Card> cards;

    public Deck() {
        cards = new LinkedList<>();
        for (Suit suit : Suit.values()) {
            for (int value = 1; value <= 13; value++) {
                cards.add(new Card(suit, value));
            }
        }
    }

    public LinkedList<Card> getCards() {
        return cards;
    }
}
