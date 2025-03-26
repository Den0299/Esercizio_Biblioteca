##NUOVI REQUISITI

    Gestione Utenti: Implementare un sistema di registrazione e autenticazione per gli utenti.
    Prenotazioni: Consentire agli utenti di prenotare libri non disponibili.
    Notifiche: Implementare un sistema di notifiche per avvisare gli utenti quando un libro prenotato diventa disponibile.
    Storico Prestiti: Tracciare la storia dei prestiti per ogni utente.
    Reportistica: Generare report sulla frequenza di prestito dei libri e sugli utenti più attivi.

##NUOVE CLASSI E INTERFACCE

    Utente: Classe che rappresenta un utente registrato.
    Prenotazione: Classe che rappresenta una prenotazione di un libro.
    Notifica: Interfaccia che definisce il comportamento di notifica.
    StoricoPrestiti: Classe che traccia la storia dei prestiti per ogni utente.

##NUOVI METODI E ATTRIBUTI

    Biblioteca:
        registraUtente(Utente utente): Registra un nuovo utente.
        prenotaLibro(Libro libro, Utente utente): Prenota un libro per un utente.
        notificaUtente(Utente utente, Notifica notifica): Notifica un utente di una prenotazione disponibile.
    //Libro:
        //getStato(): Restituisce lo stato della pubblicazione (disponibile, prestatto, smarrito).
    //Utente:
        //getPrenotazioni(): Restituisce la lista delle prenotazioni dell'utente.
        //getStoricoPrestiti(): Restituisce la storia dei prestiti dell'utente.

##FUNZIONALITÀ AVANZATE

    Ricerca avanzata: Implementare una ricerca avanzata che consente di cercare libri per titolo, autore, categoria, ecc.
    Gestione prestiti: Implementare un sistema di gestione prestiti che consente di effettuare prestiti, restituire libri e tracciare la storia dei prestiti.
    Tracciamento storico: Implementare un sistema di tracciamento storico che consente di tracciare la storia dei prestiti per ogni utente.
    Reportistica: Implementare un sistema di reportistica che consente di generare report sulla frequenza di prestito dei libri e sugli utenti più attivi.

###Sistema di Gestione Biblioteca - Dettagli

##Gestione Utenti

    //Classe Utente: rappresenta un utente registrato
    //Attributi:
    //    id: identificatore univoco dell'utente
    //    nome: nome dell'utente
    //    cognome: cognome dell'utente
    //    email: indirizzo email dell'utente
    //    password: password dell'utente
    Metodi:
        registraUtente(Utente utente): registra un nuovo utente
        login(String email, String password): effettua il login dell'utente
        getPrenotazioni(): restituisce la lista delle prenotazioni dell'utente
        getStoricoPrestiti(): restituisce la storia dei prestiti dell'utente


//##Prenotazioni

    //Classe Prenotazione: rappresenta una prenotazione di un libro
    //Attributi:
    //    id: identificatore univoco della prenotazione
    //    utente: utente che ha effettuato la prenotazione
    //    libro: libro prenotato
    //    dataPrenotazione: data di prenotazione
    //Metodi:
    //    prenotaLibro(Libro libro, Utente utente): prenota un libro per un utente
    //    annullaPrenotazione(Prenotazione prenotazione): annulla una prenotazione

//##Notifiche -

    //Interfaccia Notifica: definisce il comportamento di notifica
    //Metodi:
    //    notificaUtente(Utente utente, Notifica notifica): notifica un utente di una prenotazione disponibile

##Storico Prestiti

    //Classe StoricoPrestiti: traccia la storia dei prestiti per ogni utente
    //Attributi:
    //    utente: utente a cui appartiene la storia dei prestiti
    //    prestiti: lista dei prestiti effettuati dall'utente
    //Metodi:
    //    aggiungiPrestito(Prestito prestito): aggiunge un prestito alla storia dei prestiti dell'utente
    //    getPrestiti(): restituisce la lista dei prestiti effettuati dall'utente

##Ricerca Avanzata

    Metodi:
        cercaLibri(String titolo, String autore, String categoria): cerca libri per titolo, autore, categoria
        cercaLibriPerUtente(Utente utente): cerca libri prenotati o prestate dall'utente

##Gestione Prestiti

    Metodi:
        effettuaPrestito(Libro libro, Utente utente): effettua un prestito di un libro per un utente
        restituisciLibro(Libro libro, Utente utente): restituisce un libro prestato dall'utente

##Tracciamento Storico

    Metodi:
        //aggiungiPrestito(Prestito prestito): aggiunge un prestito alla storia dei prestiti dell'utente
        //getPrestiti(): restituisce la lista dei prestiti effettuati dall'utente

##Reportistica

    Metodi:
        generaReportLibri(): genera un report sulla frequenza di prestito dei libri
        generaReportUtenti(): genera un report sugli utenti più attivi