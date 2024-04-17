package com.chainsys.day3;
import java.util.Scanner;

public class ShopDiscount {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int Quantity;
		Scanner sd = new Scanner(System.in);
		System.out.println("Bill");
		System.out.print("Enter Your quantity :");
		Quantity = sd.nextInt();
		
		if(Quantity != 0 || Quantity < 0) {
			System.out.println("Enter valid quantity");
			System.out.print("Enter Your quantity :");
			Quantity = sd.nextInt();
			
		}
		double OneUnit = 100 ;
		double Totalunit= Quantity*OneUnit;
		
		System.out.println("Your Amount : "+Totalunit);
		
		if(Totalunit>1000) {
		System.out.println("You have 10% discount !!");
		
		double Discount = 0.10*Totalunit;
		double FinalDiscount = Totalunit-Discount;
		System.out.println("Your price after appling discount "+FinalDiscount);
		}
		else {
			System.out.println("Your Price is "+Totalunit+" no discount applyed.");
		}
		
		
		
		

	}

}
