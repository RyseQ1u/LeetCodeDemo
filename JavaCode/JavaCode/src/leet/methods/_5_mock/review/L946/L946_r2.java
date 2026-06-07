package leet.methods._5_mock.review.L946;

import java.util.Stack;

/// 验证栈序列
public class L946_r2 {
    public boolean validateStackSequences(int[] pushed, int[] popped) {
        Stack<Integer> stack = new Stack<>();
        int pi =0;
        for (int i = 0; i < pushed.length; i++) {
            stack.add(pushed[i]);
            while (!stack.empty() && stack.peek()==popped[pi]){
                stack.pop();
                pi++;
            }
        }
        return stack.empty();
    }

    public boolean validateStackSequences_v2(int[] pushed, int[] popped) {
        //使用数组模拟栈操作
        int idx = 0;
        for (int i = 0,j=0; i < pushed.length; i++) {
            pushed[idx++]= pushed[i];
            while (idx>0 && pushed[idx-1] == popped[j]){
                idx--;
                j++;
            }
        }
        return idx==0;
    }
}
