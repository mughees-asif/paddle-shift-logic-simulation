package com.example.test;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        // main loop for determining paddle shift engagement
        while (true) {

            // instructional strings printed to console
            System.out.println("\nIs the paddle switch engaged? Press 'y' for YES or 'n' for NO: ");
            Scanner scanner = new Scanner(System.in);
            String inputString = scanner.nextLine();

            // conditional statement to determine UP_SHIFT or DOWN_SHIFT engagement
            if (inputString.equals("y")) {
                while (true) {
                    System.out.println("\nPlease press 'u' for UP_SHIFT or 'd' for DOWN_SHIFT");
                    System.out.println("\nPress 'u' or 'd' now: ");
                    Scanner scanner1 = new Scanner(System.in);
                    String inputString1 = scanner1.nextLine();

                    // conditional for exceptions check
                    if (inputString1.equals("u") || inputString1.equals("d")) {
                        System.out.println("\nEngaging Clutch...");

                        // exceptions check
                        try {
                            int timer = 0;

                            // loop for delay
                            while (timer < 3000) {
                                Thread.sleep(1000);
                                System.out.println("Servo is preparing to run");
                                timer = timer + 1000;
                            }
                        } catch (Exception ignored) {

                        }

                        // conditional for UP_SHIFT or DOWN_SHIFT signal
                        if (inputString1.equals("u")) {
                            System.out.println("\nUP_SHIFT signal for solenoid");
                        } else {
                            System.out.println("\nDOWN_SHIFT signal for solenoid");
                        }
                    } else {
                        System.out.println("Enter 'u' or 'd' keys to engage the clutch...\n");
                    }
                }

                // keeps looping if the paddle switch is not engaged
            } else {
                System.out.println("The paddle switch must be engaged before shifting.");

                // exceptions check
                try {
                    int timer = 0;
                    // loop for delay before rechecking paddle switch engagement
                    while (timer < 600) {
                        Thread.sleep(200);
                        System.out.println("Checking paddle switch...");
                        timer = timer + 250;
                    }
                } catch (Exception ignored) {

                }
            }
        }
    }
}