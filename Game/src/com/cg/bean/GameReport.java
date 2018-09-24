package com.cg.bean;

import java.util.List;

public class GameReport {
private String name;
private List<Player> players;
public String getName() {
	return name;
}
public void setName(String name) {
	this.name = name;
}
public List<Player> getPlayers() {
	return players;
}
public void setPlayers(List<Player> players) {
	this.players = players;
}
public List<Day> getDays() {
	return days;
}
public void setDays(List<Day> days) {
	this.days = days;
}
private List<Day> days;
}
