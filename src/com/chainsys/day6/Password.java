package com.chainsys.day6;

import java.util.Random;

public class Password {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Random rand = new Random();
		
		int passNum = rand.nextInt();
		System.out.println("Your password : "+passNum);
		
		String words = "abcdefghijklmnopqrstuvwxyz";
		for(int i = 0 ; i < 16 ;i++) {
			System.out.print(words.charAt(rand.nextInt(words.length())));
		}
		
		//System.out.print(random);
		
		
		
		
		}
	
	
				
	}


