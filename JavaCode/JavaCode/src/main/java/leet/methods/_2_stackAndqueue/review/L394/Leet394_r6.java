package leet.methods._2_stackAndqueue.review.L394;

import java.util.Stack;

/// 字符串解码
public class Leet394_r6 {
    public String decodeString(String s) {
        Stack<Integer> nums = new Stack<>();
        Stack<String> strs = new Stack<>();
        int n = s.length(),cur = 0;
        StringBuilder sb = new StringBuilder();
        for (int i = 0; i < n; i++) {
            char c = s.charAt(i);
            if(Character.isDigit(c)){
                cur = cur *10 + c-'0';
            }
        }
        return "";
    }
}
