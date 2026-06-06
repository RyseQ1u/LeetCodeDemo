package leet.methods._10_Dynamic.review.L1480;

public class Leet1480_r2 {
    public int[] runningSum(int[] nums) {
        //计算前缀和
        int[] dp = new int[nums.length+1];
        int[] res = new int[nums.length];
        for (int i = 0; i < nums.length; i++) {
            dp[i+1] = dp[i] + nums[i];
            res[i] = dp[i+1];
        }
        return res;
    }
}
