package com.chainsys.day8;

import java.util.Random;
import java.util.Scanner;

public class RanAccountGen {
    
    private Random random = new Random();
    private Scanner rag = new Scanner(System.in);

    public void getUserInfo(RanBank generate ) {
        System.out.println("Account Generation !");

        // Username validation
        String usernamePattern = "[a-zA-Z0-9]{4,12}";
        String username;
        while(true) {
            System.out.println("Enter your username: ");
            username = rag.next();
            if(username.matches(usernamePattern)) {
                generate.setUserName(username);
                break;
            } else {
                System.out.println("Invalid username! Username must be alphanumeric and 4-12 characters long.");
            }
        }

        // Phone number validation
        String phoneNumPattern = "[0-9]{10}";
        String phoneNumber;
        while(true) {
            System.out.println("Enter phone number: ");
            phoneNumber = rag.next();
            if(phoneNumber.matches(phoneNumPattern)) {
                generate.setPhoneNumber(phoneNumber);
                break;
            } else {
                System.out.println("Invalid phone number!");
            }
        }

        // Aadhar number validation
        String aadharNumPattern = "\\d{4}-\\d{4}-\\d{4}";
        String aadharNumber;
        while(true) {
            System.out.println("Enter Aadhar number: ");
            aadharNumber = rag.next();
            if(aadharNumber.matches(aadharNumPattern)) {
                generate.setAadharNumber(aadharNumber);
                break;
            } else {
                System.out.println("Invalid Aadhar number!");
            }
        }

        // Email validation
        String emailPattern = "[a-zA-Z0-9._%+-]+@[a-zA-Z0-9.-]+\\.[a-zA-Z]{2,}";
        String email;
        while(true) {
            System.out.println("Enter email: ");
            email = rag.next();
            if(email.matches(emailPattern)) {
                generate.setMailId(email);
                break;
            } else {
                System.out.println("Invalid email!");
            }
        }

        // Generate account number
        int accNumLength = 10;
        StringBuilder accountBuilder = new StringBuilder();
        String digits = "0123456789";
        for (int n = 0 ; n < accNumLength ; n++) {
            int randomIndex = random.nextInt(digits.length());
            char randomNum = digits.charAt(randomIndex);
            accountBuilder.append(randomNum);
        }
        String accountNumber = accountBuilder.toString();
        generate.setAccountNumber(accountNumber);
    }

    public void output(RanBank generate) {
        System.out.println("Username: " + generate.getUserName());
        System.out.println("Phone Number: " + generate.getPhoneNumber());
        System.out.println("Aadhar Number: " + generate.getAadharNumber());
        System.out.println("Mail Id: " + generate.getMailId());
        
    }

    public void outputGen(String userName, String phoneNumber) {
        System.out.println(userName + "'s phone number is " + phoneNumber);
    }

    public void outputGen(String accountNumber) {
        System.out.println(accountNumber + " is the generated account number");
    }
}
