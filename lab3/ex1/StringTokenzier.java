package com.deloitte.lab3.ex1;

import java.util.Scanner;
import java.util.StringTokenizer;

public class IntegerSum {
    public static void main(String[] args) {
        Scanner inputScanner = new Scanner(System.in);
        System.out.println("Enter a line of integers: ");
        String line = inputScanner.nextLine();

        StringTokenizer token = new StringTokenizer(line);
        int totalSum = 0;

        while (token.hasMoreTokens()) {
            int value = Integer.parseInt(token.nextToken());
            System.out.println(value);
            totalSum += value;
        }

        System.out.println("Sum of all integers: " + totalSum);
    }
}
