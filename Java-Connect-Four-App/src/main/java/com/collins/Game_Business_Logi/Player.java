package com.collins.Game_Business_Logi;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

public class Player {
  private String playerName;
  private Player_Disc_Color player_disc_color;
  private boolean isHuman;
  private int NumberOfWinningGames;

  public Player() {
    this.playerName = "Machine";
    this.isHuman = false;
    this.player_disc_color = Player_Disc_Color.BLACK;
  }

}
