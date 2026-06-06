package leet.methods._10_Dynamic.review.L300;

import java.util.Arrays;

public class Leet300_r6 {
    public int lengthOfLIS(int[] nums) {
        int n =nums.length,res=0;
        int[] dp = new int[n];
        Arrays.fill(dp,1);
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < i; j++) {
                if(nums[i]>nums[j]){
                    dp[i]=Math.max(dp[j]+1,dp[i]);
                }
            }
            res=Math.max(res,dp[i]);
        }
        return res;
    }
}
