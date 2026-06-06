package leet.methods._2_stackAndqueue.review.L20;

import java.util.Stack;

public class Leet20_r4 {
    public boolean isValid(String s) {
        Stack<Character> stack = new Stack<>();
        for (char c : s.toCharArray()) {
            if(c=='('){
                stack.add(')');
            }else if(c=='{') {
                stack.add('}');
            } else if (c == '[') {
                stack.add(']');
            }else {
                if(stack.empty() ||c!= stack.pop()){
                    return false;
                }
            }
        }
        return true;
    }
}
