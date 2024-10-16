package com.gamblerslog.controllers;

import com.gamblerslog.models.Bet;
import com.gamblerslog.models.database.User;
import com.gamblerslog.services.BetCreationService;
import com.gamblerslog.services.database.UserService;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@CrossOrigin(maxAge = 1800)
@RestController
public class BetController {

    private final BetCreationService betCreationService;
    private final UserService userService;

    public BetController(
            BetCreationService betCreationService,
            UserService userService
            ) {
        this.betCreationService = betCreationService;
        this.userService = userService;
    }

    @PostMapping("/create-bet")
    public Bet createBet(@RequestBody Bet bet) {
        return betCreationService.createBet(bet);
    }

    @GetMapping("/get-user-by-name")
    public List<User> getUserByName(@RequestParam String name) {
        return userService.findUserByName(name);
    }

}