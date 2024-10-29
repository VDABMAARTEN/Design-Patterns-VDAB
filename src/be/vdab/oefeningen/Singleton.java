package be.vdab.oefeningen;

public enum Singleton {
    VERSNELLINGSBAK;
    public int versnelling = 0;

    public void versnellingHogerSchakelen() {
        switch (versnelling) {
            case -1 -> {
                versnelling++;
                System.out.println("Wagen staat in neutraal");
            }
            case 0, 1, 2, 3, 4 -> {
                versnelling++;
                System.out.println("Versnelling: " + versnelling);
            }
            case 5 -> {
                System.out.println("Max versnelling: " + versnelling);
            }
        }

    }

    public void versnellingLagerSchakelen(){
        switch(versnelling){
            case -1 -> System.out.println("Wagen staat in achteruit en gaat niet lager");
            case 0,1,2,3,4,5 -> {
                versnelling--;
                System.out.println("Versnelling: " + versnelling);
            }
        }
    }

    public void achteruitSchakelen(){
        versnelling = -1;
        System.out.println("Wagen staat in achteruit");
    }
}

/*
cursus:
package be.vdab.taken;
enum Versnellingsbak {
 INSTANCE;
 private int versnelling;
 void hoger() {
 if (versnelling == 5) {
 throw new VerkeerdeVersnellingException();
 }
 versnelling++;
 }
 void lager() {
 if (versnelling == -1) { // achteruit
 throw new VerkeerdeVersnellingException();
 }
 versnelling--;
 }
}
*/