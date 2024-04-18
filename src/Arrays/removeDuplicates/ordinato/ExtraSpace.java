package Arrays.removeDuplicates.ordinato;

import java.util.Arrays;

public class ExtraSpace {

    public static int[] checkSorting(int[] a){
        boolean isSorted = true;
        for(int i=0;i<a.length-1;i++)
        {
            if(a[i] != a[i+1] && a[i] < a[i+1]){
                isSorted = false;
            }
        }
        if(!isSorted) Arrays.sort(a);
        return a;
    }

    public static int removeDuplicates(int[] a, int size){
        if(size == 0 || size == 1) return size;
        checkSorting(a);

        int[] temp = new int[size];
        int count = 0;

        //confrontare ogni elemento con il successivo
        //se il n° è diverso da n°+1, aggiungere a TEMP n° e incrementare cout
        //in ogni caso sovrascrivere l'elemento temp(count) con n°+1 per controllare anche l'ultimo elemento
        for(int i=0;i<size-1;i++)
        {
            if(a[i] != a[i+1])
            {
                temp[count++] = a[i];
            }
            temp[count] = a[i+1];
        }

        //sovrascrivere l'array originale in input con quello temporaneo
        for(int i=0;i<count+1;i++)
        {
            a[i]=temp[i];
        }

        return count;
    }

    public static void main(String[] args) {
        int[] a = {1,1,2,3,2,4,4,5,5};
        int n = removeDuplicates(a,a.length);

        for(int i=0;i<=n;i++)
        {
            System.out.println(a[i]);
        }
    }
}
