package leet.methods._2_stackAndqueue.review.L394;

import java.util.Stack;

/// 字符串解码
public class Leet394_r7 {
    public String decodeString(String s) {
        Stack<String> strStack = new Stack<>();
        Stack<Integer> intStack = new Stack<>();
        int cur = 0;
        StringBuilder sb = new StringBuilder();
        for (int i = 0; i < s.length(); i++) {
            char c = s.charAt(i);
            if (Character.isDigit(c)) {
                cur = cur * 10 + (c - '0');
            } else if (c == '[') {
                intStack.push(cur);
                strStack.add(sb.toString());
                cur = 0;
                sb.setLength(0);
            } else if (c == ']') {
                //取出外面一层的字符串累加
                StringBuilder tmp = new StringBuilder(strStack.pop());
                int n = intStack.pop();
                for (int j = 0; j < n; j++) {
                    tmp.append(sb);
                }
                sb = tmp;
            } else {
                sb.append(c);
            }
        }
        return sb.toString();
    }
}
