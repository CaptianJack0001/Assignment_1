package com.deloitte.lab3.ex8;

import java.util.Scanner;

public class IsPositiveString {

    public static boolean isPositiveString(String str) {
        if (str.isEmpty()) {
            System.out.println("Enter a valid String");
            return false; // Return false if the string is empty
        }

        for (int i = 1; i < str.length(); i++) {
            // Compare current character with the previous character
            if (str.charAt(i) <= str.charAt(i - 1)) {
                return false; // Return false if the order is not strictly increasing
            }
        }

        return true; // Return true if the string is positive
    }

    public static void main(String[] args) {
        Scanner scan1 = new Scanner(System.in);
        System.out.println("Enter A String to Check: ");
        String str1 = scan1.nextLine();

        System.out.println(str1 + " is positive: " + isPositiveString(str1));

        scan1.close(); // Close the scanner to prevent resource leaks
    }
}
