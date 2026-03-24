package leet.methods._11_GreedyAlgorithm.L768;

import java.util.Stack;

public class Leet768_r1 {
    public int maxChunksToSorted(int[] arr) {
        Stack<Integer> stack = new Stack<Integer>();
        for (int i : arr) {
            if(!stack.isEmpty() && i<stack.peek()){
                int num = stack.peek();
                while (!stack.isEmpty()&&i<stack.peek())stack.pop();
                stack.push(num);
            }else {
                stack.push(i);
            }
        }
        return stack.size();
    }
}
