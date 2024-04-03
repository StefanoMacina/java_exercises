package Arrays.SecondoArray;

import java.util.InputMismatchException;
import java.util.Scanner;
import java.util.Arrays;

public class Main {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int count = 0;
        int secondArrayLength = 0;
        int[] nums = new int[10];
        while(count<10){
            try{
                System.out.printf("Inserire il numero %d%n", count + 1);
                int x = input.nextInt();
                if(x >= 0) secondArrayLength++;

                nums[count] = x;
                count++;
            }catch (InputMismatchException e){
                System.out.println("Formato del numero non valido \n inserisci un numero valido");
                input.nextLine();
            }
        }

        int[] secondArray = new int[secondArrayLength];
        for(int i=0;i< nums.length;i++){
            if(nums[i] >= 0) secondArray[i]=nums[i];
        }
        for(int i=secondArrayLength - 1;i>=0; i--){
            System.out.println(secondArray[i]);
        }
        System.out.println(Arrays.toString(nums));

    }
}
