package leet.methods._10_Dynamic.review.L213;

public class Leet213_r1 {
    public int rob(int[] nums) {
        if(nums.length == 0) return 0;
        if(nums.length == 1) return nums[0];
        //分情况讨论
        //选了第一家
        int res1 =0,pre1=0,tmp1,res2=0,pre2=0,tmp2=0;
        for (int i = 0; i < nums.length-1; i++) {
            tmp1=res1;
            res1=Math.max(nums[i]+pre1,res1);
            pre1=tmp1;
        }
        //不选第一家
        for (int i = 1; i < nums.length; i++) {
            tmp2=res2;
            res2=Math.max(nums[i]+pre2,res2);
            pre2=tmp2;
        }
        return Math.max(res1,res2);
    }
}
