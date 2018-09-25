package com.cg.service;

import com.cg.bean.Day;
import com.cg.bean.Game;
import com.cg.bean.Player;

public interface ReportService {
public Game gameWiseReport(String gameName);
public Player playerWiseReport(String playerName);
public Day dayWiseReport(String dayName);

}
