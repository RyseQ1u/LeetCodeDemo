package leet.methods._2_stackAndqueue.review.L239;

import java.util.Deque;
import java.util.LinkedList;

public class L239_r3 {
    public int[] maxSlidingWindow(int[] nums, int k) {
        int n = nums.length;
        int[] res = new int[n-k+1];

        Deque<Integer> deque = new LinkedList<>();
        for (int l = 1-k,r=0; r < n; l++,r++) {
            if(l>0 && deque.peekFirst() == nums[l-1]) deque.removeFirst();
            //维护链表递减
            while (!deque.isEmpty() && deque.peekLast()<nums[r])deque.removeLast();
            deque.addLast(nums[r]);
            if(l>=0){
                res[l]=deque.peekFirst();
            }
        }
        return res;
    }
}
