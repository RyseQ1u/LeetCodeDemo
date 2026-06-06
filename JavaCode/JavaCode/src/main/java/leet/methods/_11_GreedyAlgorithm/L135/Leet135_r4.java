package leet.methods._11_GreedyAlgorithm.L135;

public class Leet135_r4 {
    public int candy(int[] ratings) {
        //双向遍历 贪心
        int n = ratings.length, res = 0;
        int[] left = new int[n], right = new int[n];
        for (int i = 1; i < n; i++) {
            if (ratings[i - 1] < ratings[i]) {
                left[i] = left[i - 1] + 1;
            }
        }
        for (int i = n - 2; i >= 0; i--) {
            if (ratings[i] > ratings[i + 1]) {
                right[i] = right[i + 1] + 1;
            }
        }
        for (int i = 0; i < n; i++) {
            res += Math.max(left[i], right[i]);
        }
        return res + n;
    }
}
