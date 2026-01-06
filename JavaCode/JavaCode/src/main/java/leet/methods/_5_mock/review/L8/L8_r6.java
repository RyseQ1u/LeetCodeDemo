package leet.methods._5_mock.review.L8;

public class L8_r6 {
    public int myAtoi(String s) {
        s=s.trim();
        int n=s.length(), i=0,flag=1,res=0,max = Integer.MAX_VALUE /10;
        if(s.length()==0)return 0;
        if(s.charAt(i)=='-')flag=-1;
        if(s.charAt(i)=='-'||s.charAt(i)=='+')i++;
        for (; i < n; i++) {
            char c = s.charAt(i);
            if(Character.isDigit(c)){
                //最大值判断
                if(res>max || res==max && c> '7'){
                    return flag==-1 ?Integer.MIN_VALUE : Integer.MAX_VALUE;
                }
                res = res * 10 + c - '0';
            }else {
                break;
            }
        }
        return res*flag;
    }
}
