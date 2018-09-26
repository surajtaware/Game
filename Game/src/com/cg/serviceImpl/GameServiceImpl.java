package com.cg.serviceImpl;

import java.util.ArrayList;
import java.util.List;

import com.cg.bean.Game;
import com.cg.repoImpl.GameRepoImpl;
import com.cg.service.GameService;

public class GameServiceImpl implements GameService {

	private GameRepoImpl gameReoImpl;
	@Override
	public Game add(Game g) {
		// TODO Auto-generated method stub
		List<Game> ls=new ArrayList<>();
		ls.add(g);
		return g;
	}

}
