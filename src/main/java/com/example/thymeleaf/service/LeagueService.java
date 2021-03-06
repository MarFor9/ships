package com.example.thymeleaf.service;

import com.example.thymeleaf.model.entity.League;

import java.util.List;

public interface LeagueService {
    League findLeagueById(Integer id);

    List<League> getAllLeagues();

    void saveAllLeagues(List<League> leagues);

    void saveLeague(League league);

    List<League> getAllActiveLeagues();

    League getLeagueById(Integer id);
}
