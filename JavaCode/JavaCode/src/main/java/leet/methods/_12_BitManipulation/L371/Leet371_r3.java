package leet.methods._12_BitManipulation.L371;

public class Leet371_r3 {
    public int getSum(int a, int b) {
        while (b!=0){
            int carry = a&b;
            a^=b;
            b=carry;
        }
        return a;
    }
}
