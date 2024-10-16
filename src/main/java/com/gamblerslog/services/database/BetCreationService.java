package com.gamblerslog.services.database;

import com.gamblerslog.interfaces.BetsRepository;
import com.gamblerslog.models.Bet;
import lombok.Data;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
@Data
public class BetCreationService {

    @Autowired
    private BetsRepository betsRepository;

    public Bet createBet(Bet bet) {
        return betsRepository.save(bet);
    }
}
