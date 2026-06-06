package leet.methods._5_mock.review.L415;

public class L415_r1 {
    public String addStrings(String num1, String num2) {
        StringBuilder res = new StringBuilder();
        //倒序遍历
        int i = num1.length() - 1, j = num2.length() - 1, carry = 0;
        while (i >= 0 || j >= 0) {
            //转换字符 如果已遍历完则补充0
            int c1 = i >= 0 ? num1.charAt(i) - '0' : 0;
            int c2 = j >= 0 ? num2.charAt(j) - '0' : 0;
            //求和 范围在 1~19
            int tmp = c1+c2+carry;
            //获取十位上的数字
            carry = tmp /10;
            //添加个位数上的数字
            res.append(tmp%10);
            i--;j--;
        }
        //判断最后是否有进位
        if(carry==1)res.append(1);
        //反转字符串
        return res.reverse().toString();
    }
}
