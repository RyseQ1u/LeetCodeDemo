package leet.methods._12_BitManipulation.L137;

public class Leet137_r3 {
    public int singleNumber(int[] nums) {
        //统计每个位上出现1的次数
        int[] cnts = new int[32];
        for (int num : nums) {
            for (int i = 0; i < 32; i++) {
                //遍历每个数位
                cnts[i] += num & 1;
                num >>= 1;
            }
        }
        int res =0 ,m =3;
        for (int i = 31; i >= 0; i--) {
            res<<=1;
            res|=cnts[i]%m;
        }
        return res;
    }
}
