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
import com.cg.repo.DayRepo;
import com.cg.repo.GameRepo;
import com.cg.service.DayService;
import com.cg.service.GameService;
import com.cg.serviceImpl.GameServiceImpl;

public class DayServiceTest {
	private DayService service;
	@Mock 
	private DayRepo repo;
	
	@Test
	public void test_add_fail() {
		 Day day = null;		 
		    assertNull("Verify that object is null", day);
	}
	
	@Test
	public void test_Day_name_null() {
		 Day day=new Day();
		day.setName(null);
		   assertSame("name null",day,day);
	}

	@Test
	public void test_same_day_name_fail() {
		Set<Game> setgame =new HashSet<>();
		setgame.add(new Game());
		Day day=new Day();
		day.setName("first");
		day.setGames(setgame);
		
		 Day day1=new Day();
			day1.setName("first");
			day1.setGames(setgame);;
			
		   assertNotEquals(day1, day);
	}
	
	
	@Test
	public void test_game_add_success() {
		Set<Game> setgame =new HashSet<>();
		setgame.add(new Game());
		 Day day=new Day();
		day.setName("Khokho");
		day.setGames(setgame);
		//service.add(game);
		List<Day> list= new ArrayList<>();
		list.add(day);
		assertEquals(1, list.size());
		 
		
	}
	
}
