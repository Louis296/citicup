package com.louis296.citicup.service;

import com.louis296.citicup.model.Team;

public interface TeamService {
    public Team getTeamByNameClubGame(String name, String club, String game);

}
