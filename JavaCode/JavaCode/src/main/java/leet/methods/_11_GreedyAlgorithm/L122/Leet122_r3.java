package leet.methods._11_GreedyAlgorithm.L122;

public class Leet122_r3 {
    public int maxProfit(int[] prices) {
        int res =0;
        for (int i = 0; i < prices.length-1; i++) {
            int diff = prices[i + 1] - prices[i];
            if(diff>0)res+=diff;
        }
        return res;
    }
}
