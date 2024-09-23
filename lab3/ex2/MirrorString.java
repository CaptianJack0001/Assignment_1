package com.deloitte.lab3.ex2;

import java.util.*;

public class MirrorStringExample {

    public static void main(String[] args) {
        Scanner inputScanner = new Scanner(System.in);
        System.out.println("Enter a String: ");
        String originalString = inputScanner.nextLine();

        StringBuffer mirroredBuffer = new StringBuffer(originalString);
        mirroredBuffer.reverse();

        System.out.println(originalString + " | " + mirroredBuffer.toString());
    }
}
