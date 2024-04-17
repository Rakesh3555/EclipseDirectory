package com.chainsys.day3;
import java.util.Scanner;

public class CompanyBonus {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner cb = new Scanner(System.in);
		int Salary;
		System.out.print("Enter your salary : ");
		Salary = cb.nextInt();
		int Years;
		System.out.print("Enter your experience : ");
		Years = cb.nextInt();
		
		if(Years>5) {
			System.out.println("Bonus Available !!");
			
			double BonSalary = Salary*0.05;
		    BonSalary = BonSalary+Salary;
			
			System.out.println("Your salary before bonus :"+Salary);
			System.out.println("Your salary after bonus :"+BonSalary);
		}
		else {
			System.out.println("Your salary :"+Salary);
		}

	}

}
