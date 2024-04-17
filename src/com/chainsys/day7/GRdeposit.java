package com.chainsys.day7;

import java.util.Scanner;
import java.util.regex.Pattern;

public class GRdeposit {
	Bank bank = new Bank();
	public void getUserInfo() {
		Scanner grb = new Scanner(System.in);
		String accountName = "[a-zA-Z0-9]{3,16}" ;
		Pattern userNamePattern = Pattern.compile(accountName);

		System.out.println("Welocome to GR Bank !");
		String accountId;
		while(true) {
			System.out.print("Enter your log-in ID :");
			accountId = grb.next();
			if(accountId.matches(accountName)) {
				break;
			}
			System.out.println("Invalid Id");		
		}

		String accountPassword = "[a-zA-Z0-9@*#]{8,20}" ;
		Pattern userPassPattern = Pattern.compile(accountPassword);

		String accountPass;
		while(true) {
			System.out.print("Enter your pass :");
			accountPass = grb.next();
			if(accountPass.matches(accountPassword)) {
				break;
			}
			System.out.println("Invalid pass");
		}

		String username;
		while(true) {
			System.out.println("Account Name : ");
			username = grb.next();
			if(username.length() < 2 || username.isEmpty() ) {
				System.out.println("Invalid username");
			}else {
				bank.setUsername(username);
				break;
			}

		}
		String accNum ="[0-9]{8}";
		Pattern accUserPattern = Pattern.compile(accNum);
		
		String accountNum;
		while(true) {
			System.out.print("Account number :");
			accountNum = grb.next();
			if(accountNum.matches(accNum) ) {
				bank.setAccountNum(accountNum);
				break;
				
			}else {
				System.out.println("Invalid Account Number");
				;	
			}

		}
		String ifscNum;
		String ifscName = "[a-zA-Z0-9]{8}" ;
		Pattern ifscNamePattern = Pattern.compile(ifscName);

		while(true) {
			System.out.print("Account ifsc :");
			ifscNum = grb.next();
			if(ifscNum.matches(ifscName)) {
				bank.setIfscNum(ifscNum);
				break;
			}else {
				System.out.println("invalid ifsc");
			}
			
		}
}
	public void printInput() {
		System.out.println("");
		System.out.println("Deposit statement.");
		System.out.println("Account holder name : "+bank.getUsername());
		System.out.println("Account number : "+bank.getAccountNum());
		System.out.println("Your Ifsc Code : "+bank.getIfscNum());
	}
	public void deposit(int amount) {
		System.out.println(amount+" has deposited successfully ");
	}
	public void deposit(String ifscNum,String accountNum) {
		System.out.println("Your IFSC code is "+ifscNum+" for the account "+accountNum);
	}

}

