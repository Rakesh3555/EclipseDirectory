package com.chainsys.day3;
import java.util.Scanner;
public class EvenDigits {

	public static void main(String[] args) {
		      Scanner ed = new Scanner(System.in);
		      long num ;
		      System.out.println("Enter the number : ");
		      num = ed.nextLong();

		      while (num != 0){
		          long digit = num % 10 ;
		          if(digit % 2 == 0){
		              System.out.print(digit+"");
		          }
		          num /=10;

		      }
		        System.out.println();
		    }

		}