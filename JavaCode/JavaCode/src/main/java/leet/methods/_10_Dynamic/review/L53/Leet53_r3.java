package leet.methods._10_Dynamic.review.L53;

public class Leet53_r3 {
    public int maxSubArray(int[] nums) {
        int res = nums[0], pre = nums[0];
        for (int i = 1; i < nums.length; i++) {
            pre = Math.max(nums[i], pre + nums[i]);
            res = Math.max(res, pre);
        }
        return res;
    }
}
