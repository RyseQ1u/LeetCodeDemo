package leet.methods._10_Dynamic.review.L53;

public class Leet53_r5 {
    public int maxSubArray(int[] nums) {
        int res=nums[0],pre=nums[0],n=nums.length;
        int[] dp = new int[n];
        for (int i = 1; i < n; i++) {
            pre=Math.max(pre+nums[i],nums[i]);
            res=Math.max(res,pre);
        }
        return res;
    }
}
