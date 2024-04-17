package com.chainsys.day8;

public class MumbaiIndians extends IPLTeam {
	private String homeGround;

	public MumbaiIndians(String captain, String homeGround) {
		super("Mumbai Indians", captain);
		this.homeGround = homeGround;
	}


	public void displayTeamInfo() {
		super.displayTeamInfo();
		System.out.println("Home Ground: " + homeGround);
	}

	
	public void practice() {
		System.out.println("Mumbai Indians is practicing hard at " + homeGround);
	}

	public void cheer() {
		System.out.println("Mumbai Indians fans are cheering loudly!");
	}
}
