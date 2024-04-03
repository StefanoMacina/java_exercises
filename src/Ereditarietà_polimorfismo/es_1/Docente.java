package Ereditarietà_polimorfismo.es_1;

public class Docente extends Persona{
    private String materia;
    private double salario;

    public String getMateria() {
        return materia;
    }

    public void setMateria(String materia) {
        this.materia = materia;
    }

    public double getSalario() {
        return salario;
    }

    public void setSalario(double salario) {
        this.salario = salario;
    }
    public Docente(String nome, String cognome, String codiceFiscale, String materia, double salario){
        super(nome,cognome,codiceFiscale);
        this.materia = materia;
        this.salario = salario;
    }

    @Override
    public String toString() {
        return "Docente{" +
                "materia='" + materia + '\'' +
                ", salario=" + salario +
                '}';
    }
}
