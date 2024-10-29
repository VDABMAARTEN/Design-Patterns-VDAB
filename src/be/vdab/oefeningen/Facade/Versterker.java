package be.vdab.oefeningen.Facade;

public class Versterker {
    private boolean versterkerAan;

    void start(){
        versterkerAan = true;
        System.out.println("Versterker start");
    }

    void stop(){
        versterkerAan = false;
        System.out.println("Versterker stop");
    }

    public boolean isVersterkerAan() {
        return versterkerAan;
    }
}
