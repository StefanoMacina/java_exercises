package Arrays.SommaPariDispari;

public class Main {
    public static void main(String[] args) {
        int[] nums = new int[]{2,2,4,4,5,5};

        int sumIndexPari = 0;
        int sumIndexDispari = 0;

        for(int i=0; i<nums.length; i+=2){

           sumIndexPari += nums[i];
           sumIndexDispari += nums[i+1];

        }
        System.out.printf("sum index pari = %d%n", sumIndexPari);
        System.out.printf("sum index dispari = %d%n", sumIndexDispari);

        if (sumIndexDispari == sumIndexPari) {
            System.out.println("Pari e dispari uguali");
        } else {
            System.out.println("Pari e dispari diversi");
        }
    }
}
