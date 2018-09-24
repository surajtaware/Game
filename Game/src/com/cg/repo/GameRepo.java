package com.cg.repo;

import com.cg.bean.Game;

public interface GameRepo {
Game save(Game g);
Game fidByName(String name);
}
