package leet.methods._4_doublePointer.review.L239;

import java.util.LinkedList;

/// 滑动窗口的最大值
public class L239_r8 {
    public int[] maxSlidingWindow(int[] nums, int k) {
        int l = 1-k,n = nums.length;
        int[] res = new int[n-k+1];
        //使用链表模拟双向队列 队列降序
        LinkedList<Integer> dq = new LinkedList<>();
        for (int r = 0; r < n; r++,l++) {
            //滑块区间开始排出元素 检查排查元素是否为当前队列最大值
            if(l>0 && nums[l-1]==dq.peekFirst())dq.removeFirst();
            //从小到大比较
            while (!dq.isEmpty() && dq.peekLast()<nums[r])dq.removeLast();
            dq.addLast(nums[r]);
            if(l>=0)res[l]=dq.peekFirst();
        }
        return res;
    }
}
