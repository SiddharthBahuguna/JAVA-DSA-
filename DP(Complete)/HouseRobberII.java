import java.util.*;

public class HouseRobberII {
    public static long houseRobber(int valueInHouse[]) {
        int n = valueInHouse.length;

        if (n == 0) {// id there is no house thief can't rob anything
            return 0;
        } else if (n == 1) { // if there is only one house thief can rob that house
            return valueInHouse[0];
        } else if (n == 2) { // if there are 2 houses thief will rob the house with more money
            return Math.max(valueInHouse[0], valueInHouse[1]);
        }

        // calculate the maximum when considering the first house but excluding the last
        // house
        long dp1[] = new long[n];
        dp1[0] = valueInHouse[0];// money in first house
        dp1[1] = Math.max(valueInHouse[0], valueInHouse[1]);// max of first two house
        for (int i = 2; i < n - 1; i++) {
            dp1[i] = Math.max(dp1[i - 1], dp1[i - 2] + valueInHouse[i]);
        }

        // calculate the maximum when excluding the first house but considering the last
        // house
        long dp2[] = new long[n];
        dp2[1] = valueInHouse[1];// money in second house
        dp2[2] = Math.max(valueInHouse[1], valueInHouse[2]);// max of second and third house
        for (int i = 3; i < n; i++) {
            dp2[i] = Math.max(dp2[i - 1], dp2[i - 2] + valueInHouse[i]);
        }
        return Math.max(dp1[n - 2], dp2[n - 1]);
    }
}
