package Arrays.DoppioUnoDellAltro;

public class Main {
    public static void main(String[] args) {
        int[] nums = new int[]{1,2,3,5,7};

        String text = "NO";

        for (int temp : nums) {
            for (int num : nums) {
                if ((temp * 2 == num)) {
                    text = "Doppio uno dell'altro";
                    break;
                }
            }
        }

        System.out.println(text);

    }
}
