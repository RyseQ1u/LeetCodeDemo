package leet.methods._2_stackAndqueue.review.L394;

import java.util.Stack;

/// 字符串解码
public class Leet394_r8 {
    public String decodeString(String s) {
        StringBuilder tmpStr = new StringBuilder();
        Stack<Integer> intStack = new Stack<>();
        Stack<String> strStack = new Stack<>();
        int tmpcnt = 0;
        for (char c : s.toCharArray()) {
            if(Character.isDigit(c)){
                tmpcnt = tmpcnt *10 +(c-'0');
            }else if(c=='[') {
                //存储记录
                intStack.push(tmpcnt);
                strStack.add(tmpStr.toString());
                tmpcnt = 0;
                tmpStr.setLength(0);
            }else if(c==']'){
                StringBuilder tmp = new StringBuilder(strStack.pop());
                int cnt = intStack.pop();
                for (int i = 0; i < cnt; i++) {
                    tmp.append(tmpStr);
                }
                tmpStr = tmp;
            }else {
                tmpStr.append(c);
            }
        }
        return tmpStr.toString();
    }
}
