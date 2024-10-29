package be.vdab.oefeningen.Composite;

import java.math.BigDecimal;

public class ArbeidsKost implements Kost {
    private BigDecimal uurloon;
    private BigDecimal gepresteerdeUren;

    public ArbeidsKost(BigDecimal uurloon, BigDecimal gepresteerdeUren){
        this.uurloon = uurloon;
        this.gepresteerdeUren=gepresteerdeUren;
    }

    @Override
    public BigDecimal berekenKost() {
        return uurloon.multiply(gepresteerdeUren);
    }
}
