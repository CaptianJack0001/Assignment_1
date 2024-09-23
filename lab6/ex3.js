package com.deloitte.lab7.ex3;

import java.util.HashMap;
import java.util.Map;

public class SquareCalculator {
    public static Map<Integer, Integer> getSquares(int[] numbers) {
        Map<Integer, Integer> squaresMap = new HashMap<>();
        for (int number : numbers) {
            squaresMap.put(number, number * number);
        }
        return squaresMap;
    }

    public static void main(String[] args) {
        int[] numbers = {1, 2, 3, 4, 5};
        Map<Integer, Integer> result = getSquares(numbers);
        System.out.println("Squares: " + result);
    }
}
