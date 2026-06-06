package leet.methods._10_Dynamic.review.L121;

public class Leet121_r1 {
    public int maxProfit(int[] prices) {
        //寻找最低的买入价格 计算今日卖出的最大利润
        int res = 0, min = Integer.MAX_VALUE;
        for (int p : prices) {
            min = Math.min(min, p);
            res = Math.max(res, p - min);
        }
        return res;
    }
}
