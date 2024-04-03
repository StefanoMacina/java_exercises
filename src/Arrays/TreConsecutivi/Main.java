package Arrays.TreConsecutivi;

public class Main {
    public static void main(String[] args) {

        int[] nums = new int[]{1,2,3,4,4,4,5,6,7,8};

        String txt = "NO";
        for(int i=2;i<nums.length;i++){
            if(nums[i] == nums[i-1] && nums[i-1] == nums[i-2]){

                txt = "Tre consecutivi trovati da indice : %d a indice %d%n".formatted((i-2),i);
            };
        }

        System.out.println(txt);
    }
}
