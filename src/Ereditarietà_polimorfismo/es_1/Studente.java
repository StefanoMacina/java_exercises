package Ereditarietà_polimorfismo.es_1;

public class Studente extends Persona{
    private String matricola, università;

    public String getMatricola() {
        return matricola;
    }

    public void setMatricola(String matricola) {
        this.matricola = matricola;
    }

    public String getUniversità() {
        return università;
    }

    public void setUniversità(String università) {
        this.università = università;
    }

    public Studente(String nome, String cognome, String codiceFiscale, String matricola, String università) {
        super(nome, cognome, codiceFiscale);
        this.matricola = matricola;
        this.università = università;
    }

    @Override
    public String toString() {
        return "Studente{" +
                "matricola='" + matricola + '\'' +
                ", università='" + università + '\'' +
                '}';
    }
}
