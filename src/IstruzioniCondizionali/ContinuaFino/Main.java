package IstruzioniCondizionali.ContinuaFino;

import java.util.Scanner;

public class Main {
    static Scanner sc = new Scanner(System.in);

    public static void main(String[] args) {
        System.out.println("""
                Inserire una sequenza di interi dove
                        x > 0 && x % 3 = 0  or
                        x < 0 && x % 2 = 0 %n""");
        int sum = 0;

        while(true)
        {
            int x = sc.nextInt();

            if(x % 2 == 0 && x < 0 || x % 3 == 0 && x > 0)
            {
                sum += x;
                System.out.println(x + " is a valid value");
            } else{
                System.out.printf("Condizioni non rispettate, %d is not a valid value %n",x);
                sc.close();
                break;
            }
        }
        System.out.println(sum);
    }
}
