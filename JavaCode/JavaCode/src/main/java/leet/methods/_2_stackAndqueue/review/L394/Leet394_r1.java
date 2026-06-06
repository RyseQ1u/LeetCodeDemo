package leet.methods._2_stackAndqueue.review.L394;

import java.util.Stack;

public class Leet394_r1 {
    public String decodeString(String s) {
        StringBuilder res = new StringBuilder();
        //次数
        int count = 0;
        //统计当前次数和字符串
        Stack<Integer> stack_count = new Stack<>();
        Stack<String> stack_str = new Stack<>();
        for (char c : s.toCharArray()) {
            //判断是否为数字
            if(Character.isDigit(c)){
                count = count*10 + (c - '0');
            } else if (c == '[') {
                stack_count.push(count);
                stack_str.push(res.toString());
                //重置
                count = 0;
                res = new StringBuilder();
            } else if (c == ']') {
                StringBuilder temp = new StringBuilder(stack_str.pop());
                int repeatTimes = stack_count.pop();
                for (int i = 0; i < repeatTimes; i++) {
                    temp.append(res);
                }
                res = temp;
            }
            //字母直接添加
            else {
                res.append(c);
            }
        }

        return res.toString();
    }
}
