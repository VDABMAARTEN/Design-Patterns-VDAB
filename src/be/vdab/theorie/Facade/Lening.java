package be.vdab.theorie.Facade;

import java.math.BigDecimal;

public class Lening {
    private final BigDecimal bedrag;
    Lening(BigDecimal bedrag){
        this.bedrag = bedrag;
    }

    public BigDecimal getBedrag() {
        return bedrag;
    }
}
