package leet.methods._12_BitManipulation.L137;

public class Leet137_r2 {
    public int singleNumber(int[] nums) {
        int[] cnts = new int[32];
        for (int num : nums) {
            for (int i = 0; i < 32; i++) {
                cnts[i]+=num&1;
                num>>=1;
            }
        }
        int res=0,m=3;
        for (int i = 0; i < 32; i++) {
            res<<=1;
            res|=cnts[ 31-i ] % m;
        }
        return res;
    }
}
