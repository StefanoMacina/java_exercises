package metodiAusiliari.Concatena;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.println("Inserire tre parole");

        String a = in.nextLine();
        String b = in.nextLine();
        String c = in.nextLine();

        System.out.println(concatena(a,b,c));

    }

    public static String concatena(String a, String b, String c){
        return "%s*%s*%s".formatted(a,b,c);
    }
}
