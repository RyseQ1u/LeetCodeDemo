package leet.methods.mock.easy;

public class Leet415 {
    public String addStrings(String num1, String num2) {
        StringBuilder res = new StringBuilder("");
        //carry 10进位
        int i = num1.length() - 1, j = num2.length() - 1, carry = 0;
        while (i >= 0 || j >= 0) {
            //如果较短的字符串提前遍历完 则补0
            int n1 = i >= 0 ? num1.charAt(i) - '0' : 0;
            int n2 = j >= 0 ? num2.charAt(j) - '0' : 0;
            int tmp = n1 + n2 + carry;
            //记录进位
            carry = tmp / 10;
            res.append(tmp % 10);
            i--;
            j--;
        }
        if (carry == 1) res.append(1);
        return res.reverse().toString();
    }
}
