package com.anand.module2_3;

import java.util.Collections;
import java.util.LinkedList;

public class Main {
    public static void main(String[] args) {
        Deck deck = new Deck();
        LinkedList<Card> hand = new LinkedList<>();

        // Draw seven cards
        for (int i = 0; i < 7; i++) {
            hand.add(deck.getCards().pop());
        }

        // Print the hand before sorting
        System.out.println("Hand before sorting:");
        for (Card card : hand) {
            System.out.println(card);
        }

        // Sort by suit
        Collections.sort(hand, new SuitComparator());
        System.out.println("\nHand sorted by suit:");
        for (Card card : hand) {
            System.out.println(card);
        }

        // Sort by face card
        Collections.sort(hand, new FaceCardComparator());
        System.out.println("\nHand sorted by face card:");
        for (Card card : hand) {
            System.out.println(card);
        }
    }
}
