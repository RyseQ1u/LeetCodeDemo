package leet.methods._12_BitManipulation.L137;

public class Leet137_r5 {
    public int singleNumber(int[] nums) {
        int[] map = new int[32];
        for (int num : nums) {
            for (int i = 0; i < 32; i++) {
                map[i]+=num&1;
                num>>=1;
            }
        }
        int res = 0,m=3;
        for (int i = map.length - 1; i >= 0; i--) {
            res<<=1;
            res |= map[i]%m;
        }
        return res;
    }
}
