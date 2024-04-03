package IstruzioniCondizionali.ArrayObjectMinVal;

import java.util.Arrays;

public class Main {
    public static void main(String[] args) {

        Docente[] docenti = new Docente[]{
                new Docente("Carla","Baudo","sd86",17),
                new Docente("Giavanni","Urs","erg3",17),
                new Docente("Francesco","Zanni","fgh34",17),
                new Docente("Luisa","Maggi","yiuk",19),
        };

        University uniba = new University(docenti);
        System.out.println(uniba.minAge());
        System.out.println(Arrays.toString(uniba.trovaGiovani()));


    }
}
