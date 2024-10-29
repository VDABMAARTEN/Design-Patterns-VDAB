package be.vdab.oefeningen.Facade;

public class Equalizer {
    private boolean EqualizerAan;

    void start(){
        EqualizerAan = true;
        System.out.println("Equalizer start");
    }

    void stop(){
        EqualizerAan = false;
        System.out.println("Equalizer stop");
    }

    public boolean isEqualizerAan() {
        return EqualizerAan;
    }
}
