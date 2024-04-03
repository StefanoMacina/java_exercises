package Stringhe.SpaziVocali;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        int len = 0;
        String vocali = "aeiou";

        Scanner input = new Scanner(System.in);
        System.out.println("Inserire stringa");
        String v = input.nextLine().toLowerCase();

        for(int i=1; i<v.length();i++){

            int indx;
            if(vocali.contains(String.valueOf(v.charAt(i)))){

                if(v.charAt(i - 1) == ' ') len++;

            }
        }
        System.out.println(len);
    }
}
