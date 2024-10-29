package be.vdab.oefeningen;

public class Pop extends Speelgoed{

    Pop(int prijs){
        super(prijs);
    }
    @Override
    void speelgoedKeuze(){
        System.out.println("Je hebt een pop gekregen");
    }
}
