package com.collins.Game_Business_Logi;

import java.util.ArrayList;
import java.util.*;

public class GameBoard {
  List<List<Integer>> table = new ArrayList<>();
  List<Player> Players = new ArrayList<>(2);

  public GameBoard() {

  }

  public List<List<Integer>> getTable() {
    return table;
  }

  public List<Player> getPlayers() {
    return Players;
  }
}
