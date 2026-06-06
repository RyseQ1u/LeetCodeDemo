package leet.methods._11_GreedyAlgorithm.L122;

public class Leet122_r7 {
    public int maxProfit(int[] prices) {
                int res =0;
                for (int i = 0; i < prices.length-1; i++) {
                    if (prices[i+1]>prices[i])res+=prices[i+1]-prices[i];
                }
                return res;
    }

    public int maxProfit_dp(int[] prices) {
        int n = prices.length;
        int[][] dp = new int[n][2];
        //当天手上没有持有股票的钱
        dp[0][0]=0;
        //当天手上持有股票的钱
        dp[0][1]=-prices[0];
        for (int i = 1; i < prices.length; i++) {
            //当天手上没有持有股票的钱 比较前一天没买入 和 当天卖出股票的钱
            dp[i][0] = Math.max(dp[i-1][0],dp[i-1][1]+prices[i]);
            dp[i][1] = Math.max(dp[i-1][1],dp[i-1][0]-prices[i]);
        }
        return dp[n-1][0];
    }
}
