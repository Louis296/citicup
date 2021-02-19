package com.louis296.citicup.service.impl;

import com.louis296.citicup.model.Team;
import com.louis296.citicup.repository.TeamMapper;
import com.louis296.citicup.service.TeamService;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;

@Service("TeamService")
public class TeamServiceImpl implements TeamService {

    @Resource
    private TeamMapper teamMapper;

    @Override
    public Team getTeamByNameClubGame(String name, String club, String game) {
        return teamMapper.getTeamByNameClubGame(name,club,game);
    }
}
