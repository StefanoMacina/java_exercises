package Ereditarietà_polimorfismo.eserciziCodeGrind;

import java.util.ArrayList;
import java.util.List;

public class es_3 {
    public static void main(String[] args) {
        List<Animal> animals = new ArrayList<>(List.of(
                new Leone(),
                new Pecora()
        ));
        for(var el : animals){
            System.out.println(el);
        }
    }
}

abstract class Animal{
    abstract String emettiSuono();
    @Override
    public String toString() {
        return "%s -> %s ".formatted(this.getClass().getSimpleName(),emettiSuono());
    }
}
class Leone extends Animal{
    @Override
    String emettiSuono() {
       return "Ruggito";
    }
}
class Pecora extends Animal{
    @Override
    String emettiSuono() {
        return "Beeee";
    }
}