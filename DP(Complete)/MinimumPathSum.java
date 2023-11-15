import java.util.*;

public class MinimumPathSum {
    public int minPathSum(int grid[][]) {
        int m = grid.length;
        int n = grid[0].length;

        int dp[][] = new int[m][n];

        dp[0][0] = grid[0][0];

        // fill the first row
        for (int i = 1; i < n; i++) {
            // Each cell in the first row stores the sum of the cell to its left and the
            // corresponding cell in the grid
            dp[0][i] = dp[0][i - 1] + grid[0][i];
        }

        // fill the first column
        for (int i = 1; i < m; i++) {
            // Each cell in the first column stores the sum of the cell above it and the
            // corresponding cell in the grid
            dp[i][0] = dp[i - 1][0] + grid[i][0];
        }

        // fill the rest of the table
        for (int i = 1; i < m; i++) {
            for (int j = 1; j < n; j++) {
                dp[i][j] = Math.min(dp[i - 1][j], dp[i][j - 1]) + grid[i][j];
            }
        }
        return dp[m - 1][n - 1];
    }

    public static void main(String args[]) {

        int matrix[][] = { { 5, 9, 6 }, { 11, 5, 2 } };

        MinimumPathSum solution = new MinimumPathSum();
        int result = solution.minPathSum(matrix);

        System.out.println(result);
    }
}
