package com.company;
import java.lang.reflect.Array;
import java.util.Arrays;

public class SelectionSort {

    public static void main(String[] args) {
        // write your test code here
        int[] numbers = {8, 3, 7, 9, 1, 2, 4};
        SelectionSort.sort(numbers);

    }

    // finds smallest value
    public static int smallest(int[] array) {
        int lowestValue = array[0];

        // both loops do same thing, top one is recommended by IDE

        for (int temp : array) {
            if (temp < lowestValue) {
                lowestValue = temp;
            }

        }/*
        for (int i = 0; i < array.length; i++) {
            int temp = array[i];
            if (temp < lowestValue) {
                lowestValue = temp;
            }

        }
        */

        return lowestValue;

    }

    // finds index of smallest value
    public static int indexOfSmallest(int[] array) {
        int lowestValue = array[0];
        int index = 0;

        for (int i = 0; i < array.length; i++) {
            int temp = array[i];
            if (temp < lowestValue) {
                lowestValue = temp;
                index = i;
            }

        }
        return index;

    }

    public static int indexOfSmallestFrom(int[] table, int startIndex) {
        // write your code here

        int lowestValue = table[startIndex];
        int index = startIndex;

        for (int i = startIndex; i < table.length; i++) {
            int temp = table[i];
            if (temp < lowestValue) {
                lowestValue = temp;
                index = i;
            }

        }
        return index;

    }

    public static void swap(int[] array, int index1, int index2) {

        int temp = array[index1];
        Array.set(array, index1, array[index2]);
        Array.set(array, index2, temp);
    }



       public static void swapNumbers(int index1, int index2) {
           System.out.println("Was " + index1 + " and " + index2);

           int temp = index1;
           index1 = index2;
           index2 = temp;

           System.out.println("Now " + index1 + " and " + index2);
       }

    public static void sort(int[] array) {
        for (int i = 0; i < array.length; i++) {
            int smallest = indexOfSmallestFrom(array, i);
            swap(array, i, smallest);
            System.out.println(Arrays.toString(array));
        }

    }

}

