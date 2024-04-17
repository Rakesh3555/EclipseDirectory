package com.chainsys.day8;

public class Bcci {

	public static void main(String[] args) {

		MumbaiIndians mi = new MumbaiIndians("Rohit Sharma", "Wankhede Stadium");
		mi.displayTeamInfo();
		mi.practice();
		mi.cheer();

		System.out.println();


		ChennaiSuperKings csk = new ChennaiSuperKings("MS Dhoni", "Stephen Fleming");
		csk.displayTeamInfo();
		csk.practice();
		csk.whistlePodu();
	}
}


