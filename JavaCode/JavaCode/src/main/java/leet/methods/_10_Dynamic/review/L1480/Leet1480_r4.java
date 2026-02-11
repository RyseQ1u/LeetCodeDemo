package leet.methods._10_Dynamic.review.L1480;

public class Leet1480_r4 {
    public int[] runningSum(int[] nums) {
        int[] res = new int[nums.length],dp=new int[nums.length+1];
        for (int i = 0; i < nums.length; i++) {
            dp[i+1]=dp[i]+nums[i];
            res[i]=dp[i+1];
        }
        return res;
    }
}
