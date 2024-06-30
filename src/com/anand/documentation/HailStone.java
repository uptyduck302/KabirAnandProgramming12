package com.anand.documentation;

import java.util.ArrayList;
import java.util.List;

public class HailStone {


    /**
     * Compute Hailstone sequence.
     * See https://en.wikipedia.org/wiki/Collatz_conjecture
     * @param n starting number of sequence; requires n > 0
     * @return the hailstone sequence starting at n and ending with 1.
     *              For example, hailStoneSequence(3) = {3,10,5,16,8,4,2,1}.
     */
    public static List<Integer> hailStoneSequence(int n){
        List<Integer> list = new ArrayList<>();
        int i = 0;

        while(n != 1) { //test wether n is 1
            i++; // increment i by 1
            list.add(n); //add n to list
        }
        return list;
    }

    public static void main(String[] args) {

    }
}