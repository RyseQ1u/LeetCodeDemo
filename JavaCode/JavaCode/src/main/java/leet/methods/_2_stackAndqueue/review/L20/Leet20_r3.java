package leet.methods._2_stackAndqueue.review.L20;

import java.util.Stack;

public class Leet20_r3 {
    public boolean isValid(String s) {
        Stack<Character> stack = new Stack<>();
        for (char c : s.toCharArray()) {
            if(c=='('){
                stack.push(')');
            }else if(c=='['){
                stack.push(']');
            }else if(c=='{') {
                stack.push('}');
            }else {
                //如果栈不为空 且当前元素不等于栈顶
                if(stack.empty() || c !=stack.pop()){
                    return false;
                }
            }
        }
        return stack.empty();
    }
}
