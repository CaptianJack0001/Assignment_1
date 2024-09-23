package com.deloitte.lab9.ex5;

import java.util.function.IntUnaryOperator;

public class FactorialCalculator {
    public static void main(String[] args) {
        IntUnaryOperator factorial = FactorialCalculator::factorial;
        System.out.println("Factorial of 5: " + factorial.applyAsInt(5));
    }

    public static int factorial(int n) {
        if (n == 0) return 1;
        return n * factorial(n - 1);
    }
}
