package leet.methods._11_GreedyAlgorithm.L768;

import java.util.Stack;

public class Leet768_r2 {
    public int maxChunksToSorted(int[] arr) {
        Stack<Integer> stack = new Stack<>();
        for (int i : arr) {
            if(!stack.isEmpty() && stack.peek() > i){
                int top = stack.pop();
                while (!stack.isEmpty() && stack.peek() > i) stack.pop();
                stack.add(top);
            }else {
                stack.add(i);
            }
        }
        return stack.size();
    }
}
