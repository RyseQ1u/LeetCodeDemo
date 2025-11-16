package leet.methods._5_mock.review.L415;

public class L415_r3 {
    public String addStrings(String num1, String num2) {
        int i1 = num1.length()-1;
        int i2 = num2.length()-1;
        int carry = 0;
        StringBuilder sb = new StringBuilder();
        while (i1>=0 ||  i2>=0){
            int n1 = i1>=0 ? num1.charAt(i1--)-'0': 0;
            int n2 = i2>=0 ? num2.charAt(i2--)-'0': 0;
            int sum = n1+n2 + carry;
            carry = sum / 10;
            sb.append(sum%10);
        }
        if(carry==1) sb.append(1);
        return sb.reverse().toString();
    }
}
