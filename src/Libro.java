abstract public class Libro implements Prestabile, Ricercabile {
    private Integer id;
    private String nome;
    private Integer dataPubblicazione;
    private GenereEnum genereEnum;
    private StatoPrestitoEnum stato;

    public Libro(Integer id, String nome, Integer dataPubblicazione, GenereEnum genereEnum) {
        this.id = id;
        this.nome = nome;
        this.dataPubblicazione = dataPubblicazione;
        this.genereEnum = genereEnum;
        this.stato = StatoPrestitoEnum.DISPONIBILE;
    }

    public StatoPrestitoEnum getStato() {
        return stato;
    }

    public void setStato(StatoPrestitoEnum stato) {
        this.stato = stato;
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

    public Integer getDataPubblicazione() {
        return dataPubblicazione;
    }

    public GenereEnum getGenereEnum() {
        return genereEnum;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public void setDataPubblicazione(Integer dataPubblicazione) {
        this.dataPubblicazione = dataPubblicazione;
    }

    public void setGenereEnum(GenereEnum genereEnum) {
        this.genereEnum = genereEnum;
    }

    public void stampaLibro() {
        System.out.println("\nLibro: " + this.nome + "\nData di pubblicazione: " +
                this.dataPubblicazione + "\nGenere del libro: " + this.genereEnum);
    }

    public abstract void getDettagliSpecifici();

    @Override
    public void prestito() {
        if (this.stato == StatoPrestitoEnum.DISPONIBILE) {
            this.stato = StatoPrestitoEnum.PRESTATO;
            System.out.println("Il libro " + this.nome + " è stato prestato");
        } else {
            System.out.println("Il libro " + this.nome + " non è disponibile");
        }

    }

    @Override
    public void restituzione() {
        if (this.stato == StatoPrestitoEnum.PRESTATO) {
            this.stato = StatoPrestitoEnum.DISPONIBILE;
            System.out.println("Il libro " + this.nome + " è stato restituito");
        } else {
            System.out.println("Il libro " + this.nome + " è già disponibile");
        }
    }

    @Override
    public void isDisponibile() {
        if (this.stato == StatoPrestitoEnum.DISPONIBILE) {
            System.out.println("Libro disponibile");
        } else {
            System.out.println("Libro non disponibile");
        }
    }
}
