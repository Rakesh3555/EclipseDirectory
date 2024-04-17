package com.chainsys.day8;


public class IPLTeam {
    private String teamName;
    private String captain;

    public IPLTeam(String teamName, String captain) {
        this.teamName = teamName;
        this.captain = captain;
    }

    public void displayTeamInfo() {
        System.out.println("Team Name: " + teamName);
        System.out.println("Captain: " + captain);
    }

    public void practice() {
        System.out.println(teamName + " is practicing for the upcoming match.");
    }
}
