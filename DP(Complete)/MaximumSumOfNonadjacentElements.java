import java.util.*;

public class MaximumSumOfNonadjacentElements {
    public static int Fun(ArrayList<Integer> nums) {
        int n = nums.size();

        if (n == 0) {
            return 0; // if AL is empty
        } else if (n == 1) { // if AL has only one element
            return nums.get(0);
        }

        int dp[] = new int[n];
        dp[0] = nums.get(0);
        dp[1] = Math.max(nums.get(1), nums.get(0));

        for (int i = 2; i < n; i++) {
            int incl = dp[i - 2] + nums.get(i);
            int excl = dp[i - 1];

            dp[i] = Math.max(incl, excl);
        }
        return dp[n - 1];
    }

    public static void main(String[] args) {
        ArrayList<Integer> nums = new ArrayList<>();
        nums.add(1);
        nums.add(2);
        nums.add(3);
        nums.add(4);

        int result = Fun(nums);
        System.out.println("Maximum Non-Adjacent Sum: " + result);
    }
}
