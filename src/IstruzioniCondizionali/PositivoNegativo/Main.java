package IstruzioniCondizionali.PositivoNegativo;

import java.util.Scanner;

public class Main {
    static Scanner sc = new Scanner(System.in);

    public static void main(String[] args) {
        int sum = 0;
        int lenDivisoTre = 0;
        System.out.println("quanti numeri ? :");
        int len = sc.nextInt();
        for(int i=1;i<=len;i++){
            System.out.println("inserire il numero " + i);
            int x = sc.nextInt();
            if(x % 3 == 0){
                lenDivisoTre++;
                sum += x;
            };
        }
        int avg = sum/lenDivisoTre;
        System.out.printf("la media è %d%n", avg);
    }
}
