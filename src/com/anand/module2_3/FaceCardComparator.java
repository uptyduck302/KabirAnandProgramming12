package com.anand.module2_3;

import java.util.Comparator;

public class FaceCardComparator implements Comparator<Card> {
    @Override
    public int compare(Card c1, Card c2) {
        if (c1.isFaceCard() && !c2.isFaceCard()) {
            return -1;
        } else if (!c1.isFaceCard() && c2.isFaceCard()) {
            return 1;
        } else {
            return Integer.compare(c1.getValue(), c2.getValue());
        }
    }
}
