package leet.methods._10_Dynamic.review.L121;

public class Leet121_r3 {
    public int maxProfit(int[] prices) {
        int res=0,min=Integer.MAX_VALUE;
        //维护当前日期之前的最低价 在当天买入即为最大利润的买入价格
        for (int price : prices) {
            min = Math.min(min,price);
            //维护利润最大值 使用当前价格-最小值=当日卖出的最高利润
            res=Math.max(res,price-min);
        }
        return res;
    }
}
