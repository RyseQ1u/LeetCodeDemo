package leet.methods._12_BitManipulation.L191;

public class Leet191_r4 {
    public int hammingWeight(int n) {
        int res = 0;
        while (n>0){
            if((n&1)==1){
                res++;
            }
            n>>=1;
        }
        return res;
    }

    public int hammingWeight_V1(int n) {
        int res = 0;
        while (n>0){
            if((n&1)==1){
                res++;
            }
            n&=(n-1);
        }
        return res;
    }
}
