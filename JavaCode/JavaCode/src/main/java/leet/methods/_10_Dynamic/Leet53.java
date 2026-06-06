package leet.methods._10_Dynamic;

/**
 * 最大子数组和
 */
public class Leet53 {

    /**
     * 最大子数组和
     * 维护前一位的最大和
     */
    public int maxSubArray(int[] nums) {
        int max = nums[0], pre = nums[0];
        for (int i = 1; i < nums.length; i++) {
            pre = Math.max(nums[i], nums[i] + pre);
            max = Math.max(max, pre);
        }
        return max;
    }
}
