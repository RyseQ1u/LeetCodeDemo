package leet.stackAndqueue.middle;

import leet._class.stackAndqueue.MinStack_Stack;

import java.util.LinkedList;
import java.util.Queue;
import java.util.Stack;

public class Leet394 {
    /**
     * 辅助栈实现
     * @param s 输入字符串
     * @return 输出字符串
     */
    public String decodeString(String s) {
        //构建返回结果
        StringBuilder sb = new StringBuilder();
        //临时字符串变量
        StringBuilder tmp = new StringBuilder();
        //临时乘数
        int multi = 0;
        //出现次数队列
        Stack<Integer> frequency = new Stack<Integer>();
        //出现字符串队列
        Stack<String> strings = new Stack<String>();

        //遍历字符串
        for (int i = 0; i < s.length(); i++) {
            char c = s.charAt(i);
            //遇到 [ 时，将乘数和当前字符串入栈
            if(c=='['){
                frequency.add(multi);
                strings.add(sb.toString());
                multi=0;
                sb.setLength(0);
            }
            //遇到 ] 时，拼接字符串，当前乘数为栈顶元素，当前字符串为sb
            else if(c==']'){
                int cur_multi = frequency.pop();
                for(int j=0;j<cur_multi;j++){
                    tmp.append(sb);
                }
                sb.setLength(0);
                sb.append(strings.pop()+tmp);
                tmp.setLength(0);
            }
            //遇到数字时处理，可能有多位数
            else if(c>='0'&&c<='9'){
                multi=multi*10+(c-'0');
            }
            //遇到字母时处理
            else {
                sb.append(c);
            }
        }
        return sb.toString();

    }
    public String decodeString2(String s) {
        //构建返回结果
        StringBuilder sb = new StringBuilder();
        //临时变量
        StringBuilder tmp = new StringBuilder();
        //出现次数队列
        Queue<Integer> frequency = new LinkedList<Integer>();
        //出现字符串队列
        Queue<String> strings = new LinkedList<String>();
        //标记是否进入[]
        boolean flag = false;
        //遍历字符串
        for (int i = 0; i < s.length(); i++) {
            char c = s.charAt(i);
            if(c=='['){
                flag=true;
                continue;

            }
            else if(c==']'){
                flag=false;
                strings.add(tmp.toString());
                tmp.setLength(0);
                continue;
            }
            if(flag){

                tmp.append(c);
            }else {
                frequency.add(c- '0');
            }
        }
        //构建返回结果
        while (!frequency.isEmpty()){
            int f= frequency.poll(),n=0;

            String addStr = strings.poll();
            while (f> n){
                sb.append(addStr);
                n++;
            }
        }
        return sb.toString();
    }

}


