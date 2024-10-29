package be.vdab.theorie.Decorator;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
//        statisch
/*
        var eenvoudig = new EenvoudigeKoffie();
        System.out.println(eenvoudig.getKost());
        System.out.println(eenvoudig.getBereiding());
        System.out.println();
        var metMelk = new MetMelk(new EenvoudigeKoffie());
        System.out.println(metMelk.getKost());
        System.out.println(metMelk.getBereiding());
        System.out.println();
        var metChocolade = new MetChocolade(new EenvoudigeKoffie());
        System.out.println(metChocolade.getKost());
        System.out.println(metChocolade.getBereiding());
        System.out.println();
        var metMelkEnChocolade = new MetChocolade(new MetMelk(new EenvoudigeKoffie()));
        System.out.println(metMelkEnChocolade.getKost());
        System.out.println(metMelkEnChocolade.getBereiding());
*/


//        DYNAMISCH
        Koffie dynamischeKoffie = new EenvoudigeKoffie();
        var scanner = new Scanner(System.in);
        System.out.println("Melk(j/n)");
        if ("j".equals(scanner.nextLine())) {
            dynamischeKoffie = new MetMelk(dynamischeKoffie);
        }
        System.out.println("Chocolade(j/n)");
        if("j".equals(scanner.nextLine())){
            dynamischeKoffie = new MetChocolade(dynamischeKoffie);
        }
        System.out.println(dynamischeKoffie.getKost());
        System.out.println(dynamischeKoffie.getBereiding());
    }
}
