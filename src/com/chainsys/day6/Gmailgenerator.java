package com.chainsys.day6;

import java.util.Random;

public class Gmailgenerator {

	public static void main(String[] args) {

		Random random = new Random();
		int userNameLength=8;
		StringBuilder usernameBuilder = new StringBuilder();
		String charName = "abcdefghijklmnopqrstuvwxyz";
		for (int l = 0; l < userNameLength; l++) {
			int randomIndex = random.nextInt(charName.length());
            char randomChar = charName.charAt(randomIndex);

			usernameBuilder.append(randomChar);
		}
		int userNumLength=4;
		StringBuilder usernumBuilder = new StringBuilder();
		String charNum = "0123456789";
		for (int n = 0; n < userNumLength ; n++) {
			int randomIndex = random.nextInt(charNum.length());
            char randomNum = charNum.charAt(randomIndex);
			usernumBuilder.append(randomNum);
		}
		
		String userName = usernameBuilder.toString();
		String userNumber = usernumBuilder.toString();

		String email = userName + userNumber + "@gmail.com";
		System.out.println(email);

	}

}
