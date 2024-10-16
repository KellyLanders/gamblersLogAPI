package com.gamblerslog.interfaces;


import com.gamblerslog.models.Bet;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;

public interface BetsRepository extends JpaRepository<Bet, Long> {
    Bet save(Bet bets);
}
