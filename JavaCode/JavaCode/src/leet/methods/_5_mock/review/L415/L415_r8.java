package leet.methods._5_mock.review.L415;

public class L415_r8 {
    public String addStrings(String num1, String num2) {
        int carry=0,n=num1.length()-1,m=num2.length()-1;
        StringBuilder sb = new StringBuilder();
        while (n>=0||m>=0){
            int n1 = n>=0 ? num1.charAt(n--)-'0':0;
            int n2 = m>=0 ? num2.charAt(m--)-'0':0;
            int cnt =n1+n2+carry;
            carry=cnt/10;
            int n3 = cnt%10;
            sb.append(n3);
        }
        if(carry==1){
            sb.append(1);
        }
        return sb.reverse().toString();
    }
}
