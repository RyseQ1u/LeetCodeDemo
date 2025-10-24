package leet.methods._2_stackAndqueue.review.L20;

import java.util.HashMap;
import java.util.Stack;

public class Leet20_r1 {
    public boolean isValid(String s) {
        HashMap<Character, Character> ht = new HashMap<>();
        ht.put('(', ')');
        ht.put('[', ']');
        ht.put('{', '}');
        Stack<Character> stack = new Stack<>();
        for (char c : s.toCharArray()) {
            if (Character.isLetter(c)) continue;
            if (!stack.isEmpty()) {
                char last = stack.peek();
                if (ht.containsKey(last)) {
                    if (ht.get(last) == c) {
                        stack.pop();
                        continue;
                    }
                }
            }
            stack.push(c);
        }
        return stack.isEmpty();
    }
    public boolean isValid_V2(String s) {
        if(s.isEmpty())
            return true;
        Stack<Character> stack=new Stack<>();
        for(char c:s.toCharArray()){
            if(c=='(')
                stack.push(')');
            else if(c=='{')
                stack.push('}');
            else if(c=='[')
                stack.push(']');
            else if(stack.empty()||c!=stack.pop())
                //提前返回
                return false;
        }

        return stack.empty();
    }
}
