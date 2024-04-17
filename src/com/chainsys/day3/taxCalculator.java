package com.chainsys.day3;
import java.util.Scanner;

public class taxCalculator {

	public static void main(String[] args) {
		Scanner tc = new Scanner(System.in);

	    double grossSalary ;
	    
	    System.out.println("Enter your gross Salary : ");
	    grossSalary = tc.nextFloat();
	    if(grossSalary > 0) {
	    	
	    

	    double totalSavings ;
	    System.out.println("Enter your total savings : ");
	    totalSavings = tc.nextFloat();

	    double taxableincome = grossSalary-totalSavings ;
	    System.out.println("Taxable Income :"+taxableincome);

	    if(taxableincome <= 100000){
	        System.out.println("Taxable income is zero !");
	    }
	    else if(taxableincome > 100000 && taxableincome < 200000 ){
	        System.out.println("Taxable Income is 10 % ");
	        double slab1 = taxableincome*0.01;
	        double applyedTax1 = taxableincome-slab1;
	        System.out.println("Income after applying 10 % is "+applyedTax1);
	    } else if (taxableincome > 200000 && taxableincome <= 500000 ) {
	        System.out.println("Taxable income is 20 % ");
	        double slab2 = taxableincome*0.02;
	        double applyedTax2 = taxableincome-slab2;
	        System.out.println("Income after applying 20 % tax is "+applyedTax2);
	    } else if (taxableincome >= 500001) {
	        System.out.println("Taxable income is 30 % ");
	        double slab3 = taxableincome*0.03;
	        double applyedTax3 = taxableincome-slab3;
	        System.out.println("Income after applying 30 % tax is "+applyedTax3);
	    }else{
	        System.out.println("Invalid entry !!");
	    }
	    }else {
	    	System.out.println("Enter the correct amount !");
	    	
	    }
	    }
	}