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
        int res =0;
        return res;
    }
}
