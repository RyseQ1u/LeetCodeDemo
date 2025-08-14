package leet.methods._11_GreedyAlgorithm;

import java.util.LinkedList;

/**
 * 最多能完成排序的块 II
 */
public class Leet768 {

    /**
     * 单调栈
     * 维护区间最大值
     */
    public int maxChunksToSorted(int[] arr) {
        LinkedList<Integer> stack = new LinkedList<>();
        for (int num : arr) {
            //比较当前值和最后一个最大值比较
            if(!stack.isEmpty() && num < stack.getLast()){
                int big = stack.removeLast();
                //当前值比最大值小时 维护区间范围，找到第一个大于等于num的最大值，保持数组有序
                while (!stack.isEmpty() && num <stack.getLast()){
                    stack.removeLast();
                }
                //补充当前区间最大值
                stack.addLast(big);
            }else {
                stack.addLast(num);
            }
        }
        return stack.size();
    }
}
