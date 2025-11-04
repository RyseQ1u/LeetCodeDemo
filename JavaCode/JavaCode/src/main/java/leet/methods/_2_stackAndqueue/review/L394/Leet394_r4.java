package leet.methods._2_stackAndqueue.review.L394;

import java.util.Stack;

public class Leet394_r4 {
    public String decodeString(String s) {

        Stack<Integer> cs = new Stack<Integer>();

        Stack<String> ss = new Stack<>();
        int curCount = 0;
        StringBuilder curStr = new StringBuilder();
        for (char c : s.toCharArray()) {
            //判断是否为数字
            if (Character.isDigit(c)) {
                curCount = curCount * 10 + (c - '0');
            } else if (c == '[') {
                //暂存当前字符串和count
                cs.add(curCount);
                ss.add(curStr.toString());
                //重置
                curCount = 0;
                curStr.setLength(0);
            } else if (c == ']') {
                StringBuilder tmp = new StringBuilder(ss.pop());
                Integer countTmp = cs.pop();
                //循环当前字符串
                for (Integer i = 0; i < countTmp; i++) {
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
