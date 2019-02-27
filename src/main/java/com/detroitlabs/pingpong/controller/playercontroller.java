package com.detroitlabs.pingpong.controller;

import com.detroitlabs.pingpong.data.PlayerRepository;
import com.detroitlabs.pingpong.model.Player;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
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

}
