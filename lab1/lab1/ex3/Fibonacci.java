package com.deloitte.lab1.ex3;

import java.util.Scanner;

public class Fibonacci {

    // Method to compute Fibonacci sequence using recursion
    public static int recursiveFibonacci(int num) {
        if (num <= 2) {
            return 1;
        } else {
            return recursiveFibonacci(num - 1) + recursiveFibonacci(num - 2);
        }
    }

    // Method to compute Fibonacci sequence using iteration
    public static int iterativeFibonacci(int num) {
        if (num <= 2) {
            return 1;
        }

        int firstPrev = 1;
        int secondPrev = 1;
        int currentValue = 0;

        for (int i = 3; i <= num; i++) {
            currentValue = firstPrev + secondPrev;
            firstPrev = secondPrev;
            secondPrev = currentValue;
        }

        return currentValue;
    }

    public static void main(String[] args) {
        Scanner userInput = new Scanner(System.in);

        System.out.print("Please enter the desired position (n): ");
        int userNum = userInput.nextInt();

        int resultRecursive = recursiveFibonacci(userNum);
        int resultIterative = iterativeFibonacci(userNum);

        System.out.println("Result using recursion: " + resultRecursive);
        System.out.println("Result using iteration: " + resultIterative);
    }
}
