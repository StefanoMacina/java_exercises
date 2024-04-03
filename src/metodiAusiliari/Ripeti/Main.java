package metodiAusiliari.Ripeti;

import javax.print.DocFlavor;
import java.util.InputMismatchException;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Inserire una stringa");
        String s = input.nextLine();
        System.out.println("Inserire un numero");
        int n;
        while(true){
            try{
                n = input.nextInt();
                if(n<0){
                    System.out.println("ERRORE: numero negativo");
                }
                else {
                    printStringTimes(s,n);
                    input.close();
                    break;
                }
            }catch (InputMismatchException e){
               System.out.println("ERRORE: inserito un valore non numerico \n inserire un numero valido");
                input.nextLine();
            }

        }
    }
    public static void printStringTimes(String s, int n)
    {
        while(n > 0){
            System.out.println(s);
            n--;
        }
    }
}
