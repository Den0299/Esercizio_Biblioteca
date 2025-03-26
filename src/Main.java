public class Main {
    public static void main(String[] args) {
        Biblioteca biblioteca = new Biblioteca();

        Utente utente1 = new Utente(10, "Dario", "Neri", "darioneri@gmail.com", "DarioNeri");
        Utente utente2 = new Utente(11, "Mario", "Rossi", "mariorossi@gmail.com", "MarioRossi");
        Utente utente3 = new Utente(12, "Luigi", "Verdi", "luigiverdi@gmail.com", "LuigiVerdi");
        biblioteca.registraUtente(utente1);
        biblioteca.registraUtente(utente2);
        biblioteca.registraUtente(utente3);
        biblioteca.loginUtente("darioneri@gmail.com", "DarioNeri");
        biblioteca.loginUtente("mariorossi@gmail.com", "MarioRossi");
        biblioteca.loginUtente("luigiverdi@gmail.com", "LuigiVerdi");
        biblioteca.mostraUtenti();

        Fumetto fumetto = new Fumetto(1, "y", 2016, GenereEnum.FANTASY, "xx", 342342, 500);
        Rivista rivista = new Rivista(2, "z", 2004, GenereEnum.GIALLO, 14);

        biblioteca.aggiungiLibro(fumetto);
        fumetto.getDettagliSpecifici();

        biblioteca.aggiungiLibro(rivista);

        biblioteca.mostraLibri();

        biblioteca.cercaLibri("y");

        // prestito di un libro disponibile
        biblioteca.effettuaPrestito("y");
        // prestito di un libro non disponibile
        biblioteca.effettuaPrestito("y");
        biblioteca.restituisciLibro("y");

        biblioteca.prenotaLibro(fumetto, utente1);
        biblioteca.cercaLibriPerUtente(utente1);
        biblioteca.annullaPrenotazione(fumetto, utente1);

        biblioteca.cercaLibriPerParametri(1, "a", GenereEnum.GIALLO);

        NotificaUtente notifica = new NotificaUtente("Notifica inviata");
        biblioteca.notificaUtente(utente1, notifica);
    }
}