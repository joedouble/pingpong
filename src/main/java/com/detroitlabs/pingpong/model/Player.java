package com.detroitlabs.pingpong.model;

public class Player {

    private String firstName;
    private String lastName;
    private String playerInfo;
    private int playerRanking;

    public Player(String firstName, String lastName, String playerInfo, int playerRanking) {
        this.firstName = firstName;
        this.lastName = lastName;
        this.playerInfo = playerInfo;
        this.playerRanking = playerRanking;
    }

    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public String getPlayerInfo() {
        return playerInfo;
    }

    public void setPlayerInfo(String playerInfo) {
        this.playerInfo = playerInfo;
    }

    public int getPlayerRanking() {
        return playerRanking;
    }

    public void setPlayerRanking(int playerRanking) {
        this.playerRanking = playerRanking;
    }
}
