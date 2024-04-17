package com.chainsys.day5;

import java.util.Scanner;

public class AverageAndProduct {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int sum = 0;
        int count = 0;
        long product = 1;

        while (true) {
            System.out.print("Enter an integer or 'q' to quit : ");
            String input = scanner.next();

            if (input.equalsIgnoreCase("q")) {
                break;
            }

            try {
                int num = Integer.parseInt(input);
                sum += num;
                product *= num;
                count++;
            } catch (NumberFormatException e) {
                System.out.println("Invalid input. Please enter an integer or 'q' to quit.");
            }
        }

        if (count == 0) {
            System.out.println("No numbers entered.");
        } else {
            double average = (double) sum / count;
            System.out.println("Average: " + average);
            System.out.println("Product: " + product);
        }

        scanner.close();
    }
}
