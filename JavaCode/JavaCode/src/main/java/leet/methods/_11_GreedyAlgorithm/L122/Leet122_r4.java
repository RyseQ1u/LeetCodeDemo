package leet.methods._11_GreedyAlgorithm.L122;

public class Leet122_r4 {
    public int maxProfit(int[] prices) {
        int res =0;
        for (int i = 0; i < prices.length-1; i++) {
            int diff = prices[i+1]-prices[i];
            if(diff>0)res+=diff;
        }
        return res;
    }

    public int maxProfit_dp(int[] prices) {
        if(prices.length<2)return 0;
        int[][] dp = new int[prices.length][2];
        //手上没有股票时的金额
        dp[0][0]=0;
        //手上持有股票时的金额
        dp[0][1]=-prices[0];
        for (int i = 1; i < prices.length; i++) {
            //前一天手上持有股票的钱+今日股价卖出
            dp[i][0]=Math.max(dp[i-1][1]+prices[i],dp[i-1][0]);
            //前一天手上没有股票的钱-今日股价买入
            dp[i][1]=Math.max(dp[i-1][0]-prices[i],dp[i-1][1]);
        }
        return dp[prices.length-1][0];
    }
}
