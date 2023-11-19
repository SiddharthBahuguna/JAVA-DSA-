import java.util.*;

class MinimumPathSumTriangularGrid {
    static int minimumPathSum(int[][] triangle, int n) {
        int[] dp = new int[n]; // Use a single array to store intermediate results

        // Initialize dp array with the values from the bottom row of the triangle
        for (int j = 0; j < n; j++) {
            dp[j] = triangle[n - 1][j];
        }

        for (int i = n - 2; i >= 0; i--) {
            for (int j = 0; j <= i; j++) {
                int down = triangle[i][j] + dp[j];
                int diagonal = triangle[i][j] + dp[j + 1];
                dp[j] = Math.min(down, diagonal);
            }
        }

        return dp[0];
    }

    public static void main(String args[]) {
        int triangle[][] = {
                { 1 },
                { 2, 3 },
                { 3, 6, 7 },
                { 8, 9, 6, 10 }
        };

        int n = triangle.length;

        System.out.println(minimumPathSum(triangle, n));
    }
}
