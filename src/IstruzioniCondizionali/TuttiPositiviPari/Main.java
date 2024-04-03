package IstruzioniCondizionali.TuttiPositiviPari;

import java.util.Scanner;

public class Main {
    static Scanner sc = new Scanner(System.in);

    public static void main(String[] args) {

        System.out.println("dimensione :");
        int size = sc.nextInt();
        String text = "Tutti positivi e pari";

        for(int i=1;i<=size;i++){
            System.out.println("numero " + i + " : ");
            int val = sc.nextInt();
            
            if(val % 2 != 0 || val < 0) {
                text = "no";
            }
        }
        sc.close();
        System.out.println(text);

    }
}
