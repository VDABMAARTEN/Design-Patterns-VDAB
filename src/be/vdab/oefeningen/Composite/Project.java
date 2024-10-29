package be.vdab.oefeningen.Composite;

import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.List;

public class Project implements Kost {
    private final List<Kost> kosten = new ArrayList<>();

    void addKost (Kost kost){
        kosten.add(kost);
    }

//    REMINDER: .reduce is wat je nodig hebt voor sommen die niet primitive zijn!
    @Override
    public BigDecimal berekenKost() {
        return kosten.stream().map(kost -> kost.berekenKost()).reduce(BigDecimal.ZERO, (vorigeSom,bedrag) -> vorigeSom.add(bedrag)) ;
    }
}
