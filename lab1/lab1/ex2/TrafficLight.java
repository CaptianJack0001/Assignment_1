package com.deloitte.lab1.ex2;

import java.util.*;

public class TrafficLight {

    public static void main(String[] args) {
        Scanner inputScanner = new Scanner(System.in);

        // Display traffic light options to the user
        System.out.println("****Traffic Light Simulator****");
        System.out.println("1) Red Light");
        System.out.println("2) Yellow Light");
        System.out.println("3) Green Light\n");
        System.out.print("Select the current light: ");

        int userChoice = inputScanner.nextInt();

        // Perform actions based on the user's choice
        switch (userChoice) {
            case 1:
                System.out.println("You must STOP");
                break;
            case 2:
                System.out.println("Get READY to move");
                break;
            case 3:
                System.out.println("You can GO");
                break;
            default:
                System.out.println("Invalid choice! Please select 1, 2, or 3.");
        }
    }

}
