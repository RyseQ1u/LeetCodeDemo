package leet.methods._5_mock.review.L8;

public class L8_r7 {
    public int myAtoi(String s) {
        int res = 0,max=Integer.MAX_VALUE/10, i = 0, flag = 1, n = s.length();
        if(n==0)return 0;
        char[] chars = s.toCharArray();
        while (i < n && chars[i] == ' ') i++;
        if(i==s.length())return 0;
        if (chars[i] == '-') flag = -1;
        if (chars[i] == '-' || chars[i] == '+') i++;
        while (i < n) {
            if (Character.isDigit(chars[i])){
                if(res>max || res==max && chars[i]>'7' ){
                    if(flag==-1)
                        return Integer.MIN_VALUE;
                    else
                        return Integer.MAX_VALUE;
                }else {
                    res = res *10 + chars[i]-'0';
                }
            }else
                break;
            i++;
        }
        return res*flag;
    }
}
