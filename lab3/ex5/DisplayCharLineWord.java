package com.deloitte.lab3.ex5;

import java.util.Scanner;

public class DisplayCharLineWord {
    public static void main(String[] args) {
        Scanner inputScanner = new Scanner(System.in);
        System.out.println("Enter a String to Check: ");
        String inputString = inputScanner.nextLine();

        StringBuilder stringBuilder = new StringBuilder(inputString);

        int characterCount = stringBuilder.length();
        int wordCount = 0;
        int lineCount = 1; // Assuming the input starts with a line

        for (int i = 0; i < stringBuilder.length(); i++) {
            char currentChar = stringBuilder.charAt(i);

            if (Character.isWhitespace(currentChar)) {
                if (i > 0 && !Character.isWhitespace(stringBuilder.charAt(i - 1))) {
                    wordCount++; // Count word only if it's preceded by a non-whitespace
                }
            } else if (i == stringBuilder.length() - 1) {
                wordCount++; // Count the last word if it doesn't end with a space
            }

            if (currentChar == '\n') {
                lineCount++;
            }
        }

        System.out.println("Character count: " + characterCount);
        System.out.println("Word count: " + wordCount);
        System.out.println("Line count: " + lineCount);

        inputScanner.close();
    }
}
