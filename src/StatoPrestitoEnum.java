public enum StatoPrestitoEnum {

    DISPONIBILE("Il libro è disponibile"),
    PRESTATO("Il libro è in prestito"),
    SMARRITO("Il libro è stato smarrito"),
    PRENOTATO("Il libro è stato prenotato");

    private final String descrizione;

    StatoPrestitoEnum(String descrizione) {
        this.descrizione = descrizione;
    }

    public String getDescrizione() {
        return descrizione;
    }
}
