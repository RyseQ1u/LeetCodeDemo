package leet.stackAndqueue.easy;

import java.util.HashMap;
import java.util.Map;
import java.util.Stack;

public class Leet20 {
    public boolean isValid(String s) {
        //记录括号
        Stack<Character> stack = new Stack<>();
        for (int i = 0; i < s.length(); i++) {
            char c = s.charAt(i);
            if (!stack.isEmpty()) {
                char last = stack.peek();
                boolean flag = false;
                if (c == ')') {
                    if (last == '(') flag = true;
                } else if (c == ']') {
                    if (last == '[') flag = true;
                } else if (c == '}') {
                    if (last == '{') flag = true;
                }
                if (flag) {
                    stack.pop();
                    continue;
                }
            }
            stack.push(c);
        }

        return stack.isEmpty();
    }


    public boolean isValid2(String s) {
        //使用map优化匹配
        Map<Character, Character> map = new HashMap<Character, Character>() {
            {
                put('{', '}');
                put('[', ']');
                put('(', ')');
                //使用？避免pop报错
                put('?', '?');
            }
        };
        //提前退出条件，第一个不是左括号
        if (s.isEmpty() || map.containsKey(s.charAt(0))) {
            return false;

        }


        //记录括号
        Stack<Character> stack = new Stack<Character>() {
        };
        //使用？避免pop报错
        stack.push('?');
        for (Character c : s.toCharArray()) {
            if (map.containsKey(c)) stack.push(c);
                //有一个右括号匹配不上直接返回false
            else if (map.get(stack.pop()) != c) return false;
        }


        return stack.isEmpty();


    }
}
