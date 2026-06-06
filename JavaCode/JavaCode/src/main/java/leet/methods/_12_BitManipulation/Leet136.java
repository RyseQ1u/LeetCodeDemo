package leet.methods._12_BitManipulation;

/**
 * 只出现一次的数字
 */
public class Leet136 {

    /**
     * 使用异或寻找不同的值
     * 数位相同为0 不同为1
     */
    public int singleNumber(int[] nums) {
        int res =0;
        for (int num : nums) {
            res^=num;
        }
        return res;
    }
}
