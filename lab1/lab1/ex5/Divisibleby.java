package com.deloitte.lab1.ex5;
import java.util.*;

public class DivisibleBy {

    public static void main(String[] args) {
        Scanner inputScanner = new Scanner(System.in);

        // Prompt for user input
        System.out.print("Enter the value of the upper limit: ");
        int upperLimit = inputScanner.nextInt();

        // Calculate the sum using the alternate method
        int finalSum = computeDivisibleSum(upperLimit);
        System.out.println("Sum of numbers divisible by 3 or 5 up to " + upperLimit + " is: " + finalSum);
    }

    // Alternate logic for summing numbers divisible by 3 or 5
    public static int computeDivisibleSum(int limit) {
        int totalSum = 0;
        for (int num = 3; num <= limit; num += 3) { // Increment by 3 to reduce iteration
            totalSum += num;
        }
        for (int num = 5; num <= limit; num += 5) { // Increment by 5 to avoid unnecessary checks
            if (num % 3 != 0) { // Avoid double-counting numbers divisible by both 3 and 5
                totalSum += num;
            }
        }
        return totalSum;
    }
}
