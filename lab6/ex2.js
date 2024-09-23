package com.deloitte.lab3.ex2;

import java.util.HashMap;
import java.util.Map;

public class CharacterCounter {
    public static Map<Character, Integer> countChars(char[] arr) {
        Map<Character, Integer> charCount = new HashMap<>();
        for (char c : arr) {
            charCount.put(c, charCount.getOrDefault(c, 0) + 1);
        }
        return charCount;
    }

    public static void main(String[] args) {
        char[] arr = {'a', 'b', 'a', 'c', 'b', 'a'};
        Map<Character, Integer> result = countChars(arr);
        System.out.println("Character Counts: " + result);
    }
}
