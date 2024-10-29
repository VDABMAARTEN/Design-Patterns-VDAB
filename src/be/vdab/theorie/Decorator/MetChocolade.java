package be.vdab.theorie.Decorator;

import java.math.BigDecimal;

public class MetChocolade extends KoffieDecorator {

    MetChocolade(Koffie gedecoreerdekoffie) {
        super(gedecoreerdekoffie);
    }

    @Override
    public BigDecimal getKost() {
        return gedecoreerdeKoffie.getKost().add(BigDecimal.valueOf(2));
    }

    @Override
    public String getBereiding() {
        return gedecoreerdeKoffie.getBereiding() + ", schilfer de chocolade, voeg de schilfers toe";
    }
}
