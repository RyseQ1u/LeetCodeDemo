package leet.methods._10_Dynamic;

/**
 * 买卖股票的最佳时机
 */
public class Leet121 {

    /**
     * 买卖股票的最佳时机
     */
    public int maxProfit(int[] prices) {
        int res = 0,min =Integer.MAX_VALUE;
        for (int price : prices) {
            //记录历史最低的价格
            min = Math.min(min, price);
            //记录今天卖出的最大利润
            res = Math.max(res, price - min);
        }
        return res  ;
    }
}
