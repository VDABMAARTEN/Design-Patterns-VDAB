package be.vdab.theorie.Factory;

public enum DocumentFactory {
    INSTANCE;
    public Document open(String bestandsnaam) {
        var extensie = bestandsnaam.substring(bestandsnaam.length() - 4);
        return switch (extensie) {
            case "docx" -> new Tekst(bestandsnaam);
            case "xlsx" -> new Rekenblad(bestandsnaam);
            case "pptx" -> new Presentatie(bestandsnaam);
            default -> throw new IllegalArgumentException();
        };
    }
}
