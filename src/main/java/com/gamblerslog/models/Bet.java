package com.gamblerslog.models;

import lombok.Data;

@Data
public class Bet {
    public String initiator;
    public String opponent;
    public String amount;
    public String bet;
}
