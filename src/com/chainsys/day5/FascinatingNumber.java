package com.chainsys.day5;

import java.util.Scanner;

public class FascinatingNumber {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

       
        System.out.print("Enter a number: ");
        int num = scanner.nextInt();

               String concatenated = Integer.toString(num) + Integer.toString(num * 2) + Integer.toString(num * 3);

        
        boolean isFascinating = isPandigital(concatenated);

                if (isFascinating) {
            System.out.println(num + " is a fascinating number.");
        } else {
            System.out.println(num + " is not a fascinating number.");
        }

        scanner.close();
    }

    
    public static boolean isPandigital(String str) {
        if (str.length() != 9) {
            return false;
        }

        for (char c = '1'; c <= '9'; c++) {
            if (str.indexOf(c) == -1) {
                return false;
            }
        }

        return true;
    }
}

