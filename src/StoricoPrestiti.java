import java.util.ArrayList;
import java.util.List;

public class StoricoPrestiti {

    private Utente utente;
    private List<Prenotazione> prestiti;

    public StoricoPrestiti(Utente utente) {
        this.utente = utente;
        this.prestiti = new ArrayList<>();
    }

    public Utente getUtente() {
        return utente;
    }

    public void setUtente(Utente utente) {
        this.utente = utente;
    }

    public List<Prenotazione> getPrestiti() {
        return prestiti;
    }

    public void setPrestiti(List<Prenotazione> prestiti) {
        this.prestiti = prestiti;
    }

    // TODO aggiungiPrestito
    public void aggiungiPrestito(Prenotazione prestito) {
        this.prestiti.add(prestito);
    }
}
