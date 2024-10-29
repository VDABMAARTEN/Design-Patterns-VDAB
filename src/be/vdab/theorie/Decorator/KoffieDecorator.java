package be.vdab.theorie.Decorator;

abstract class KoffieDecorator implements Koffie {
    protected final Koffie gedecoreerdeKoffie;
    KoffieDecorator(Koffie koffie){
        this.gedecoreerdeKoffie = koffie;
    }
}
