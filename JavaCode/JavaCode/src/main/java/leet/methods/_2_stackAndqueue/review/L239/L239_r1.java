package leet.methods._2_stackAndqueue.review.L239;

import java.util.Deque;
import java.util.LinkedList;

public class L239_r1 {
    public int[] maxSlidingWindow(int[] nums, int k) {
        if(nums.length==0||k==0)return new int[0];
        int[] res = new int[nums.length - k + 1];
        Deque<Integer> deque = new LinkedList<>();
        for (int r = 0,l=1-k; r < nums.length; r++,l++) {
            //移除最左边元素
            if(l>0 && deque.peekFirst() == nums[l-1]) deque.removeFirst();
            //保持deque递减 队尾元素与最右元素做对比
            while (!deque.isEmpty() && deque.peekLast() < nums[r]) deque.removeLast();
            deque.addLast(nums[r]);
            //l>0 表示 队列中已经有k个元素 因为维护队列递减 所以头元素最大
            if(l>=0) res[l]=deque.peekFirst();
        }
        return res;
    }
}
