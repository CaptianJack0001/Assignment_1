package com.deloitte.lab1.ex8;
import java.util.*;

public class CheckPowerOfTwo {
    
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Prompt user to input a number
        System.out.print("Enter a number to check if it's a power of two: ");
        int userInput = scanner.nextInt();

        // Call the function to check if the number is a power of two and store the result
        boolean isPower = verifyPowerOfTwo(userInput);
        System.out.println("Is the number a power of two? " + isPower);
    }

    // Method to check if the number is a power of two
    public static boolean verifyPowerOfTwo(int num) {
        if (num <= 0) {
            return false; // Numbers <= 0 cannot be a power of two
        }

        // Check if number is a power of two using bitwise AND operation
        return (num & (num - 1)) == 0;  // Power of two numbers have only one bit set
    }
}
