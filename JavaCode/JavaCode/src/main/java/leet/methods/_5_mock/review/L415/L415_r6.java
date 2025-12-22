package leet.methods._5_mock.review.L415;

public class L415_r6 {
    public String addStrings(String num1, String num2) {
        int i = num1.length() - 1, j = num2.length() - 1, carry = 0;
        StringBuilder res = new StringBuilder();
        while (i >= 0 || j >= 0) {
            int c1 = i >= 0 ? num1.charAt(i) - '0' : 0;
            int c2 = j >= 0 ? num2.charAt(j) - '0' : 0;
            int tmp = c1 + c2 + carry;
            carry = tmp / 10;
            res.append(tmp % 10);
            i--;
            j--;
        }
        if (carry == 1) res.append(carry);

        return res.reverse().toString();
    }
}
