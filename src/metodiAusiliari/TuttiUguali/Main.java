package metodiAusiliari.TuttiUguali;

import java.util.InputMismatchException;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int n1, n2, n3;
        while(true){
            System.out.println("inserire tre numeri");
            try{
                n1 = input.nextInt();
                n2 = input.nextInt();
                n3 = input.nextInt();

                if(checkEquals(n1,n2,n3)){
                    System.out.println("tutti i numeri sono uguali");
                    input.close();
                    break;
                }
                System.out.println("Almeno un numero è diverso");
                input.close();
                break;
            } catch (InputMismatchException e){
                System.out.println("uno dei numeri non è valido");
                input.nextLine();
            }
        }
    }

    public static boolean checkEquals(int n1, int n2, int n3){
        return n1 == n2 && n2 == n3;
    }
}
