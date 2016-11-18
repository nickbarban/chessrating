package com.millhouse.chessrating.dao;

import com.millhouse.chessrating.model.Player;

import java.util.List;

/**
 * Created by Millhouse on 11/18/2016.
 */

public interface PlayerDao {
    Player getById(long id);
    Player getByName(String name);
    void savePlayer(Player player);
    void updatePlayer(Player player);
    void deletePlayerById(long id);
    List<Player>  getAllPlayers();
    void deleteAllPlayers();
    boolean isPlayerExist(Player player);

}