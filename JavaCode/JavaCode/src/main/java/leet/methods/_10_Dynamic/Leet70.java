package leet.methods._10_Dynamic;

/**
 * 爬楼梯
 */
public class Leet70 {
    /**
     * 循环
     */
    public int climbStairs(int n) {
        if (n == 1) return 1;
        int[] dp = new int[n];
        dp[0] = 1;
        dp[1] = 1;
        for (int i = 2; i < n; i++) {
            dp[i] = dp[i - 1] + dp[i - 2];
        }
        return dp[n - 1];
    }

    /**
     * 循环
     * 空间大小优化
     */
    public int climbStairs_2(int n) {
        int a = 1, b = 1, sum = 0;
        for (int i = 2; i < n-1; i++) {
            sum = a + b;
            a = b;
            b = sum;
        }
        return b;
    }
}
