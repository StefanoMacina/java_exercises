package Ereditarietà_polimorfismo.es_1;

import java.util.Arrays;

public class ElencoPersone {
    private Persona[] elencoPersone;
    static int count = 0;

    public ElencoPersone(int size) {
        elencoPersone = new Persona[size];
    }

    public Persona aggiungiPersona(Persona p){
        if(count < elencoPersone.length){
            elencoPersone[count] = p;
            count++;
            return p;
        }
        System.out.println("raggiunto il limite di %d persone".formatted(count));
        return null;
    }

    @Override
    public String toString() {
        return "ElencoPersone{" +
                "elencoPersone=" + Arrays.toString(elencoPersone) +
                '}';
    }
}
