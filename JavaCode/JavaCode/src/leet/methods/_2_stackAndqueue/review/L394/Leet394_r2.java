package leet.methods._2_stackAndqueue.review.L394;

import java.util.Stack;

public class Leet394_r2 {
    public String decodeString(String s) {
        Stack<String> strStack = new Stack<>();
        Stack<Integer> countStack = new Stack<>();
        StringBuilder curStr = new StringBuilder();
        int curCount = 0;
        for (int i = 0; i < s.length(); i++) {
            char c = s.charAt(i);
            if(Character.isDigit(c)){
                curCount =curCount * 10 + c - '0';
            }else if(c=='['){
                countStack.push(curCount);
                strStack.push(curStr.toString());
                curCount = 0;
                curStr.setLength(0);
            } else if (c==']') {
                StringBuilder sb = new StringBuilder(strStack.pop());
                int repeatTimes = countStack.pop();
                for (int j = 0; j < repeatTimes; j++) {
                    sb.append(curStr);
                }
                curStr = sb;
            }else {
                curStr.append(c);
            }
        }
        return curStr.toString();
    }
}
