public class UnboundedKnapsack {
    for(
    int i = 1;i<n+1;i++)
    {
        for (int j = 1; j < W + 1; j++) {
            if (wt[i - 1] <= j) {
                dp[i][j] = Math.max(val[i - 1] + dp[i][j - wt[i - 1]], dp[i - 1][j]);
            } else {
                dp[i][j] = dp[i - 1][j];
            }
        }
    }

    public static void main(String args[]){
        int val[]={15,14,10,45,30};
        int wt[]={2,5,1,3,4};
        int W=7;
        System.out.println(unboundedKnapsack(val,wt,W));
    }
