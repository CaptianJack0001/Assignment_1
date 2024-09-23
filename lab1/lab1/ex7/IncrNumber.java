package com.deloitte.lab1.ex7;

import java.util.*;

public class IncreasingNumberChecker {
    
    public static void main(String[] args) {
        Scanner inputScanner = new Scanner(System.in);
        
        // Prompt for user input
        System.out.print("Enter a number to check if its digits are in increasing order: ");
        int userInput = inputScanner.nextInt();
        
        // Call the checkIncreasingDigits function and store the result
        boolean isIncreasing = checkIncreasingDigits(userInput);
        System.out.println("Are the digits in increasing order? " + isIncreasing);
    }

    // Method to check if digits in the number are in increasing order
    public static boolean checkIncreasingDigits(int num) {
        int previousDigit = 9;  // Initialize with the largest possible digit

        while (num > 0) {
            int currentDigit = num % 10;  // Get the last digit
            if (currentDigit > previousDigit) {
                return false;  // Return false if digits are not in increasing order
            }
            previousDigit = currentDigit;  // Update previous digit to current
            num /= 10;  // Remove the last digit from the number
        }

        return true;  // Return true if digits are in increasing order
    }
}
