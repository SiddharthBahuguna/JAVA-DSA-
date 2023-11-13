import java.util.*;

public class GridUniquePaths {
    public static int countWays(int m, int n) {
        int dp[][] = new int[m][n];

        for (int i = 0; i < m; i++) {
            dp[i][0] = 1;// initialize first col of dp to 1 as there is only one way to reach any cell in
                         // first col.(by moving down)
        }

        for (int j = 0; j < n; j++) {
            dp[0][j] = 1;// initialize first row of dp to 1 as there is only one way to reach any cell in
                         // first row(by moving right)
        }

        for (int i = 1; i < m; i++) {
            for (int j = 1; j < n; j++) {
                dp[i][j] = dp[i - 1][j] + dp[i][j - 1];
            }
        }
        return dp[m - 1][n - 1];
    }

    public static void main(String args[]) {

        int m = 3;
        int n = 2;

        System.out.println(countWays(m, n));
    }
}
