package com.detroitlabs.pingpong.controller;

import com.detroitlabs.pingpong.data.PlayerRepository;
import com.detroitlabs.pingpong.model.Player;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;

import java.util.List;

@Controller
public class playercontroller {

    @Autowired
    private PlayerRepository playerRepository;

    @RequestMapping("/")
    public String displayHomepage(ModelMap modelMap){
        List<Player> allPlayers = playerRepository.getAllPlayers();
        modelMap.put("allPlayers", allPlayers);
        return "home";
    }

    @RequestMapping("/rankings")
    public String displayRankings(ModelMap modelMap){
        List<Player> sortedPlayers = playerRepository.getByRank();
        modelMap.put("sortedPlayers", sortedPlayers);
        return "rankings";
    }

    @RequestMapping("/playerdetails/{firstName}")
    public String playerDetails(@PathVariable String firstName, ModelMap modelMap) {
        Player foundPlayer = playerRepository.findByName(firstName);
        modelMap.put("foundPlayer", foundPlayer);
        return "playerdetails";
    }

    @RequestMapping("/rules")
    public String rules(){
        return "rules";
    }
}
