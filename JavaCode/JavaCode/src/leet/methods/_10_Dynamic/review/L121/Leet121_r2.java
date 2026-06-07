package leet.methods._10_Dynamic.review.L121;

public class Leet121_r2 {
    public int maxProfit(int[] prices) {
        int res=0,min =Integer.MAX_VALUE;
        //维护目前为止买入的最低价格
        for (int p : prices) {
            min = Math.min(min, p);
            res = Math.max(res, p - min);
        }
        return res;
    }
}
