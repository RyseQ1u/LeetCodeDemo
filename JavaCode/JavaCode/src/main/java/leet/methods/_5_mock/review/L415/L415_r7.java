package leet.methods._5_mock.review.L415;

public class L415_r7 {
    public String addStrings(String num1, String num2) {
        int r1=num1.length()-1,r2=num2.length()-1,carry =0;
        StringBuilder res = new StringBuilder();
        while (r1>=0||r2>=0){
            int c1 = r1 >=0? num1.charAt(r1)-'0':0;
            int c2 = r2 >=0? num2.charAt(r2)-'0':0;
            int cur = c1+c2+carry;
            carry =cur/ 10;
            res.append(cur%10);
            r1--;
            r2--;
        }
        if(carry==1)res.append(1);
        return res.reverse().toString();
    }
}
