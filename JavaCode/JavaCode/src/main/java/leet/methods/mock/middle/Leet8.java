package leet.methods.mock.middle;

public class Leet8 {


    public int myAtoi(String s) {
        //去除前置空格符
        char[] ns = s.toCharArray();
        //正负标记
        int flag = 1;
        //最大值阈值 2^31 / 10  = 2147483647
        int max = Integer.MAX_VALUE / 10,cur = 0,i=0;

        //开始遍历
        if(ns.length == 0) return 0;
        //跳过前置空格
        while (ns[i] == ' '){
            i++;
            if(i==ns.length) return 0;
        }
        //符号判断
        if(ns[i]=='-') flag = -1;
        //
        if(ns[i]=='+'||ns[i]=='-') i++;
        //开始遍历数字
        for (int j = i; j < ns.length; j++) {
            //数字判断
            if(ns[j] < '0' || ns[j] > '9') break;
            //判断数字是否超出上限
            if(cur>max || cur == max && ns[j]>'7'){
                return flag == 1? Integer.MAX_VALUE : Integer.MIN_VALUE;
            }
            cur = cur * 10 + ns[j]-'0';
        }

        return flag * cur;
    }
}


