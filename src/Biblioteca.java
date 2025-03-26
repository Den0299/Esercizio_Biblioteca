import java.sql.SQLOutput;
import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;

public class Biblioteca implements Notifica{

    private List<Libro> libri;
    private List<Utente> utenti;
    private List<Prenotazione> prenotazioni;
    private List<StoricoPrestiti> storicoPrestiti;



    public Biblioteca () {
        this.libri = new ArrayList<>();
        this.utenti = new ArrayList<>();
        this.prenotazioni = new ArrayList<>();
        this.storicoPrestiti = new ArrayList<>();
    }

    public void aggiungiLibro (Libro libro) {
        libri.add(libro);
    }

    public void rimuoviLibro (Libro libro) {
        libri.remove(libro);
    }

    public void mostraLibri() {
        for (Libro libro : libri) {
            libro.stampaLibro();
        }
    }

    public void cercaLibri (String nome) {
        for (Libro libro: libri) {
            // controllo che ci sia un libro con il nome scelto
            if (libro.getNome().equals(nome)) {
                // stampo i dettagli del libro tramite il metodo stampaLibro
                libro.stampaLibro();
            }
        }
    }

    public void effettuaPrestito(String nome) {
        for (Libro libro : libri) {
            // libro con il nome scelto
            if (libro.getNome().equals(nome)) {
                // chiamata al metodo prestito della classe Libro
                libro.prestito();
            }
        }
    }

    public void restituisciLibro(String nome) {
        for (Libro libro : libri) {
            // libro con il nome scelto
            if (libro.getNome().equals(nome)) {
                // chiamata al metodo restituzione della classe Libro
                libro.restituzione();
            }

        }
    }

    // TODO registraUtente (e rimuovi)
    public void registraUtente (Utente utente) {
        utenti.add(utente);
        System.out.println("Utente " + utente.getNome() + " " + utente.getCognome() + " registrato con successo");
    }

    public void rimuoviUtente (Utente utente) {
        utenti.remove(utente);
    }

    public void mostraUtenti() {
        for (Utente utente : utenti) {
            utente.stampaDettagliUtente();
        }
    }

    // TODO login dell'utente con stampa
    public void loginUtente(String email, String password) {
        for (Utente utente : utenti) {
            if (utente.login(email, password)) {
                System.out.println("Login effettuato con successo");
                return;
            }
        }
        System.out.println("Login fallito");
    }

    // TODO prenotaLibro()
    public void prenotaLibro(Libro libro, Utente utente) {
        Integer prenotazioneId = prenotazioni.size() + 1;
        Prenotazione prenotazione = new Prenotazione(prenotazioneId, utente, libro, LocalDate.now());
        prenotazione.prenotaLibro(libro, utente);
        prenotazioni.add(prenotazione);
        System.out.println("\nPrenotazione effettuata per il libro: " + libro.getNome());
    }

    public void annullaPrenotazione(Libro libro, Utente utente) {
        for (Prenotazione prenotazione : prenotazioni) {
            if (prenotazione.getLibro().equals(libro) && prenotazione.getUtente().equals(utente)) {
                prenotazione.annullaPrenotazione(libro, utente);
                prenotazioni.remove(prenotazione);
                System.out.println("Prenotazione annullata per il libro: " + libro.getNome());
                return;
            }
        }
        System.out.println("Prenotazione non trovata");
    }

    // TODO cerca libri per utente
    public void cercaLibriPerUtente(Utente utente) {
        for (Prenotazione prenotazione : prenotazioni) {
            if (prenotazione.getUtente().equals(utente)) {
                prenotazione.getLibro().stampaLibro();
                System.out.println("Data di prenotazione: " + prenotazione.getDataPrenotazione());
            }
        }
    }

    // TODO cerca libri in base ai parametri
    public void cercaLibriPerParametri(Integer id, String nome, GenereEnum genereEnum) {
        for (Libro libro : libri) {
            if (libro.getId().equals(id) || libro.getNome().equals(nome) || libro.getGenereEnum().equals(genereEnum)) {
                libro.stampaLibro();
            }
        }
    }

    @Override
    public void notificaUtente (Utente utente, NotificaUtente notifica) {
        System.out.println("\nInvia notifica a " + utente.getNome() + " " + utente.getCognome());
        System.out.println("Messaggio: " + notifica.getMessaggio());
    }


}
