package be.vdab.theorie.Facade;

import java.math.BigDecimal;

public class Main {
    public static void main(String[] args) {
        var persoon = new Persoon(new Beroepsinkomsten(BigDecimal.valueOf(3000)), new Rekening());
        var verstrekker = new Leningverstrekker();
        if (verstrekker.isLeningGoedgekeurd(persoon)
/*              DEZE CODE WORDT GESTOPT IN DE FACADE LENINGVERSTREKKER
                persoon.getBeroepsinkomsten().getMaandwedde().compareTo(BigDecimal.valueOf(2500)) >= 0
                && persoon.getRekening().getSaldo().compareTo(BigDecimal.ZERO)>0
                && persoon.getLeningen().isEmpty()*/
        ) {
            System.out.println("goedgekeurd");
        }
        else
            System.out.println("afgekeurd");

    }
}
