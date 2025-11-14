package leet.methods._2_stackAndqueue.review.L239;

import java.util.Deque;
import java.util.LinkedList;

/// 滑动窗口的最大值
public class L239_r4 {
    public int[] maxSlidingWindow(int[] nums, int k) {
        int n = nums.length;
        int[] res = new int[n - k + 1];
        //双向列表
        Deque<Integer> dq = new LinkedList<>();
        for (int l = 1 - k, r = 0; r < n; l++, r++) {
            if (l > 0 && dq.peekFirst() == nums[l - 1]) dq.pollFirst();
            //维护链表递减
            while (!dq.isEmpty() && dq.peekLast() < nums[r]) dq.pollLast();
            dq.addLast(nums[r]);
            if (l >= 0) {
                res[l] = dq.peekFirst();
            }
        }
        return res;
    }
}
