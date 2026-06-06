package leet.methods._2_stackAndqueue.review.L394;

import java.util.Stack;

public class Leet394_r5 {
    public String decodeString(String s) {
        Stack<Integer> stackCount = new Stack<>();
        Stack<String> stackStr = new Stack<>();
        int curCount = 0;
        StringBuilder curStr = new StringBuilder();
        for (int i = 0; i < s.length(); i++) {
            char c = s.charAt(i);
            if (Character.isDigit(c)) {
                curCount = curCount * 10 + (c - '0');
            } else if (c == '[') {
                //记录状态
                stackCount.add(curCount);
                stackStr.add(curStr.toString());
                curCount = 0;
                curStr.setLength(0);
            } else if (c == ']') {
                //处理字符串
                StringBuilder tmp = new StringBuilder(stackStr.pop());
                int n = stackCount.pop();
                for (int j = 0; j < n; j++) {
                    tmp.append(curStr);
                }
                curStr = tmp;
            } else {
                curStr.append(c);
            }
        }
        return curStr.toString();
    }
}
