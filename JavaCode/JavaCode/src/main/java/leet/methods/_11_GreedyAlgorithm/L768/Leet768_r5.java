package leet.methods._11_GreedyAlgorithm.L768;

import java.util.Stack;

public class Leet768_r5 {
    public int maxChunksToSorted(int[] arr) {
        //维护单调栈
        Stack<Integer> stack = new Stack<>();
        for (int num : arr) {
            if(!stack.isEmpty() && stack.peek() > num){
                int tmp = stack.pop();
                while (!stack.isEmpty() && stack.peek()>num) stack.pop();
                stack.add(tmp);
            }else {
                stack.add(num);
            }
        }
        return stack.size();
    }
}
