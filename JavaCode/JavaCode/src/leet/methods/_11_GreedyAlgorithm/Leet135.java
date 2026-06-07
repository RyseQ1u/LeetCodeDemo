package leet.methods._11_GreedyAlgorithm;

import java.util.Arrays;

/**
 * 分发糖果
 */
public class Leet135 {

    /**
     * 遍历两次
     * 找出满足左规则和又规则的最大值
     */
    public int candy(int[] ratings) {
        int[] l = new int[ratings.length];
        int[] r = new int[ratings.length];
        Arrays.fill(l,1);
        Arrays.fill(r,1);
        //从左到右
        for (int i = 1; i < ratings.length; i++) {
            if(ratings[i]>ratings[i-1]) l[i]=l[i-1]+1;
        }
        int res = l[ratings.length-1];
        for(int i = ratings.length - 2; i >= 0; i--) {
            if(ratings[i] > ratings[i + 1]) r[i] = r[i + 1] + 1;
            res += Math.max(l[i], r[i]);
        }
        return res;
    }
}
