package com.example.thymeleaf.model.responses.league;

import com.example.thymeleaf.model.responses.Paging;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import java.util.ArrayList;
import java.util.List;

@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
public class LeagueResponse {

    private String get;
    private List<Object> parameters = new ArrayList<>();
    private List<Integer> errors = new ArrayList<>();
    private Integer results;
    private Paging paging;
    private List<ApiLeague> response = new ArrayList<>();

}
