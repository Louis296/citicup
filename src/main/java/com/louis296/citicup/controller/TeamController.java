package com.louis296.citicup.controller;

import com.louis296.citicup.model.Team;
import com.louis296.citicup.service.TeamService;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import javax.annotation.Resource;

@RestController
@RequestMapping("/team")
public class TeamController {
    @Resource
    private TeamService teamService;

    @RequestMapping("/overview")
    public String overview(){
        return "This is a project for Citi Cup!";
    }

    @RequestMapping("/getInfo")
    public Team getInfo(String name,String club,String game){
        return teamService.getTeamByNameClubGame(name,club,game);
    }

}
