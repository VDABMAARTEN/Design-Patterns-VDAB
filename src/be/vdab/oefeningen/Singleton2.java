package be.vdab.oefeningen;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;

public enum Singleton2 {
    MAGIC8BALL;
    private final String[] antwoorden = new String[]{"Zoals ik het zie, ja.",
            "Het is zeker.", "Hoogst waarschijnlijk.", "Ziet er goed uit.",
            "Zonder twijfel.", "Ja.", "Zeker.", "Je mag er op rekenen.",
            "Vraag dit later nog eens.", "Dit wil je niet weten.",
            "Ik kan dit nu niet voorspellen.",
            "Concentreer je en stel je vraag opnieuw.", "Je moet er niet op rekenen.",
            "Nee.", "Ziet er niet goed uit.", "Zeer twijfelachtig."};

    private int vorigAntwoordIndex = -1;

    public String getAntwoord(String vraag) {
        System.out.println("Vraag: " + vraag);
        var random = new Random();
        var antwoordIndex = random.nextInt(antwoorden.length);
        while (antwoordIndex == vorigAntwoordIndex) {
            antwoordIndex = random.nextInt(antwoorden.length);
        }

        vorigAntwoordIndex = antwoordIndex;
        return "Antwoord: " + antwoorden[antwoordIndex];
    }

}
