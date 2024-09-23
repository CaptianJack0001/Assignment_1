package com.deloitte.lab7.ex5;

import java.util.Arrays;
import java.util.Collections;

public class SecondSmallestFinder {
    public static int getSecondSmallest(int[] arr) {
        Arrays.sort(arr);
        return arr[1]; // Return the second smallest element
    }

    public static void main(String[] args) {
        int[] arr = {5, 3, 1, 4, 2};
        int secondSmallest = getSecondSmallest(arr);
        System.out.println("Second Smallest: " + secondSmallest);
    }
}
