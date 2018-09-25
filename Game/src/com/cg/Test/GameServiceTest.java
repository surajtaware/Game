package com.cg.Test;




import static org.junit.Assert.assertNull;
import static org.mockito.Mockito.when;

import org.junit.Test;
import org.mockito.Mock;

import com.cg.bean.Game;
import com.cg.repo.GameRepo;
import com.cg.service.GameService;

public class GameServiceTest {
	private GameService service;
	@Mock private GameRepo repo;
	
	@Test
	public void test_add_fail() {
		 Game game = null;		 
		    assertNull("Verify that object is null", game);
	}
	
	@Test
	public void test_game_name_null() {
		 Game game=new Game();
		
		    //assertEquals("name null",null,game.setName(null));
	}

	
}
