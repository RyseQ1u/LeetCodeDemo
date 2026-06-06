package leet.methods._12_BitManipulation.L137;

public class Leet137_r3 {
    public int singleNumber(int[] nums) {
        // 统计每个二进制位上出现1的次数，数组下标对应位号（0为最低位）
        int[] cnts = new int[32];
        for (int num : nums) {
            for (int i = 0; i < 32; i++) {
                // 遍历当前数字的32个位，累加每一位上1的个数
                cnts[i] += num & 1; // 取最低位，是1则加1，是0则加0
                num >>= 1;          // 逻辑右移，处理下一位
            }
        }

        int res = 0, m = 3; // m 是其他元素的重复次数（本题中每个元素都出现3次）
        // 根据统计结果重建只出现一次的数字（从最高位向最低位拼接）
        // 注意：cnts 长度为32，有效索引是 0~31，此处循环起点应为 31，否则会越界
        for (int i = 31; i >= 0; i--) {
            res <<= 1;            // 左移腾出当前位
            res |= cnts[i] % m;   // 取出现次数对m取模的余数（0或1）填入当前位
        }
        return res;
    }
}
