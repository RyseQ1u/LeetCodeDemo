package leet.methods._2_stackAndqueue.review.L239;

import java.util.LinkedList;

/// 滑动窗口的最大值
public class L239_r5 {
    public int[] maxSlidingWindow(int[] nums, int k) {
        int n = nums.length;
        int[] res = new int[n - k + 1];
        LinkedList<Integer> dq = new LinkedList<>();
        for (int r = 0, l = 1 - k; r < n; r++, l++) {
            if (l > 0 && nums[l - 1] == dq.peekFirst()) dq.removeFirst();
            while (!dq.isEmpty() && dq.peekLast() < nums[r]) dq.removeLast();
            dq.addLast(nums[r]);
            if (l >= 0) {
                res[l] = dq.peekFirst();
            }
        }
        return res;
    }
}
