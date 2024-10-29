package be.vdab.theorie.Factory;

public class Tekst extends Document{
    Tekst(String bestandsnaam) {
        super(bestandsnaam);
    }
    @Override
    void print() { System.out.println("afdruk van tekst"); }
    @Override
    void printPreview() { System.out.println("afdrukvoorbeeld van tekst"); }

}
