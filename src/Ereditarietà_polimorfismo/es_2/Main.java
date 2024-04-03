package Ereditarietà_polimorfismo.es_2;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        List<Shape> list = new ArrayList<>();

        while(true){
            System.out.println("""
                    l'array contiene : %s
                    tipologia di forma:
                    c = cilindro
                    p = parallelepipedo
                    q = quit""".formatted(list));
            switch (input.next()) {
                case "c", "C" -> {
                    System.out.println("Raggio del cerchio");
                    double r = input.nextDouble();
                    System.out.println("altezza del cilindro");
                    double alt = input.nextDouble();
                    Cilindro c = new Cilindro(alt, r);
                    list.add(c);
                    System.out.println("Cilindro inserito nella lista");

                }
                case "p", "P" -> {
                    System.out.println("lato 1");
                    double l1 = input.nextDouble();
                    System.out.println("lato 2");
                    double l2 = input.nextDouble();
                    System.out.println("altezza del cilindro");
                    double alt = input.nextDouble();
                    Parallelepipedo p = new Parallelepipedo(alt, l1, l2);
                    list.add(p);
                    System.out.println("Parallelepipedo inserito nella lista");
                }
                default -> {
                    input.close();
                    return;
                }
            }
        }
    }
}
