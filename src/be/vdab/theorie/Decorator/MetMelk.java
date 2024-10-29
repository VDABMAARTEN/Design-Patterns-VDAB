package be.vdab.theorie.Decorator;

import java.math.BigDecimal;

public class MetMelk extends KoffieDecorator {
    MetMelk(Koffie gedecoreerdeKoffie){
        super(gedecoreerdeKoffie);
    }

    @Override
    public BigDecimal getKost(){
        return gedecoreerdeKoffie.getKost().add(BigDecimal.ONE);
    }

    @Override
    public String getBereiding(){
        return gedecoreerdeKoffie.getBereiding() + ",warm de melk, voeg de melk toe";
    }
}
