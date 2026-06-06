package leet.methods._10_Dynamic.review.L53;

public class Leet53_r6 {
    public int maxSubArray(int[] nums) {
        int res=nums[0];
        int[] dp = new int[nums.length];
        dp[0]=nums[0];
        for (int i = 1; i < nums.length; i++) {
            dp[i]=Math.max(dp[i-1]+nums[i],nums[i]);
            res=Math.max(dp[i],res);
        }
        return res;
    }
}
