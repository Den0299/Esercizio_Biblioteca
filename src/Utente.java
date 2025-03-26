import java.util.ArrayList;
import java.util.List;

public class Utente {

    private Integer id;
    private String nome;
    private String cognome;
    private String email;
    private String password;
    // TODO aggiungere campi per i getter
    private List<Prenotazione> prenotazioni;
    private StoricoPrestiti storicoPrestiti;

    public Utente(Integer id, String nome, String cognome, String email, String password) {
        this.id = id;
        this.nome = nome;
        this.cognome = cognome;
        this.email = email;
        this.password = password;
        this.prenotazioni = new ArrayList<>();
        // creiamo un nuovo oggetto StoricoPrestiti ogni volta che viene creato un nuovo utente
        this.storicoPrestiti = new StoricoPrestiti(this);
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getCognome() {
        return cognome;
    }

    public void setCognome(String cognome) {
        this.cognome = cognome;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    // TODO getPrenotazioni()
    public List<Prenotazione> getPrenotazioni() {
        return prenotazioni;
    }

    public void setPrenotazioni(List<Prenotazione> prenotazioni) {
        this.prenotazioni = prenotazioni;
    }

    // TODO getStoricoPrestiti
    public StoricoPrestiti getStoricoPrestiti() {
        return storicoPrestiti;
    }

    public void setStoricoPrestiti(StoricoPrestiti storicoPrestiti) {
        this.storicoPrestiti = storicoPrestiti;
    }

    // TODO login(String email, String password): effettua il login dell'utente
    public boolean login(String email, String password) {
        return this.email.equals(email) && this.password.equals(password);
    }

    public void stampaDettagliUtente() {
        System.out.println("\nId utente: " + this.id + "\nNome: " + this.nome + "Cognome: " +
                this.cognome + "\nEmail " + this.email + "Password: " + this.password);
    }
}
