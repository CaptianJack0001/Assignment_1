package com.deloitte.lab3.ex3;

import java.util.*;

public class ReplaceToConsonant {

    public static void main(String[] args) {
        Scanner inputScanner = new Scanner(System.in);
        System.out.println("Enter a String to Check: ");
        String userInput = inputScanner.nextLine();
        
        System.out.println("Original String: ");
        System.out.println(userInput);
        System.out.println("Altered String: ");
        System.out.println(alterString(userInput));
    }

    private static String alterString(String inputString) {
        char[] charArray = inputString.toCharArray();
        for (int i = 0; i < charArray.length; i++) {
            char currentChar = charArray[i];
            
            if (Character.isLetter(currentChar) && !isVowel(currentChar)) {
                charArray[i] = (char)(currentChar + 1);
            }
        }
        return new String(charArray);
    }

    private static boolean isVowel(char character) {
        character = Character.toLowerCase(character);
        return character == 'a' || character == 'e' || character == 'i' || character == 'o' || character == 'u';
    }
}
