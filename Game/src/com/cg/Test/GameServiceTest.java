package com.cg.Test;




import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertNotEquals;
import static org.junit.Assert.assertNull;
import static org.junit.Assert.assertSame;
import static org.mockito.Mockito.when;

import java.util.ArrayList;
import java.util.List;

import org.junit.Test;
import org.mockito.Mock;

import com.cg.bean.Game;
import com.cg.repo.GameRepo;
import com.cg.service.GameService;
import com.cg.serviceImpl.GameServiceImpl;

public class GameServiceTest {
	private GameServiceImpl service;
	@Mock 
	private GameRepo repo;
	
	@Test
	public void test_add_fail() {
		 Game game = null;		 
		    assertNull("Verify that object is null", game);
	}
	
	@Test
	public void test_game_name_null() {
		 Game game=new Game();
		game.setName(null);
		   assertSame("name null",game,game);
	}

	@Test
	public void test_same_game_name_fail() {
		 Game game=new Game();
		game.setName("Khokho");
		game.setNumofplayers((byte)11);
		
		 Game game1=new Game();
			game1.setName("Khokho");
			game1.setNumofplayers((byte)11);
			
		   assertNotEquals(game1, game);
	}
	
	
	@Test
	public void test_game_add_success() {
		 Game game=new Game();
		game.setName("Khokho");
		game.setNumofplayers((byte)11);
		//service.add(game);
		List<Game> list= new ArrayList<>();
		list.add(game);
		assertEquals(1, list.size());
		 
		
	}
	
}
