package leet.methods._4_doublePointer.review.L239;

import java.util.Deque;
import java.util.LinkedList;

public class L239_r2 {
    public int[] maxSlidingWindow(int[] nums, int k) {
        if (nums.length == 0 || k == 0) return new int[0];
        int[] res = new int[nums.length - k + 1];
        //维护一个递减的双向链表
        Deque<Integer> deque = new LinkedList<>();
        for (int l = 1 - k, r = 0; r < nums.length; l++, r++) {
            //弹出最左元素 最左元素可能因为维护链表顺序被弹出了
            if (l > 0 && deque.peekFirst() == nums[l - 1]) deque.removeFirst();
            //维护链表递减
            while (!deque.isEmpty() && deque.peekLast() < nums[r]) deque.removeLast();
            deque.addLast(nums[r]);
            if (l >= 0) res[l] = deque.peekFirst();
        }
        return res;
    }
}
