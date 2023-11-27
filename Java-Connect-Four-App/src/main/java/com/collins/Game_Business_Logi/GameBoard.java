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

  public boolean checkWinnersHorizontally (int playerCard) {
    int index = 0;
    int winnerCount = 0;

    for (List<Integer> row = table.get(index); index < table.size(); ++index) {
      for (int boxValue : row) {
        winnerCount = boxValue == playerCard ? ++winnerCount : 0;
        if (winnerCount == (playerCard * 4)) return true;
      }
    }

    return false;
  }

  @Override
  public String toString() {
    return "GameBoard{" +
            "table=" + table +
            ", Players=" + Players +
            '}';
  }
}
