package Arrays.StampaZizZag;

public class Main {
    public static void main(String[] args) {
        int [] nums = new int[]{1,2,3,4,5,6,7,8,9,10};
        int x = nums.length;
        for(int i=0; i < nums.length; i++){
            int w = nums[i];
            int q = nums[x - 1];
            x--;
            System.out.println(w);
            System.out.println(q);
        }

    }
}
