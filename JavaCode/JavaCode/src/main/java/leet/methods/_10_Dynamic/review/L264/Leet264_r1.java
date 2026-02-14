package leet.methods._10_Dynamic.review.L264;

public class Leet264_r1 {
    public int nthUglyNumber(int n) {
        int[] dp = new int[n];
        dp[0] = 1;
        int i2 = 0, i3 = 0, i5 = 0;
        for (int i = 1; i < n; i++) {
            int n2 = dp[i2] * 2, n3 = dp[i3] * 3, n5 = dp[i5] * 5;
            dp[i] = Math.min(Math.min(n2, n3), n5);
            if (dp[i] == n2) i2++;
            if (dp[i] == n3) i3++;
            if (dp[i] == n5) i5++;
        }
        return dp[n - 1];
    }
}
