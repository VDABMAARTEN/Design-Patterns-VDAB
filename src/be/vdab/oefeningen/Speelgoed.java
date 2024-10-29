package be.vdab.oefeningen;

abstract class Speelgoed {
    private int prijs;
    protected Speelgoed(int prijs){this.prijs = prijs;}
    abstract void speelgoedKeuze();
}
