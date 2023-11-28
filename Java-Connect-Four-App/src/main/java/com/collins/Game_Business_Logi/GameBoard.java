package com.collins.Game_Business_Logi;

import java.util.ArrayList;
import java.util.*;

public class GameBoard {
  List<List<Integer>> table;
  List<Player> players;


  public GameBoard() {
    table = new ArrayList<>(2);
  }

  public List<List<Integer>> getTable() {
    return table;
  }

  public List<Player> getPlayers() {
    return players;
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

  public boolean checkWinnersVertically (int playerCard) {
    int winnerCount = 0;

    for (int i = 0; i < table.get(0).size(); ++i) {
      for (List<Integer> row : table) {
        if(row.get(i).equals(playerCard)) {
          ++winnerCount;
          if (winnerCount == 4) return true;
        }
      }
    }

    return false;
  }

  @Override
  public String toString() {
    return "GameBoard{" +
            "table=" + table +
            ", Players=" + players +
            '}';
  }
}
