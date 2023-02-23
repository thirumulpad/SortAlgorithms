package com.learning.bubblesort;

public class BubbleSortImpl {

    public int[] sort(int[] array) {
        // sorting the largest number to extreme right
        for (int lastUnsortedIndex = array.length - 1; lastUnsortedIndex > 0; lastUnsortedIndex--) {
            //compare the elements from left to right 2 at a time
            for (int i = 0; i < lastUnsortedIndex; i++) {
                //if left element is greater than right element, swap
                if(array[i] > array[i+1])
                    swap(array, i, i+1);
            }
        }

        return array;
    }

    private void swap(int[] array, int i, int j) {
        if (i == j)
            return;
        int temp = array[j];
        array[j] = array[i];
        array[i] = temp;
    }
}
