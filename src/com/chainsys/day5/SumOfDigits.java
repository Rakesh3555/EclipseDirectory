package com.chainsys.day5;
import java.util.*;
public class SumOfDigits {

		    public static int sumOfDigits(int number) {
		        
		        int digitSum = 0;
		        
		        
		        while (number != 0) {
		            
		            int digit = number % 10;
		            
		            digitSum += digit;
		           
		            
		            number /= 10;
		        }
		        
		        
		        return digitSum;
		    }
		    
		    public static void main(String[] args) {
		       
		        Scanner scanner = new Scanner(System.in);
		        
		        
		        System.out.print("Enter a number: ");
		        int userNumber = scanner.nextInt();
		        
		       
		        int result = sumOfDigits(userNumber);
		        
		        
		        System.out.println("Sum of digits: " + result);
		        
		        
		        scanner.close();


		    }
		

	}


