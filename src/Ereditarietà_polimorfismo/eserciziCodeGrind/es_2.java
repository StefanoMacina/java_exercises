package Ereditarietà_polimorfismo.eserciziCodeGrind;

import java.util.ArrayList;
import java.util.List;

public class es_2 {
    public static void main(String[] args) {
        List<Forma> list = new ArrayList<>(List.of(
                new Quadrato(20,10),
                new Rettangolo(5,70),
                new Cerchio(9)
        ));
        for(var el : list){
            System.out.println(el);
        }
    }
}
abstract class Forma{
    double l1,l2,r;
    abstract double calcolaArea();
    public Forma(double l1, double l2){
        this.l1 = l1;
        this.l2 = l2;
    }
    public Forma(double r){
        this.r = r;
    }

    @Override
    public String toString() {
        return "Area del %s -> %.2f".formatted(this.getClass().getSimpleName(), calcolaArea());
    }
}
class Quadrato extends Forma{
    public Quadrato(double l1, double l2) {
        super(l1, l2);
    }

    @Override
    double calcolaArea() {
        return l1*l2;
    }
}
class Rettangolo extends Forma{
    public Rettangolo(double l1, double l2) {
        super(l1, l2);
    }
    @Override
    double calcolaArea() {
        return l1*l2;
    }
}
class Cerchio extends Forma{
    public Cerchio(double r) {
        super(r);
    }
    @Override
    double calcolaArea() {
        return Math.PI * Math.pow(r,2);
    }
}