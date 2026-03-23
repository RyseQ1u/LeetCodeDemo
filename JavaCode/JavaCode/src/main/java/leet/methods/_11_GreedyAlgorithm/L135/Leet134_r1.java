package leet.methods._11_GreedyAlgorithm.L135;

public class Leet134_r1 {
    public int candy(int[] ratings) {
        //二次贪心 左右遍历一遍
        int n = ratings.length, cnt = 0;
        int[] left = new int[n], right = new int[n];
        for (int i = 1; i < n; i++) {
            if (ratings[i - 1] < ratings[i]) {
                left[i]=left[i-1]+1;
            }
        }
        for (int i = n - 2; i >= 0; i--) {
            if (ratings[i + 1] < ratings[i]) {
                right[i]=right[i+1]+1;
            }
        }
        for (int i = 0; i < n; i++) {
            cnt += Math.max(left[i], right[i]);
        }
        return n+cnt;
    }
}
