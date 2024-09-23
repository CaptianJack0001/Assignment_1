package com.deloitte.lab2.ex3;

import java.util.Arrays;

public class ReverseSortArray {

    // Function to reverse digits of a given number
    public static int reverseDigits(int num) {
        int reversed = 0;
        while (num != 0) {
            int digit = num % 10;
            reversed = reversed * 10 + digit;
            num /= 10;
        }
        return reversed;
    }

    public static int[] reverseSort(int[] arr) {
        // Reverse the digits of each number
        for (int i = 0; i < arr.length; i++) {
            arr[i] = reverseDigits(arr[i]);
        }

        // Sort the array
        Arrays.sort(arr);

        return arr;
    }

    public static void main(String[] args) {
        int[] arr = {123, 456, 789, 987, 654, 321};
        int[] result = reverseSort(arr);
        System.out.println(Arrays.toString(result));
    }
}
