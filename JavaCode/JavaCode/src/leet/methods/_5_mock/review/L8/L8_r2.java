package leet.methods._5_mock.review.L8;

public class L8_r2 {
    public int myAtoi(String s) {

        s = s.trim();
        if (s.isEmpty()) return 0;
        //正负标记
        boolean flag = true;
        //最大值除10 2^31 / 10  = 2147483647
        int max = Integer.MAX_VALUE / 10, res = 0, i = 0;
        if (s.charAt(i) == '-') flag = false;
        //跳过其他符号
        if (s.charAt(i) == '+' || s.charAt(i) == '-') i++;
        for (int j = i; j < s.length(); j++) {
            char c = s.charAt(j);
            if (Character.isDigit(c)) {
                //判断是否超上限
                if (res > max || res == max && c > '7') {
                    return flag ? Integer.MAX_VALUE : Integer.MIN_VALUE;
                }
            } else {
                break;
            }
            res = res * 10 + c - '0';
        }
        return res * (flag ? 1 : -1);
    }
}
