package leet.methods._5_mock.review.L946;

import java.util.Stack;

/// 验证栈序列
public class L946_r1 {
    public boolean validateStackSequences(int[] pushed, int[] popped) {
        Stack<Integer> st = new Stack<>();
        int popIndex = 0;
        for (int i = 0; i < pushed.length; i++) {
            st.push(pushed[i]);
            while (!st.isEmpty() && st.peek()==popped[popIndex]){
                popIndex++;
                st.pop();
            }
        }
        return st.isEmpty();
    }
}
