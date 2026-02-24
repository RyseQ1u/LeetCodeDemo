package leet.methods._10_Dynamic.review.L1480;

public class Leet1480_r5 {
    public int[] runningSum(int[] nums) {
        int n = nums.length;
        int[] dp = new int[n];
        dp[0]=nums[0];
        for (int i = 1; i < nums.length; i++) {
            dp[i]=dp[i-1]+nums[i];
        }
        return dp;
    }
}
