package com.chainsys.day3;
import java.util.Scanner;

public class StudAttend {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sa = new Scanner(System.in);
		
		float NumClass ;
		float NumClassAt ;
		
		System.out.print("Enter number of Class : ");
		NumClass = sa.nextInt();
		System.out.print("Enter number of classes attended : ");
		NumClassAt = sa.nextInt();
		
		float Percentage = (NumClassAt/NumClass)*100;
		System.out.println("Percentage of class attended : "+Percentage);
		
	
		
		if(Percentage>75) {
			System.out.println("You will be allowed to sit in exam !");
		}
		else {
			System.out.println("You will not be allowed to sit in exam !");
			System.out.println("Do you have medical condition ?");
			char Med = sa.next().charAt(0);
			
			if(Med == 'Y' || Med == 'y') {
				System.out.println("You will be allowed to sit for exam ! ");
			}
			else if(Med == 'N' || Med == 'n') {
				System.out.println("You will not be allowed to sit for exam ! ");
			}
			else {
				System.out.println(" Input error ! ");		
		}
		}
			
		}
		
		
		
}
