package com.chainsys.day2;

import java.util.Scanner;

public class Bank {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String UserName;
		int AccountNumber;
		String IfscCode;
		Scanner sb = new Scanner(System.in);
		System.out.print("Enter your name :");
		UserName = sb.nextLine();
		System.out.print("Enter your Account Number :");
		AccountNumber = sb.nextInt();
		System.out.print("Enter your IFSC Code :");
		IfscCode = sb.next();
		System.out.print("Account Number for "+UserName+" is "+AccountNumber+" and the IFSC code is "+IfscCode);
		
		
		
		
	}

}
