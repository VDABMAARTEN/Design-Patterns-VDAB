package be.vdab.oefeningen.Composite;

import java.math.BigDecimal;

public class GrondstofKost implements Kost {
    private BigDecimal eenheidsprijs;
    private BigDecimal hoeveelheid;

    public GrondstofKost(BigDecimal eenheidsprijs, BigDecimal hoeveelheid){
        this.eenheidsprijs = eenheidsprijs;
        this.hoeveelheid = hoeveelheid;
    }

    @Override
    public BigDecimal berekenKost() {
        return eenheidsprijs.multiply(hoeveelheid);
    }
}