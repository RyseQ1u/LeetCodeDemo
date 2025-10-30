package leet.methods._2_stackAndqueue.review.L394;

import java.util.Stack;

public class Leet394_r3 {
    /**
     * 使用辅助栈进行解码
     */
    // 存储字符串和数字的栈
    private Stack<String> strs = new Stack<>();
    private Stack<Integer> count = new Stack<>();
    private StringBuilder curStr = new StringBuilder();
    private int curNum = 0;

    public String decodeString(String s) {
        for (int i = 0; i < s.length(); i++) {
            char c = s.charAt(i);
            //判断是否为数字
            if (Character.isDigit(c)) {
                //进位
                curNum = curNum * 10 + (c - '0');

            } else if (c == '[') {
                count.add(curNum);
                strs.add(curStr.toString());
                //重置当前数字和字符串
                curNum = 0;
                curStr.setLength(0);
            } else if (c == ']') {
                StringBuilder tmp = new StringBuilder(strs.pop());
                int curCount = count.pop();
                for (int j = 0; j < curCount; j++) {
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
