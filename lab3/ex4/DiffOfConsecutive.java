package com.deloitte.lab3.ex4;

import java.util.Scanner;

public class DiffOfConsecutive {
    public static void main(String[] args) {
        Scanner inputScanner = new Scanner(System.in);
        System.out.print("Enter a number: ");
        int inputNumber = inputScanner.nextInt();

        String numberString = Integer.toString(inputNumber);
        StringBuilder resultBuilder = new StringBuilder();

        for (int i = 1; i < numberString.length(); i++) {
            int difference = Math.abs(Character.getNumericValue(numberString.charAt(i)) - Character.getNumericValue(numberString.charAt(i - 1)));
            resultBuilder.append(difference);
        }

        // Append the last digit as is
        resultBuilder.append(numberString.charAt(numberString.length() - 1));

        int modifiedResult = Integer.parseInt(resultBuilder.toString());
        System.out.println("Modified number: " + modifiedResult);
    }
}
