package com.learn.players_service.controllers;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
public class PlayerController {

    private static final Logger log = LoggerFactory.getLogger(PlayerController.class);

    @GetMapping("/players")
    public List<String> getPlayers() throws InterruptedException {
        log.info("returning list of players");
        Thread.sleep(2000);
        return List.of("Peter Pan", "Christin Ronaldo", "David Mark", "Henry Ford");
    }
}
