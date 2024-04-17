package com.chainsys.day3;
import java.util.Scanner;

public class Login {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner ul = new Scanner(System.in);
		String name ;
		System.out.print("Enter your name : ");
		name = ul.nextLine();
		String password ;
		System.out.print("Enter your password : ");
		password =ul.nextLine();
		
		String logName ;
		System.out.print("Username : ");
		logName = ul.nextLine();
		String logPass ;
		System.out.print("Password : ");
		logPass = ul.nextLine();
		
		if(logName.equals(name) && logPass.equals(password)) {
			System.out.println("Login Successful !!");
		}
		else {
			System.out.println("Login Failed !!");
		}
		
		
		

	}

}
