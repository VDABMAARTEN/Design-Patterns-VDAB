package be.vdab.theorie.Compositie;

public class Main {
    public static void main(String[] args) {
        var tekening = new Tekening();
        tekening.add(new Rechthoek(2,1));
        tekening.add(new Cirkel(3));
        var SubTekening = new Tekening();
        SubTekening.add(new Rechthoek(3,2));
        SubTekening.add(new Cirkel(4));
        tekening.add(SubTekening);
        System.out.println(tekening.getOppervlakte());
    }
}
