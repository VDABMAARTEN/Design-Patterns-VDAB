package be.vdab.oefeningen;

public class Gezelschapsspel extends Speelgoed {
    Gezelschapsspel(int prijs){
        super(prijs);
    }
    @Override
    void speelgoedKeuze(){
        System.out.println("Je hebt een gezelschapsspel gekregen");
    }
}
