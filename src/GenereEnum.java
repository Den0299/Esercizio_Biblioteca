public enum GenereEnum {
    FANTASY ("Libro fantasy"),
    HORROR ("Libro horror"),
    GIALLO("Libro giallo");

    private final String descrizione;

    GenereEnum(String descrizione) {
        this.descrizione = descrizione;
    }

    public String getDescrizione() {
        return descrizione;
    }
}
