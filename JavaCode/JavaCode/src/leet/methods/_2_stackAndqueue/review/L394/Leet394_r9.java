package leet.methods._2_stackAndqueue.review.L394;

import java.util.Stack;

/// 字符串解码
public class Leet394_r9 {
    public String decodeString(String s) {
        StringBuilder curStr = new StringBuilder();
        //记录重复次数
        Stack<Integer> cnts = new Stack<>();
        //记录字符串
        Stack<String> strings = new Stack<>();
        int tmp_cnt=0;
        for (char c : s.toCharArray()) {
            if(Character.isDigit(c)){
                tmp_cnt = tmp_cnt*10 +(c-'0');
            }else if(c=='['){
                //存档
                cnts.add(tmp_cnt);
                strings.add(curStr.toString());
                tmp_cnt=0;
                curStr.setLength(0);
            }else if(c==']'){
                StringBuilder sb = new StringBuilder(strings.pop());
                int cnt = cnts.pop();
                for (int i = 0; i < cnt; i++) {
                    sb.append(curStr);
                }
                curStr=sb;
            }else {
                curStr.append(c);
            }
        }
        return curStr.toString();
    }
}
