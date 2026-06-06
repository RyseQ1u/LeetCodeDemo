package leet.methods._5_mock.review.L8;

public class L8_r1 {
    public int myAtoi(String s) {
        s = s.trim();
        int res = 0, flag = 1,max = Integer.MAX_VALUE;
        for (int i = 0; i < s.length(); i++) {
            if (i == 0 && s.charAt(i) == '-'){
                flag *= -1;
                continue;
            }
            char c = s.charAt(i);
            if (Character.isDigit(c)) {
                if(res > max || res == max && c>'7'){
                    return flag == 1? Integer.MAX_VALUE : Integer.MIN_VALUE;
                }
                res = res * 10 + (c - '0');
            } else {
                break;
            }
        }
        return res * flag;
    }
}
