package leet.methods._10_Dynamic.review.L121;

public class Leet121_r6 {
    public int maxProfit(int[] prices) {
        int res=0,min=Integer.MAX_VALUE;
        for (int i = 0; i < prices.length; i++) {
            min=Math.min(prices[i],min);
            res=Math.max(prices[i]-min,res);
        }
        return res;
    }
}
