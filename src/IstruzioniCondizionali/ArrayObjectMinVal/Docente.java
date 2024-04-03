package IstruzioniCondizionali.ArrayObjectMinVal;

public class Docente {
    private String nome;
    private String cognome;
    private String code;
    private int age;

    public Docente(String nome, String cognome, String code, int age) {
        this.nome = nome;
        this.cognome = cognome;
        this.code = code;
        this.age = age;
    }

    public String getCognome() {
        return cognome;
    }

    public String getCode() {
        return code;
    }

    public int getAge() {
        return age;
    }

    @Override
    public String toString() {
        return "%-10s %-10s %-10s %-10d".formatted(nome,cognome,code,age);
    }
}



