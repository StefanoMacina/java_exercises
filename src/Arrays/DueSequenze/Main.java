package Arrays.DueSequenze;

import java.util.Scanner;
import java.util.Arrays;

public class Main {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        String[] sq1 = new String[5];
        String[] sq2 = new String[5];
        boolean found = false;
        String text;
        int el1 = 0,el2 = 0;
        
        for(int i=1;i<=2;i++){
            if(i == 1){
                System.out.println("--- PRIMA STRINGA ---");
            } else {
                System.out.println("--- SECONDA STRINGA ---");
            }
            for(int j=0;j<5;j++){
                System.out.printf("Inserire valore %d, stringa %d%n".formatted(j+1,i));
               if(i == 1){
                   sq1[j]=input.nextLine();
               } else {
                   sq2[j]=input.nextLine();
               }
            }
        }

        for(int i=0;i<sq2.length;i++){
            String temp = sq2[i];
            for(int j=0; j< sq1.length;j++){
                if (sq1[j].contentEquals(temp)){
                    found = true;
                    el1 = j+1;
                    el2 = i+1;
                }
            }
        }

        System.out.println(Arrays.toString(sq1));
        System.out.println(Arrays.toString(sq2));
        if(found){
            text = "stringa 1 element %s -> stringa 2 element %s%n".formatted(el1,el2);
        } else {
            text ="NO";
        }
        
        System.out.println(text);
    }
}
