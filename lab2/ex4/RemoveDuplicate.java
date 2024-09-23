package com.deloitte.lab2.ex4;

import java.util.Arrays;
import java.util.HashSet;

public class ArrayModifier {

    public static void main(String[] args) {
        int[] inputArray = {4, 2, 5, 3, 1, 4, 2, 5};
        int[] modifiedArray = modifyArray(inputArray);
        System.out.println(Arrays.toString(modifiedArray));
    }

    public static int[] modifyArray(int[] arr) {
        // Use a HashSet to remove duplicates
        HashSet<Integer> uniqueElements = new HashSet<>();
        for (int num : arr) {
            uniqueElements.add(num);
        }

        // Convert the HashSet back to an array
        int[] resultArray = new int[uniqueElements.size()];
        int index = 0;
        for (int num : uniqueElements) {
            resultArray[index++] = num;
        }

        // Sort the array in descending order
        Arrays.sort(resultArray);
        for (int i = 0; i < resultArray.length / 2; i++) {
            int temp = resultArray[i];
            resultArray[i] = resultArray[resultArray.length - 1 - i];
            resultArray[resultArray.length - 1 - i] = temp;
        }

        return resultArray;
    }
}
