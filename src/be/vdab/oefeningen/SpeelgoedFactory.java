package be.vdab.oefeningen;

enum SpeelgoedFactory {
    INSTANCE;
    Speelgoed speelgoedKeuze(int leeftijd) {
        return switch (leeftijd) {
            case 0, 1, 2, 3, 4, 5 -> new Pop(15);
            case 6, 7, 8, 9, 10, 11, 12 -> new Gezelschapsspel(25);
            case 13, 14, 15, 16, 17, 18 -> new Boekenbon(30);
            default -> throw new IllegalArgumentException();
        };
    }
}
