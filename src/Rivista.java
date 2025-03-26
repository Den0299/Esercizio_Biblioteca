public class Rivista extends Libro {

    private Integer numeroEdizione;

    public Rivista(Integer id, String nome, Integer dataPubblicazione, GenereEnum genereEnum, Integer numeroEdizione) {
        super(id, nome, dataPubblicazione, genereEnum);
        this.numeroEdizione = numeroEdizione;
    }

    public Integer getNumeroEdizione() {
        return numeroEdizione;
    }

    public void setNumeroEdizione(Integer numeroEdizione) {
        this.numeroEdizione = numeroEdizione;
    }

    @Override
    public void stampaLibro() {
        super.stampaLibro();
        System.out.println("Numero edizione: " + this.numeroEdizione);
        //stampare
    }

    @Override
    public void getDettagliSpecifici() {
        System.out.println("\nNumero edizione della rivista: " + this.numeroEdizione);
    }

    @Override
    public boolean matchRicerca(String chiave) {
        return false;
    }
}
