package com.learning.bubblesort;

public class test {

    public static void main(String[] args) {
        int[] array = {22 , 8, -15, 45 , 75, -22, 3};
        print(array);
        BubbleSortImpl sortimpl = new BubbleSortImpl();
        sortimpl.sort(array);
        print(array);
    }

    private static void print(int[] array) {
        System.out.println("***************");
        for (int integer: array) {
            System.out.print(integer + " ");
        }
    }
}
