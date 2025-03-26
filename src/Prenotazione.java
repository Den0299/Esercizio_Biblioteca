import java.time.LocalDate;

public class Prenotazione {

    private Integer id;
    private Utente utente;
    private Libro libro;
    private LocalDate dataPrenotazione;

    public Prenotazione(Integer id, Utente utente, Libro libro, LocalDate dataPrenotazione) {
        this.id = id;
        this.utente = utente;
        this.libro = libro;
        this.dataPrenotazione = dataPrenotazione;
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public Utente getUtente() {
        return utente;
    }

    public void setUtente(Utente utente) {
        this.utente = utente;
    }

    public Libro getLibro() {
        return libro;
    }

    public void setLibro(Libro libro) {
        this.libro = libro;
    }

    public LocalDate getDataPrenotazione() {
        return dataPrenotazione;
    }

    public void setDataPrenotazione(LocalDate dataPrenotazione) {
        this.dataPrenotazione = dataPrenotazione;
    }


    // TODO prenotaLibro()
    public void prenotaLibro(Libro libro, Utente utente) {
        if (libro.getStato() == StatoPrestitoEnum.PRESTATO) {
            // Se il libro è in prestito, allora può essere prenotato
            libro.setStato(StatoPrestitoEnum.PRENOTATO);
            // Aggiungo la prenotazione alla lista delle prenotazioni dell'utente
            utente.getPrenotazioni().add(this);
            System.out.println("Prenotazione effettuata per il libro: " + libro.getNome());
        } else if (libro.getStato() == StatoPrestitoEnum.PRENOTATO) {
            System.out.println("Il libro è già prenotato");
        }
    }

    // TODO annullaPrenotazione
    public void annullaPrenotazione(Libro libro, Utente utente) {
        if (libro.getStato() == StatoPrestitoEnum.PRENOTATO) {
            libro.setStato(StatoPrestitoEnum.DISPONIBILE);
            utente.getPrenotazioni().remove(this);
            System.out.println("Prenotazione annullata per il libro: " + libro.getNome());
        }
    }
}
