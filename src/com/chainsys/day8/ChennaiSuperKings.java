package com.chainsys.day8;


public class ChennaiSuperKings extends IPLTeam {
	private String coach;

	public ChennaiSuperKings(String captain, String coach) {
		super("Chennai Super Kings", captain);
		this.coach = coach;
	}


	public void displayTeamInfo() {
		super.displayTeamInfo();
		System.out.println("Coach: " + coach);
	}


	public void practice() {
		System.out.println("Chennai Super Kings is having a net session with " + coach);
	}

	public void whistlePodu() {
		System.out.println("Whistle Podu! Chennai Super Kings!");
	}
}
