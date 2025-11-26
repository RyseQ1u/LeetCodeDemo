package leet.methods._5_mock.review.L8;

public class L8_r3 {
    public int myAtoi(String s) {
        s = s.trim();
        if (s.isEmpty()) return 0;
        int i = 0 ,n = s.length(),flag = 1,res = 0;
        //最大值除10 2^31 / 10  = 2147483647
        int max = Integer.MAX_VALUE / 10;
        //跳过空格
        while (s.charAt(i)==' ')i++;
        if(s.charAt(i)=='-')flag = -1;
        //跳过其他符号
        if (s.charAt(i) == '+' || s.charAt(i) == '-') i++;
        while (i<n){
            char c =  s.charAt(i);
            if(Character.isDigit(c)){
                //上限判断
                if(res > max || res == max && c > '7'){
                    return flag==1 ? Integer.MAX_VALUE : Integer.MIN_VALUE;
                }
                res = res * 10 + c - '0';
            }else {
                break;
            }
            i++;
        }
        return res * flag;
    }
}
