package leet.methods._12_BitManipulation.L191;

public class Leet191_r2 {
    public int hammingWeight(int n) {
        int res = 0;
        while (n>0){
            if((n&1)==1)res++;
            n>>>=1;
        }
        return res;
    }
}
