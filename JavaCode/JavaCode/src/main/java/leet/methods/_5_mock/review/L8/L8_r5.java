package leet.methods._5_mock.review.L8;

public class L8_r5 {
    public int myAtoi(String s) {
        s = s.trim();
        if (s.isEmpty()) return 0;
        int index = 0, flag = 1, res = 0, max = Integer.MAX_VALUE / 10;
        //跳过前导空格
        while (s.charAt(index) == ' ') index++;
        if (s.charAt(index) == '-') flag = -1;
        if (s.charAt(index) == '-' || s.charAt(index) == '+') index++;
        for (; index < s.length(); index++) {
            char c = s.charAt(index);
            if (Character.isDigit(c)) {
                if (res > max || res == max && c > '7') {
                    return flag == 1 ? Integer.MAX_VALUE : Integer.MIN_VALUE;
                }
                res = res * 10 + c - '0';
            }else {
                break;
            }
        }
        return flag * res;
    }
}
