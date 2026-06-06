package leet.methods._10_Dynamic.review.L300;

import java.util.Arrays;

public class Leet300_r3 {
    public int lengthOfLIS(int[] nums) {
        int[] dp = new int[nums.length];
        Arrays.fill(dp,1);
        int res = 0;
        for (int i = 0; i < nums.length; i++) {
            for (int j = 0; j < i; j++) {
                if(nums[i]>nums[j]){
                    dp[i]=Math.max(dp[j]+1,dp[i]);
                }
            }
            res = Math.max(dp[i],res);
        }
        return res;
    }
}
