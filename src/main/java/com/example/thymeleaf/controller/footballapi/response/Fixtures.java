package com.example.thymeleaf.controller.footballapi.response;


import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
public class Fixtures {
    private boolean events;
    private boolean lineups;
    private boolean statistics_fixtures;
    private boolean statistics_players;
}
