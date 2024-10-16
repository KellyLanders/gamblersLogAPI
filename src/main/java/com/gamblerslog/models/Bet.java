package com.gamblerslog.models;

import jakarta.persistence.*;
import lombok.Data;

@Data
@Entity
@Table(name="Bets")
public class Bet {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id_bets")
    private Long id_bets;

    @Column(name = "initiator")
    public String initiator;

    @Column(name = "opponent")
    public String opponent;

    @Column(name = "amount")
    public String amount;

    @Column(name = "bet")
    public String bet;
}
