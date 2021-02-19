package com.louis296.citicup.repository;

import com.louis296.citicup.model.Team;

public interface TeamMapper {
    public Team getTeamByNameClubGame(String name,String club,String game);
}
