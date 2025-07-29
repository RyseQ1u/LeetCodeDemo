package leet.methods._10_Dynamic;

import java.util.HashSet;
import java.util.PriorityQueue;
import java.util.Set;

/**
 * 丑数
 */
public class Leet264 {
    /**
     * 暴力破解 超时
     */
    public int nthUglyNumber(int n) {
        int i =1;
        while (n>0){
            if(i / 2 == 1){
                if(i /3 == 1){
                    if(i/5==1){
                        n--;
                    }
                }
            }
            i++;
        }
        return i;
    }

    /**
     * 优先队列 + hash去重
     *  乘 2,3,5
     */
    public int nthUglyNumber_2(int n) {
        int[] factors = new int[]{2,3,5};
        Set<Long> set = new HashSet<>();
        PriorityQueue<Long> pq = new PriorityQueue<>();
        set.add(1L);
        pq.add(1L);
        int res = 0;
        for (int i = 0; i < n; i++) {
            long cur = pq.poll();
            res = (int) cur;
            for (int factor : factors) {
                long next = factor * cur ;
                if(set.add(next)){
                    pq.add(next);
                }
            }
        }
        return res;

    }
    /**
     * 动态规划
     * 乘 2,3,5
     */
    public int nthUglyNumber_3(int n) {
        int[] dp = new int[n];
        dp[0] = 1;
        int a = 0, b = 0, c = 0;
        for (int i = 1; i < n; i++) {
            int n2 = dp[a] * 2, n3 = dp[b] * 3, n5 = dp[c] * 5;
            //取三个中的最小值
            dp[i] = Math.min(n2, Math.min(n3, n5));
            if (dp[i] == n2) a++;
            if (dp[i] == n3) b++;
            if (dp[i] == n5) c++;

        }
        return dp[n - 1];
    }
}
