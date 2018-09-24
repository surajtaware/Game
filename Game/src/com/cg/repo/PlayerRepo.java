package com.cg.repo;

import java.util.List;

import com.cg.bean.Player;

public interface PlayerRepo {
Player save(Player p);
List<Player> findByName(String name);
List<Player> findByGamesName(String name);
}
