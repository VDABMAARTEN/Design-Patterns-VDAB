package be.vdab.theorie.Facade;

import java.math.BigDecimal;

public class Leningverstrekker {
    boolean isLeningGoedgekeurd(Persoon persoon){
        return persoon.getBeroepsinkomsten().getMaandwedde().compareTo(BigDecimal.valueOf(2500)) >= 0
                && persoon.getRekening().getSaldo().compareTo(BigDecimal.ZERO)>0
                && persoon.getLeningen().isEmpty();
    }
}
