package leet.methods._13_Math;

import java.util.LinkedList;
import java.util.Queue;

/**
 * 找出游戏的获胜者
 */
public class Leet1823 {

    /**
     * 使用队列
     */
    public int findTheWinner(int n, int k) {
        Queue<Integer> queue = new LinkedList<>();
        for (int i = 1; i <= n; i++) {
            queue.add(i);
        }
        int t = 0;
        while (queue.size() > 1) {
            int tmp = queue.poll();
            if (++t == k) {
                t = 0;
            } else {
                queue.add(tmp);
            }
        }
        return queue.poll();
    }

    /**
     * 公式法
     * 约瑟夫环 f(n)=(f(n-1)+m)%n
     * 得到结果是下标
     */
    public int findTheWinner_V2(int n, int k) {
        if (n == 1) {
            return 1;
        }
        return (findTheWinner(n-1,k)-1+k)%n+1;
    }

    /**
     * 公式法
     * 优化空间
     */
    public int findTheWinner_V3(int n, int k) {
        int res= 0;
        for (int i = 2; i <= n; i++) {
            res = (res+k)%i;
        }
        return res+1;
    }
}
