package leet.methods._11_GreedyAlgorithm.L768;

import java.util.Stack;

public class Leet768_r3 {
    public int maxChunksToSorted(int[] arr) {
        Stack<Integer> stack = new Stack<>();
        for (int i = 0; i < arr.length; i++) {
            int n = arr[i];
            if (!stack.isEmpty() && stack.peek() > n) {
                int top = stack.pop();
                while (!stack.isEmpty() && stack.peek() > n) stack.pop();
                stack.add(top);
            } else {
                stack.add(n);
            }
        }
        return stack.size();
    }
}
