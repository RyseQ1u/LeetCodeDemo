package leet.methods._4_doublePointer.review.L239;

import java.util.LinkedList;

/// 滑动窗口的最大值
public class L239_r9 {
    public int[] maxSlidingWindow(int[] nums, int k) {
        int n =nums.length, l=1-k,r=0;
        int[] res = new int[n - k + 1];
        //创建一个双向队列 当滑块移动的时候可能会弹出最左元素
        LinkedList<Integer> dq = new LinkedList<>();
        for (; r < n;l++, r++) {
            if(l>0 && nums[l-1]==dq.peekFirst()){
                dq.removeFirst();
            }
            //维护队列单调递减
            while (!dq.isEmpty() && dq.peekLast()<nums[r])dq.removeLast();
            //添加当前值
            dq.addLast(nums[r]);
            if(l>=0){
                //当前第一个元素即为当前滑块最大值
                res[l]=dq.peekFirst();
            }
        }
        return res;
    }
}
