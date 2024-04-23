package com.chainsys.day9;

import java.util.Scanner;

public class UserInOne implements Matrimony {

    Scanner mg = new Scanner(System.in);
    String name;
    int age;
    String work;
    String location;

    @Override
    public void Name() {
        String valName = "[a-zA-Z]{3,16}";
        while (true) {
            System.out.println("Enter your name : ");
            name = mg.next();
            if (name.matches(valName)) {
                break;
            } else {
                System.out.println("Invalid entry");
            }
        }
    }

    @Override
    public void Age() {
        while (true) {
            System.out.println("Enter age (age should be above 22) : ");
            age = mg.nextInt();
            if (age > 22) {
                break;
            } else {
                System.out.println("Invalid age");
            }
        }
    }

    @Override
    public void Work() {
        String valWork = "[a-zA-Z]{3,16}";
        while (true) {
            System.out.println("Enter your field of work (if not nill) : ");
            work = mg.next();
            if (work.matches(valWork)) {
                break;
            } else {
                System.out.println("Invalid entry");
            }
        }
    }

    @Override
    public void Location() {
        String valLocation = "[a-zA-Z]{3,16}";
        while (true) {
            System.out.println("Enter your location : ");
            location = mg.next();
            if (location.matches(valLocation)) {
                break;
            } else {
                System.out.println("Invalid entry");
            }
        }
    }

    @Override
    public void displayDetails() {
        System.out.println("Name: " + name);
        System.out.println("Age: " + age);
        System.out.println("Field of Work: " + work);
        System.out.println("Location: " + location);
    }
}
