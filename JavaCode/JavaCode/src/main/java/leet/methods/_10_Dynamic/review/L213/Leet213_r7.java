package leet.methods._10_Dynamic.review.L213;

public class Leet213_r7 {
    public int rob(int[] nums) {
        //分类讨论
        if(nums.length==1)return nums[0];
        if(nums.length==2)return Math.max(nums[0],nums[1]);
        int n = nums.length;
        //第一家不偷
        int[] dp1 = new int[n];
        dp1[1]=nums[1];
        dp1[2]=Math.max(nums[1],nums[2]);
        for (int i = 3; i < n; i++) {
            dp1[i]=Math.max(nums[i]+dp1[i-2],dp1[i-1]);
        }
        int[] dp2 = new int[n];
        //偷第一家
        dp2[0]=nums[0];
        dp2[1]=Math.max(nums[0],nums[1]);
        for (int i = 2; i < n-1; i++) {
            dp2[i]=Math.max(dp2[i-2]+nums[i],dp2[i-1]);
        }
        return Math.max(dp1[n-1],dp2[n-2]);
    }
}
