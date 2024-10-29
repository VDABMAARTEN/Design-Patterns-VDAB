package be.vdab.theorie.Facade;

import java.math.BigDecimal;

public class Beroepsinkomsten {
    private BigDecimal maandwedde;
    Beroepsinkomsten(BigDecimal maandwedde){
        this.maandwedde = maandwedde;
    }

    public BigDecimal getMaandwedde() {
        return maandwedde;
    }
}
