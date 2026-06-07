package leet.methods._10_Dynamic.review.L213;

public class Leet213_r3 {
    public int rob(int[] nums) {
        if(nums.length==0)return 0;
        if(nums.length==1)return nums[0];
        //分类讨论
        //选第一家
        int res1 = 0,pre=0,tmp=0;
        for (int i = 0; i < nums.length-1; i++) {
            tmp=res1;
            res1=Math.max(res1,pre+nums[i]);
            pre=tmp;
        }
        int res2 = 0,pre2=0;
        for (int i = 1; i < nums.length; i++) {
            tmp=res2;
            res2=Math.max(res2,pre2+nums[i]);
            pre2=tmp;
        }
        return Math.max(res1,res2);
    }
}
