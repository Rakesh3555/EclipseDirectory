package com.chainsys.day3;
import java.util.Scanner;

public class UserInfo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner ui = new Scanner(System.in);
		String Name ;
		System.out.print("Enter your name : ");
		Name = ui.next();
		int age;
		System.out.print("Enter your age : ");
		age = ui.nextInt();
		
		
		System.out.print("Enter Marital status :");
		char marital = ui.next().charAt(0);
		if(marital != 'Y' || marital != 'N' ) {
			System.out.println("Enter valid input !");
			System.out.println("Enter Marital status : ");
			marital = ui.next().charAt(0);
		}
		
		System.out.println("Choose your gender m or f : ");
		char gender = ui.next().charAt(0);
		if(gender != 'M' || gender != 'm' || gender != 'F' || gender != 'f') {
			System.out.println("Enter valid gender ! ");
			System.out.println("Choose your gender m or f : ");
			gender = ui.next().charAt(0);
		}
		
		if(gender == 'M'|| gender == 'm' && age >= 20 && age <= 40){
			System.out.println(Name+" you may work in any areas");
		}
		
		else if(gender == 'M'|| gender == 'm' && age >= 41 && age <=60 ) {
			System.out.println(Name+" you will be only work in urban areas.");
		}
		
		else if(gender == 'F' || gender == 'f') {
			System.out.println(Name+" you will work in urban areas.");
		}
		
		else {
			System.out.println("Invalid input!");
		}
		
	}

}
