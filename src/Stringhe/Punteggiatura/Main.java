package Stringhe.Punteggiatura;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        String specialChars = ".,;:!?";
        int len = 0;

        while(true)
        {
            Scanner input = new Scanner(System.in);
            System.out.println("inserire stringhe , stringa vuota per terminare");
            String v = input.nextLine();

            if(v.isBlank()){
                input.close();
                break;
            }
            for(int i=0;i<v.length();i++) {
                if(specialChars.contains(String.valueOf(v.charAt(i)))) len++;
            }

        }
        System.out.println("detected %d special chars".formatted(len));

    }
}
