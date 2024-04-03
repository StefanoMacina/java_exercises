package Stringhe.Lunghezze;

import java.util.Objects;
import java.util.Scanner;

public class Main {
    static Scanner sc = new Scanner(System.in);

    public static void main(String[] args) {

        int len = 0;

        while(true){
            System.out.println("Inserire stringa");
            String v = sc.nextLine();

            if(v.isBlank()){
                sc.close();
                break;
            }

            if(Character.isUpperCase(v.charAt(0))) len += v.length();
        }
        System.out.println(len);
    }
}
