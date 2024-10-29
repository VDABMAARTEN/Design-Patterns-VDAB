package be.vdab.theorie.Factory;

public class Main {

  public static void main(String[] args) {

    //    theorie 1: Singleton
    /*      Motor.INSTANCE.start();
        stopDeAuto();
    }
    private static void stopDeAuto() {
        Motor.INSTANCE.stop();*/


//    theorie: Simple factory
/*    var factory = new DocumentFactory();
    var document = factory.open("liedje.docx");
    document.printPreview();
    document.print();*/

//   beter: Simple factory als ENUM
    var test = DocumentFactory.INSTANCE.open("liedje.docx");
    test.printPreview();
    test.print();


  }
}
