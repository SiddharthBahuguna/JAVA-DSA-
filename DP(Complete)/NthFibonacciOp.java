import java.util.*;

public class NthFibonacciOp {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();

        int prev2 = 0;// dp[0]
        int prev = 1;// dp[1]

        for (int i = 2; i <= n; i++) {
            int curr_i = prev + prev2;// dp[i] = dp[i - 1] + dp[i - 2];
            prev2 = prev;
            prev = curr_i;
        }
        System.out.println(prev);
    }
}
// TC=0(n),SC=0(1)