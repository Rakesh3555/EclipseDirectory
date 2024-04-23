package com.chainsys.day9;
import java.util.*;

public class Girl implements Matrimony {

	Scanner mg = new Scanner(System.in) ;

	public void name() {
		// TODO Auto-generated method stub
		String valName = "[a-zA-Z]{3,16}";
		String name;
		while(true) {
			System.out.println("Enter your name : ");
			name = mg.next();
			if(name.matches(valName)) {
				break;
			}else {
			System.out.println("Invalid entry");
		}			
	  }
	}

	
	public void age() {
		// TODO Auto-generated method stub
		System.out.println("22");
		
	}


	public void work() {
		// TODO Auto-generated method stub
		System.out.println("HCL");
		
	}

	public void Location() {
		// TODO Auto-generated method stub
		System.out.println("Madurai");
		
	}

}
