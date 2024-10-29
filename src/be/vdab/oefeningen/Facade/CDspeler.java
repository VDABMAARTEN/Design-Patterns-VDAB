package be.vdab.oefeningen.Facade;

public class CDspeler {
    private boolean CDspelerAan;

    void start(){
        CDspelerAan = true;
        System.out.println("CDspeler start");
    }

    void stop(){
        CDspelerAan = false;
        System.out.println("CDspeler stop");
    }

    public boolean isCDspelerAan() {
        return CDspelerAan;
    }
}
