package Ereditarietà_polimorfismo;

import javax.swing.*;
import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        List<Forma> list = new ArrayList<>();

        Forma q1 = new Quadrilatero(2,3);
        Forma c1 = new Cerchio(5);
        list.add(q1);
        list.add(c1);

        for(Forma el : list){
            System.out.println(el);
        }
    }
}

abstract class Forma{
    abstract double Area();

    @Override
    public String toString() {
        return "area del %s = %.2f".formatted(this.getClass().getSimpleName(), Area());
    }
}

class Cerchio extends Forma{
    private double r;

    public Cerchio(double r) {
        this.r = r;
    }

    @Override
    public double Area() {
        return Math.PI * (r * r);
    }
}

class Quadrilatero extends Forma{
    private double l1,l2;

    public Quadrilatero(double l1, double l2) {
        this.l1 = l1;
        this.l2 = l2;
    }

    @Override
    public double Area() {
        return l1 * l2;
    }
}