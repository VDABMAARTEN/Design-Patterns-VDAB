package be.vdab.theorie.Builder;

public class Main {
    public static void main(String[] args) {
        var builder = new Inwoner.InwonerBuilder();
        var inwoner = builder.metVoornaam("Olivier").metFamilienaam("Gerard").metAantalKinderen(2).maakInwoner();

    }

}
