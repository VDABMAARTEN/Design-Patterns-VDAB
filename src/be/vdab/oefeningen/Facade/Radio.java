package be.vdab.oefeningen.Facade;

public class Radio {
    private boolean radioAan;

    void start(){
        radioAan=true;
        System.out.println("Radio start");
    }

    void stop(){
        radioAan =false;
        System.out.println("Radio stop");
    }
    public boolean isRadioAan() {
        return radioAan;
    }
}
