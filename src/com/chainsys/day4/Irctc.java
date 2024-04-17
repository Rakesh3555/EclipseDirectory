package com.chainsys.day4;
import java.util.*;
import java.util.regex.*;

public class Irctc {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner ir = new Scanner(System.in);
		
		String userName = "[a-zA-Z_]{3,16}" ;
		Pattern userNamePattern = Pattern.compile(userName);
		
		String pass = "[a-zA-Z0-9@*#]{8,20}" ;
		Pattern userPassPattern = Pattern.compile(pass);
		
		String irctcId = "[a-zA-Z0-9_]{3,16}" ;
		Pattern userIrctcId = Pattern.compile(irctcId);
	
		String gmailId = "[a-z0-9_.@]{3,20}";
		Pattern usermailIdPattern = Pattern.compile(gmailId);
		
		String travelPlace = "[a-zA-Z]{3,16}" ;
		Pattern travelPlacePattern = Pattern.compile(travelPlace);
		
		String travelTicket = "[a-zA-Z]{3,16}" ;
		Pattern travelTicketPattern = Pattern.compile(travelTicket);
		
		String otp = "[0-9]{4}";
		Pattern userOtp = Pattern.compile(otp);
		
		
		System.out.println("IRCTC RAILWAY LOGIN PORTAL !!");
		String name ;
		while(true) {
		System.out.println("Enter Username : ");
		name = ir.nextLine();
		if(name.matches(userName)) {
			break;
		}
			System.out.println("Invalid !! Only use 'A-Z,a-z,' ");
		}
		
		String passWord ;
		while(true) {
		System.out.println("Enter Password : ");
		passWord = ir.next();
		if(passWord.matches(pass)) {
			break;
		}
		System.out.println("Invalid !! Only use 'a-z , 0-9 , _ ,., @' ");
		}
		
		String userIrctclog ;
		while(true) {
		System.out.println("Enter IRCTC ID : ");
		userIrctclog = ir.next();
		if(userIrctclog.matches(irctcId)) {
			break;
		}
			System.out.println("Invalid !! Only use 'a-zA-Z0-9_' ");
		}
		
		String irctcMail ;
		while(true) {
			System.out.println("Enter MailId :");
			irctcMail = ir.next();
			if(irctcMail.matches(gmailId)) {
				break;
			}
				System.out.println("Invalid !! Only use 'a-z0-9_.@' ");
			
		}
		
		String logOtp ;
		while(true) {
			System.out.println("Enter otp you have recived in your mail :");
			logOtp = ir.next();
			if(logOtp.matches(otp)) {
				break;
			}
			System.out.println("Invalid Otp ");
		}
		
		System.out.println("You are sucessfully logged into your account : ) ");
		
		System.out.println(" Book Your Ticket ! ");
		
		String fromPlace ;
		System.out.println("Enter your boarding place :");
		fromPlace = ir.next();
		
		String toPlace ;
		System.out.println("Enter your departure place :");
		toPlace = ir.next();
		
		int ticket ;
		System.out.println("Enter number of Passengers :");
		ticket = ir.nextInt();
		
		int adult ,  child ;
		System.out.println("Enter no. of adult passengers : ");
		adult = ir.nextInt();
		System.out.println("Enter no.of children passengers :");
		child =ir.nextInt();
		
		
		ticket = adult + child; 
		float priceAmount =  ticket * 120;
		System.out.println("Your total amount :"+priceAmount);
		
		System.out.println(name+" your ticket from "+fromPlace+" to "+toPlace+"  for adult "+adult+" and child "+child+" total of "+ticket+" has booked successfully ");
		
	}
	
	   
		
	
	

}
