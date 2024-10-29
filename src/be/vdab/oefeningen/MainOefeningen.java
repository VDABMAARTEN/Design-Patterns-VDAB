package be.vdab.oefeningen;

public class MainOefeningen {
    public static void main(String[] args) {

//    oefening 1: Singleton1
     /* Singleton.VERSNELLINGSBAK.versnellingHogerSchakelen();
      Singleton.VERSNELLINGSBAK.versnellingLagerSchakelen();
      Singleton.VERSNELLINGSBAK.versnellingHogerSchakelen();
      Singleton.VERSNELLINGSBAK.versnellingHogerSchakelen();
      Singleton.VERSNELLINGSBAK.versnellingHogerSchakelen();
      Singleton.VERSNELLINGSBAK.versnellingHogerSchakelen();
      Singleton.VERSNELLINGSBAK.versnellingHogerSchakelen();
      Singleton.VERSNELLINGSBAK.versnellingHogerSchakelen();
      Singleton.VERSNELLINGSBAK.versnellingHogerSchakelen();
      Singleton.VERSNELLINGSBAK.versnellingHogerSchakelen();
      Singleton.VERSNELLINGSBAK.versnellingLagerSchakelen();
      Singleton.VERSNELLINGSBAK.versnellingLagerSchakelen();
      Singleton.VERSNELLINGSBAK.versnellingLagerSchakelen();
      Singleton.VERSNELLINGSBAK.versnellingLagerSchakelen();
      Singleton.VERSNELLINGSBAK.versnellingLagerSchakelen();
      Singleton.VERSNELLINGSBAK.versnellingLagerSchakelen();
      Singleton.VERSNELLINGSBAK.versnellingLagerSchakelen();
      Singleton.VERSNELLINGSBAK.versnellingLagerSchakelen();*/

//oefening: Singleton 2
/*
    Scanner scanner = new Scanner (System.in);
    System.out.println("Typ je vraag: ");
    var vraag = scanner.next();
    Singleton2.MAGIC8BALL.getAntwoord(vraag);
*/

//        oefening: Simple factory

/*
var speelgoed = SpeelgoedFactory.INSTANCE.speelgoedKeuze(10);
speelgoed.speelgoedKeuze();
*/

//      oefening: coordinaat
        var builder = new Coordinaat.CoordinaatBuilder();
        var coordinaat = builder.metX(1).metY(2).metZ(3).maakCoordinaat();
        System.out.println(coordinaat);
    }
}
