import java.util.ArrayList;
import java.util.Arrays;

public class Runner {
    public static void main(String[] args) {
        ArrayList<Integer> nums = new ArrayList<Integer>(Arrays.asList(1, 2, 3, 4, 5, 6, 7));
        for(int i = 0; i < nums.size() - 2;i++)
        {
            int sum = nums.get(i+1) + nums.get(i+2);
            nums.set(i,sum);
        }
        System.out.println(nums);
    }
}
