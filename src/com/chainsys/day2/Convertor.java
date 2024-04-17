package com.chainsys.day2;
import java.util.Scanner;
public class Convertor {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		double num1 ;
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Enter numbers :");
		
		num1 = sc.nextDouble();
		
		System.out.println("Enter conventions\n1. MB to GB\n2. GB to MB\n3. Cm to M");
		char op = sc.next().charAt(0);
		double result = 0;
        switch (op) {
            case '1':
            	result = num1/1000;
            	break;
            case '2':
            	result = num1*1000;
            	break;
            case '3':
            	result = num1/100;
            	break;
        }

        System.out.println("The final result: "+result);
	}

}
