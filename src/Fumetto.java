public class Fumetto extends Libro {

    private String autore;
    private Integer isbn;
    private Integer numeroPagine;

    public Fumetto(Integer id, String nome, Integer dataPubblicazione, GenereEnum genereEnum, String autore, Integer isbn, Integer numeroPagine) {
        super(id, nome, dataPubblicazione, genereEnum);
        this.autore = autore;
        this.isbn = isbn;
        this.numeroPagine = numeroPagine;
    }

    public String getAutore() {
        return autore;
    }

    public void setAutore(String autore) {
        this.autore = autore;
    }

    public Integer getIsbn() {
        return isbn;
    }

    public void setIsbn(Integer isbn) {
        this.isbn = isbn;
    }

    public Integer getNumeroPagine() {
        return numeroPagine;
    }

    public void setNumeroPagine(Integer numeroPagine) {
        this.numeroPagine = numeroPagine;
    }

    @Override
    public void stampaLibro() {
       super.stampaLibro();
        //System.out.println("Numero di pagine: " + this.numeroPagine);
    }

    @Override
    public void getDettagliSpecifici() {
        System.out.println("\nAutore del fumetto: " + this.autore + "\nIsbn: " + this.isbn + "\nNumero di pagine: " + this.numeroPagine);
    }

    @Override
    public boolean matchRicerca(String chiave) {
        return false;
    }
}
