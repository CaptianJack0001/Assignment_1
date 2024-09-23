package com.deloitte.lab1.ex1; 
import java.util.*;

public class SumOfCubes {

    // Method to calculate the cube sum of digits of a number
    public static int cubeSumOfDigits(int inputNum) {
        int totalSum = 0;
        while (inputNum != 0) {
            int currentDigit = inputNum % 10;
            totalSum += Math.pow(currentDigit, 3); // Cube calculation using Math.pow
            inputNum /= 10;
        }
        return totalSum;
    }

    public static void main(String[] args) {
        // Prompting user for input
        System.out.print("Enter a number with any number of digits: ");
        Scanner sc = new Scanner(System.in);
        int userInput = sc.nextInt();

        // Compute the cube sum of digits
        int resultSum = cubeSumOfDigits(userInput);
        System.out.println("The total sum of cubes of the digits is: " + resultSum);
    }
}
