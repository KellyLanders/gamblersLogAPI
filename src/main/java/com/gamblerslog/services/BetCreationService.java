package com.gamblerslog.services;

import com.gamblerslog.models.Bet;
import lombok.Data;
import lombok.extern.slf4j.Slf4j;
import org.springframework.stereotype.Service;

@Service
@Data
public class BetCreationService {

    public Bet createBet(Bet bet) {
        return bet;
    }
}
