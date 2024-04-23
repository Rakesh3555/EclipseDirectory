package com.chainsys.day9;

import java.util.Scanner;

public class Match {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner mo = new Scanner(System.in);
		System.out.println("Matrimony");
		UserInOne gm = new UserInOne();
		UserInTwo bm = new UserInTwo();
		gm.Name();
		gm.Age();
		gm.Work();
		gm.Location();
		System.out.println("Do you wanna update ur profile ? Y / N ");
		char upDate = mo.next().charAt(0);
		if(upDate == 'Y' || upDate == 'y') {
			System.out.println("Profile Updated");
			gm.displayDetails();
			System.out.println("\nDo you wanna share your profile to others ? Y /N");
			char shAre = mo.next().charAt(0);
			if(shAre == 'Y' || shAre == 'y') {
				System.out.println("Profile shared !!");
				System.out.println("Are you intrested in this profile ? Y/N");
				char intRest = mo.next().charAt(0);
				if(intRest == 'Y'|| intRest == 'y') {
					System.out.println("Do you wanna share your profile ? Y/N");
					char proShare = mo.next().charAt(0);
					if(proShare == 'Y'|| proShare == 'y') {
						bm.Name();
						bm.Age();
						bm.Work();
						bm.Location();
						System.out.println("Do you wanna share ? Y / N");
						char secShare = mo.next().charAt(0);
						if(secShare == 'Y' || secShare == 'y') {
							System.out.println("Profile shared !!");
						}else if ( secShare == 'N' || secShare == 'n')
							System.out.println("Profile not shared !!");
						}else {
							System.out.println("invalid input ");
					}
				}
			}else if(shAre == 'N' || shAre == 'n') {
				System.out.println("Profile will not be shared !!");
			}else {
				System.out.println("Invalid Input");
			}
		}else if(upDate == 'N'||upDate =='n'){
			System.out.println("Profile Not Updated");
		}else {
			System.out.println("Invalid entry");
			
		}
	}

}
