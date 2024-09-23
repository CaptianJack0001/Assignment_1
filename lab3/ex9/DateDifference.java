package com.deloitte.lab3.ex9;

import java.util.Scanner;
import java.time.LocalDate;
import java.time.Period;

public class DateDifference {

    public static void printDuration(LocalDate inputDate) {
        LocalDate currentDate = LocalDate.now();
        Period period = Period.between(inputDate, currentDate);

        int years = period.getYears();
        int months = period.getMonths();
        int days = period.getDays();

        System.out.println("Duration: " + years + " years, " + months + " months, " + days + " days");
    }

    public static void main(String[] args) {
        Scanner scan1 = new Scanner(System.in);
        System.out.println("Enter a date (YYYY-MM-DD): ");
        String input = scan1.nextLine();
        
        // Parse the input string to LocalDate
        LocalDate inputDate = LocalDate.parse(input);
        
        printDuration(inputDate);

        scan1.close(); // Close the scanner to prevent resource leaks
    }
}
