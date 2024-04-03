package Ereditarietà_polimorfismo.es_1;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("quante persone vuoi inserire?");
        int size = input.nextInt();
        ElencoPersone elenco = new ElencoPersone(size);

        while(size > 0){
            System.out.println("""
                    d = docente,
                    s = studente
                    """);
            switch (input.next()){
                case "S","s" -> {
                    System.out.println("nome");
                    String nome = input.next();
                    System.out.println("cognome");
                    String cognome = input.next();
                    System.out.println("codice fiscale");
                    String codice_fiscale = input.next();
                    System.out.println("matricola");
                    String matricola = input.next();
                    System.out.println("università");
                    String uni = input.next();
                    Studente s = new Studente(nome,cognome,codice_fiscale,matricola,uni);
                    elenco.aggiungiPersona(s);
                }
                case "D","d" -> {
                    System.out.println("nome");
                    String nome = input.next();
                    System.out.println("cognome");
                    String cognome = input.next();
                    System.out.println("codice fiscale");
                    String codice_fiscale = input.next();
                    System.out.println("materia");
                    String materia = input.next();
                    System.out.println("salario");
                    String salario = input.next();
                    Studente s = new Studente(nome,cognome,codice_fiscale,materia,salario);
                    elenco.aggiungiPersona(s);
                }
            }
            size--;
        }
        System.out.println(elenco);
    }
}
