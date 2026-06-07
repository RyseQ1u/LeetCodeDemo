package leet.methods._10_Dynamic.review.L1480;

public class Leet1480_r6 {
    public int[] runningSum(int[] nums) {
        int[] dp = new int[nums.length];
        dp[0]=nums[0];
        for (int i = 1; i < nums.length; i++) {
            dp[i]=nums[i]+dp[i-1];
        }
        return dp;
    }
}
