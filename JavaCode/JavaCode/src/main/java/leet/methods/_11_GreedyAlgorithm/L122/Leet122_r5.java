package leet.methods._11_GreedyAlgorithm.L122;

public class Leet122_r5 {
    public int maxProfit(int[] prices) {
        int res =0;
        for (int i = 0; i < prices.length-1; i++) {
            int diff = prices[i+1]-prices[i];
            if(diff>0){
                res+=diff;
            }
        }
        return res;
    }

    public int maxProfit_dp(int[] prices) {
        int res =0;
        if (prices.length<2) return res;
        int[][] dp = new int[prices.length][2];
        dp[0][0]=0;
        dp[0][1]=-prices[0];
        for (int i = 1; i < prices.length; i++) {
            dp[i][0]=Math.max(dp[i-1][1]+prices[i],dp[i-1][0]);
            dp[i][1]=Math.max(dp[i-1][0]-prices[i],dp[i-1][1]);
        }
        return dp[prices.length-1][0];
    }
}
