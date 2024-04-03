package Stringhe.SoloVocali;

import java.util.Scanner;

public class Main {
    static Scanner input = new Scanner(System.in);

    public static void main(String[] args) {
        System.out.println("Inserire una stringa");
        String vocali = "aeiou";
        String result = "";
        String x = input.nextLine();

        for(int i=0; i<x.length();i++){
            if(vocali.contains(String.valueOf(x.charAt(i)).toLowerCase())){
                result += x.charAt(i);
            };
        }
        input.close();
        System.out.println(result);
    }
}
