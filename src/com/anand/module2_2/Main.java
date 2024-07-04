package com.anand.module2_2;

import java.util.LinkedList;

public class Main {
    public static void main(String[] args) {
        Deck deck = new Deck();
        LinkedList<Card> hand = new LinkedList<>();

        // Draw seven cards
        for (int i = 0; i < 7; i++) {
            hand.add(deck.getCards().pop());
        }

        // Print the hand
        for (Card card : hand) {
            System.out.println(card);
        }
    }
}
