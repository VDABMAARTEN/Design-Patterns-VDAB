package be.vdab.oefeningen;

public class Boekenbon extends Speelgoed {
    Boekenbon(int prijs){
        super(prijs);
    }
    @Override
    void speelgoedKeuze(){
        System.out.println("Je hebt een boekenbon gekregen");
    }
}
