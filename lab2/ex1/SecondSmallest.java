package com.deloitte.lab2.ex1;

import java.util.Arrays;
import java.util.Scanner;

public class SecondSmallest {

    public static void main(String[] args) {
        Scanner scan1 = new Scanner(System.in);
        System.out.print("Enter the size of Array: ");
        int number = scan1.nextInt();
        
        if (number < 2) {
            System.out.println("Array Size should be greater than 1 to find the second smallest element.");
            return;
        }
        
        int array1[] = new int[number];
        System.out.println("\nEnter Array Elements: ");

        for (int i = 0; i < array1.length; i++) {
            array1[i] = scan1.nextInt();
        }

        int secondSmallest = getSecondSmallest(array1); // Call the function
        
        if (secondSmallest != Integer.MAX_VALUE) {
            System.out.println("Second Smallest element is : " + secondSmallest);
        } else {
            System.out.println("No second distinct smallest element found.");
        }
        
        scan1.close(); // Close the scanner to prevent resource leaks
    }

    // Function to get the second smallest element
    public static int getSecondSmallest(int[] array1) {
        if (array1 == null || array1.length < 2) {
            return Integer.MAX_VALUE; // Return max value for invalid input
        }

        Arrays.sort(array1); // Sort the array
        
        int smallest = array1[0];
        
        // Loop through to find the second smallest distinct element
        for (int i = 1; i < array1.length; i++) {
            if (array1[i] > smallest) {
                return array1[i]; // Return the second distinct smallest element
            }
        }
        
        return Integer.MAX_VALUE; // Return max value if no second smallest found
    }
}
