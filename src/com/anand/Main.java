package com.anand;

public class Main {

    public static void main(String[] args) {
        int arraySize = 50000; // Adjusted size of the array

        int[] randomNumbers = new int[arraySize];
        for (int i = 0; i < randomNumbers.length; i++) {
            randomNumbers[i] = (int)(Math.random() * 15000); // Changed the random range
        }

        int[] numbersForBubbleSort = new int[randomNumbers.length];
        System.arraycopy(randomNumbers, 0, numbersForBubbleSort, 0, randomNumbers.length);
        long start = System.nanoTime();
        Sorter.bubbleSort(numbersForBubbleSort);
        long end = System.nanoTime();
        System.out.println("Time taken by Bubble Sort: " + (end - start) / 1000000.0 + " ms");

        int[] numbersForMergeSort = new int[randomNumbers.length];
        System.arraycopy(randomNumbers, 0, numbersForMergeSort, 0, randomNumbers.length);
        start = System.nanoTime();
        Sorter.mergeSort(numbersForMergeSort);
        end = System.nanoTime();
        System.out.println("Time taken by Merge Sort: " + (end - start) / 1000000.0 + " ms");
    }
}
