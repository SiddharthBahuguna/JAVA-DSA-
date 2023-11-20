import java.util.*;  ///------------------wrong code-------------------//

public class UniquePathsII {
    public static int mazeObstacle(int n, int m, ArrayList<ArrayList<Integer>> mat) {
        int dp[][] = new int[n][m];

        dp[0][0] = 1;

        for (int i = 1; i < n; i++) {
            if (mat.get(i).get(0) != -1) {
                dp[i][0] = dp[i - 1][0];
            }
        }

        for (int j = 1; j < m; j++) {
            if (mat.get(0).get(j) != -1) {
                dp[0][j] = dp[0][j - 1];
            }
        }

        for (int i = 1; i < n; i++) {
            for (int j = 1; j < m; j++) {
                if (mat.get(i).get(j) != -1) {
                    dp[i][j] = dp[i - 1][j] + dp[i][j - 1];
                }
            }
        }
        return dp[n - 1][m - 1];
    }

    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();

        for (int testCase = 0; testCase < t; testCase++) {
            int n = sc.nextInt();
            int m = sc.nextInt();

            ArrayList<ArrayList<Integer>> mat = new ArrayList<>();

            for (int i = 0; i < n; i++) {
                ArrayList<Integer> row = new ArrayList<>();
                for (int j = 0; j < m; j++) {
                    int value = sc.nextInt();
                    row.add(value);
                }
                mat.add(row);
            }
            int result = mazeObstacle(n, m, mat);
            System.out.println(result);
        }
    }
}