package leet.methods._5_mock.review.L8;

public class L8_r4 {
    public int myAtoi(String s) {
        s = s.trim();
        if (s.isEmpty()) return 0;
        int index = 0,n = s.length(),flag = 1,res = 0,max = Integer.MAX_VALUE /10;
        //跳过空格
        while (s.charAt(index)==' ')index++;
        if(index==n) return 0;
        //符号判断
        if(s.charAt(index)=='-') flag = -1;
        if(s.charAt(index)=='+'||s.charAt(index) == '-')index++;
        //处理数字
        for (; index < n; index++) {
            char c =s.charAt(index);
            if(Character.isDigit(c)){
                if(res > max || res == max && c >'7' ) return flag==-1?Integer.MIN_VALUE : Integer.MAX_VALUE;
                res = res*10+(c - '0');
            }else {
                break;
            }
        }
        return res * flag;
    }
}

