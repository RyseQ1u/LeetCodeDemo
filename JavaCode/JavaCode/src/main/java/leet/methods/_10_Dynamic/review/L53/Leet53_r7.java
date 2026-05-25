package leet.methods._10_Dynamic.review.L53;

public class Leet53_r7 {
    public int maxSubArray(int[] nums) {
        int res=0,n=nums.length;
        //前缀和
        int[] prefix = new int[n + 1];
        for (int i = 0; i < nums.length; i++) {
            prefix[i+1]=nums[i]+prefix[i];
        }
        for (int i = 0; i < nums.length; i++) {
           res = Math.min( Math.max(prefix[i]+nums[i],nums[i]),res);
        }
        return res;
    }
}
