package com.cg.bean;

import java.util.List;
import java.util.Map;

public class PlayerReport {
private String playerName;
public String getPlayerName() {
	return playerName;
}
public void setPlayerName(String playerName) {
	this.playerName = playerName;
}
public Map<Game, List<Day>> getMap() {
	return map;
}
public void setMap(Map<Game, List<Day>> map) {
	this.map = map;
}
private Map<Game, List<Day>> map;
}
