package leet.methods._5_mock.review.L415;

public class L415_r4 {
    public String addStrings(String num1, String num2) {
        int n1 = num1.length()-1,n2 = num2.length()-1,carry=0;
        StringBuilder res = new StringBuilder();
        while (n1>=0 || n2>=0){
            int a = n1 >= 0 ? num1.charAt(n1) -'0': 0;
            int b = n2 >= 0 ? num2.charAt(n1) -'0': 0;
            int tmp = a+b+carry;
            carry= tmp/10;
            res.append(tmp%10);
            n1--;n2--;
        }
        if(carry==1) res.append(1);
        return res.reverse().toString();
    }
}
