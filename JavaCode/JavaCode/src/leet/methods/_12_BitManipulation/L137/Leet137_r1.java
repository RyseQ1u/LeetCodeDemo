package leet.methods._12_BitManipulation.L137;

public class Leet137_r1 {
    public int singleNumber(int[] nums) {
        //遍历统计出现次数
        int[] counts = new int[32];
        for (int num : nums) {
            for (int i = 0; i < 32; i++) {
                //统计当前位为1的个数
                counts[i]+= num & 1;
                num >>=1;
            }
        }
        int res = 0,m=3;
        for (int i = 0; i < 32; i++) {
            //剩下位数即为单独数留下的
            res<<=1;
            res |= counts[31-i] % m;
        }

        return res;
    }
}
