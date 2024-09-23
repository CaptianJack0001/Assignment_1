package com.deloitte.lab9.ex2;

import java.util.function.Function;

public class StringFormatter {
    public static void main(String[] args) {
        Function<String, String> formatString = str -> String.join(" ", str.split(""));
        System.out.println(formatString.apply("CG"));
    }
}
