package com.chainsys.day3;
import java.util.Scanner;
public class QueAns {

	public static void main(String[] args) {
		 Scanner qa = new Scanner(System.in);
	        System.out.println("Is it raining ?");
	        String userInput ;
	        System.out.println("Y or N :");
	        userInput = qa.next();
	        


	        if(userInput.equalsIgnoreCase("Y")){
	            System.out.println("Get and umberla");
	        }
	        else if (userInput.equalsIgnoreCase("N")){
	            System.out.println("Its not raining , You dont need and umberla ! ");
	        }
	        
	        double temp ;
	        System.out.println("Whats the temperature ? ");
	        temp = qa.nextDouble();
	        
	        if (temp < 32 ) {
	            System.out.println("Bring heavy jacket its "+temp+" degrees out there.");
	        }
	        else if (temp > 32 || temp <= 50) {
	            System.out.println("Bring light jacket its "+temp+" degrees out there.");
	        }
	        else if (temp > 51){
	            System.out.println("No jacket at all");
	        }
	        else {
	            System.out.println("Invalid input !! ");
	        }
	    }
	   }