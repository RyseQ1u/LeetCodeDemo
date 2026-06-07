package leet.methods._4_doublePointer.review.L239;

import java.util.LinkedList;

/// 滑动窗口的最大值
public class L239_r7 {
    public int[] maxSlidingWindow(int[] nums, int k) {
        int l = 1-k, n = nums.length;
        int[] res = new int[n - k + 1];
        //使用链表模拟双向队列 维持第一位为最大值 队列降序
        LinkedList<Integer> dq = new LinkedList<>();
        for (int r = 0; r < n; r++,l++) {
            //继续向左滑 判断是否过了最大元素
            if(l>0 && nums[l-1]==dq.peekFirst())dq.removeFirst();
            //移除比当前元素小的
            while (!dq.isEmpty() && dq.peekLast()<nums[r])dq.removeLast();
            dq.addLast(nums[r]);
            if(l>=0) res[l]=dq.peekFirst();
        }
        return res;
    }
}
