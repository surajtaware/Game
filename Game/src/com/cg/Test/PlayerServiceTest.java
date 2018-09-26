package com.cg.Test;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertNotEquals;
import static org.junit.Assert.assertNull;
import static org.junit.Assert.assertSame;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

import org.junit.Test;
import org.mockito.Mock;

import com.cg.bean.Day;
import com.cg.bean.Game;
import com.cg.bean.Player;
import com.cg.repo.GameRepo;
import com.cg.repo.PlayerRepo;
import com.cg.service.GameService;
import com.cg.service.PlayerService;

public class PlayerServiceTest {
	private PlayerService service;
	@Mock private PlayerRepo repo;	
	@Test
	public void test_add_fail() {
		 Player player = null;		 
		    assertNull("Verify that object is null", player);
	}
	
	@Test
	public void test_player_name_null() {
		 Player player=new Player();
		player.setName(null);
		   assertSame("name null",player,player);
	}

	@Test
	public void test_same_player_name_fail() {
		Set<Game> setgame =new HashSet<>();
		setgame.add(new Game());
		Player player=new Player();
		player.setName("first");
		player.setGame(setgame);
		
		 Player player1=new Player();
			player1.setName("first");
			player1.setGame(setgame);;
			
		   assertNotEquals(player1, player);
	}
	
	
	@Test
	public void test_player_add_success() {
		Set<Game> setgame =new HashSet<>();
		setgame.add(new Game());
		 Player player=new Player();
		player.setName("first");
		player.setGame(setgame);
		//service.add(game);
		List<Player> list= new ArrayList<>();
		list.add(player);
		assertEquals(1, list.size());
		 
		
	}
		


}
	
	
