import java.util.*;

public class ClimbingStairs {
    public static int countWays(int n) {
        if (n <= 1)
            return 1;

        int dp[] = new int[n + 1];
        int prev2 = 1, prev = 1;

        for (int i = 2; i <= n; i++) {
            int curr_i = prev + prev2;
            prev2 = prev;
            prev = curr_i;
        }

        return prev;
    }

    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        System.out.println(countWays(n));
    }
}
