package Stringhe.Contario;

import java.util.Scanner;

public class Main {
    static Scanner input = new Scanner(System.in);

    public static void main(String[] args) {
        System.out.println("String to revert : ");
        String y = "";
        char ch;

        String x = input.nextLine();

        for(int i=0; i<x.length();i++){
            ch = x.charAt(i);
            y = ch + y;
        }
        input.close();
        System.out.println("reversed word: " + y);

    }
}
