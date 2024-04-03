package Ereditarietà_polimorfismo.DadoEMoneta;

import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        List<Item> list = new ArrayList<>(List.of(
                    new Dado(),
                    new Moneta(),
                    new CarteDaPoker(),
                    new CarteNapoletane()
            ));

        for(var el : list){
            System.out.println(el);
        }
    }
}
