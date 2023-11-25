package com.collins.Game_Business_Logi;

public class Player {
  private String playerName;
  private DiscColor discColor;
  private boolean isHuman;
  private int numberOfWinningGames;

  public Player() {
    this.playerName = "Machine";
    this.isHuman = false;
    this.discColor = DiscColor.BLACK;
  }

  public Player(String playerName) {
    this.playerName = playerName;
    this.discColor = DiscColor.RED;
    this.isHuman = true;
    this.numberOfWinningGames = 0;
  }
}
