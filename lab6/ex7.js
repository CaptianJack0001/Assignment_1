package com.deloitte.lab7.ex7;

import java.util.Arrays;
import java.util.Collections;

public class ArrayReverser {
    public static int[] getSorted(int[] arr) {
        Integer[] reversedArray = new Integer[arr.length];

        for (int i = 0; i < arr.length; i++) {
            reversedArray[i] = arr[arr.length - 1 - i];
        }

        Arrays.sort(reversedArray);
        return Arrays.stream(reversedArray).mapToInt(Integer::intValue).toArray();
    }

    public static void main(String[] args) {
        int[] arr = {5, 3, 1, 4, 2};
        int[] sortedReversed = getSorted(arr);
        System.out.println("Sorted Reversed Array: " + Arrays.toString(sortedReversed));
    }
}
