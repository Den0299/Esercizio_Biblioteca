public enum CategoriaPubblicazioneEnum {

    LIBRO ("È un libro"),
    RIVISTA("È una rivista"),
    GIORNALE("È un giornale"),
    DOCUMENTO_STORICO("È un documento storico");

    private final String descrizione;

    CategoriaPubblicazioneEnum(String descrizione) {
        this.descrizione = descrizione;
    }

    public String getDescrizione() {
        return descrizione;
    }
}
