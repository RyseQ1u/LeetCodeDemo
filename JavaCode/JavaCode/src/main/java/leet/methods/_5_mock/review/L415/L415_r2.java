package leet.methods._5_mock.review.L415;

public class L415_r2 {
    public String addStrings(String num1, String num2) {
        StringBuilder sb = new StringBuilder();
        //倒序相加
        int r1 = num1.length()-1,r2=num2.length()  -1,carry =0;
        while (r1>=0||r2>=0){
            int c1 = (r1>=0? num1.charAt(r1)-'0':0);
            int c2 = (r2>=0? num2.charAt(r2)-'0':0);
            int sum = c1+c2 +carry;
            carry = sum/10;
            sb.append(sum%10);
            r1--;
            r2--;
        }
        if(carry==1) sb.append(1);
        return sb.reverse().toString();
    }
}
