import java.util.*;

public class FrogJump {
    public static int jump(int n, int heights[]) {
        int dp[] = new int[n];
        dp[0] = 0;

        for (int i = 1; i < n; i++) {
            int jumpOne = dp[i - 1] + Math.abs(heights[i] - heights[i - 1]);
            int jumpTwo = Integer.MAX_VALUE;

            if (i > 1) {
                jumpTwo = dp[i - 2] + Math.abs(heights[i] - heights[i - 2]);
            }
            dp[i] = Math.min(jumpOne, jumpTwo);
        }
        return dp[n - 1];
    }

    public static void main(String args[]) {
        int n = 6;
        int heights[] = { 30, 10, 60, 10, 60, 50 };

        System.out.println(jump(n, heights));
    }
}