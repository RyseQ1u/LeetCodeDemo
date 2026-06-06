package leet.methods._4_doublePointer.review.L239;

import java.util.Deque;
import java.util.LinkedList;

/// 滑动窗口的最大值
public class L239_r6 {
    public int[] maxSlidingWindow(int[] nums, int k) {
        int n = nums.length,l=1-k;
        int[] res = new int[n - k + 1];
        Deque<Integer> dq = new LinkedList<>();
        for (int r = 0; r < n; r++,l++) {
            if(l>0 && nums[l-1]==dq.peekFirst())dq.removeFirst();
            while (!dq.isEmpty() && nums[r] > dq.peekLast()) dq.removeLast();
            dq.addLast(nums[r]);
            if(l>=0){
                res[l]=dq.peekFirst();
            }
        }
        return res;
    }
}
