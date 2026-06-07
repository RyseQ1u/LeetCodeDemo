package leet.methods._11_GreedyAlgorithm;

/**
 * 买卖股票的最佳时机 II
 */
public class Leet122 {

    /**
     * 前缀差 贪心 每天都买入卖出 统计盈利的日期
     */
    public int maxProfit(int[] prices) {
        int res =0;
        for (int i = 0; i < prices.length -1; i++) {
            if(prices[i + 1] > prices[i]) res+=prices[i + 1] - prices[i];
        }
        return res;
    }

    /**
     * 动态规划 维护每日利润的最大值
     */
    public int maxProfit_2(int[] prices) {
        int n =prices.length;
        //利润数组 [0]代表手上没有股票的利润 [1]代表手上有股票的利润
        int[][] dp = new int[n][2];
        dp[0][0]=0;
        dp[0][1]=-prices[0];
        for (int i = 1; i < n; i++) {
            //今日没有持有股票的情况 1.今天没有买--使用昨天的利润 2.今天卖出了--使用昨天持有的利润加今天的股价
            dp[i][0] = Math.max(dp[i-1][0],dp[i-1][1]+prices[i]);
            //今日持有股票的情况 1.今天买入的--使用昨天没有持有的利润减今天的价格 2.之前买入的--使用昨天持有的利润
            dp[i][1] =Math.max(dp[i-1][0] - prices[i],dp[i-1][1]);
        }
        //最后一天的情况，卖出的比不卖出大，所以结果返回最后一天手上没有股票的利润
        return dp[n-1][0];
    }
}
