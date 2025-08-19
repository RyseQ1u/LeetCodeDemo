package leet.methods._12_BitManipulation;

/**
 * 只出现一次的数字 II
 */
public class Leet137 {

    /**
     * 统计每个数位的和 与3取模
     */
    public int singleNumber(int[] nums) {
        int res = 0;
        //int 类型范围
        for (int i = 0; i < 32; ++i) {
            int total = 0;
            //统计该位置的值
            for (int num: nums) {
                total += ((num >> i) & 1);
            }
            //赋值到结果
            if (total % 3 != 0) {
                res |= (1 << i);
            }
        }
        return res;
    }
}
