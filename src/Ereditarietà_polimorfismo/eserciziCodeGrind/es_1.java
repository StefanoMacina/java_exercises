package Ereditarietà_polimorfismo.eserciziCodeGrind;

import java.text.DecimalFormat;
import java.util.Random;

public class es_1 {
    public static void main(String[] args) {
        Veicolo v1 = new auto();
        System.out.println(v1.CalcolaVelocita());
        Veicolo v2 = new Camion();
        System.out.println(v2.CalcolaVelocita());
    }
}

abstract class Veicolo{
    DecimalFormat df = new DecimalFormat("#.##");
    double velocita;
    public abstract double CalcolaVelocita();
    public Veicolo(){
        Random r = new Random();
        velocita = Double.parseDouble(df.format(r.nextDouble(0.0,350)));
    }
}

class auto extends Veicolo{

    @Override
    public double CalcolaVelocita() {
        return velocita;
    }
}
class Camion extends Veicolo{
    @Override
    public double CalcolaVelocita() {
        return velocita;
    }
}
