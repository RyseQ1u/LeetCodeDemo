package leet.methods._10_Dynamic.review.L213;

public class Leet213_r2 {
    public int rob(int[] nums) {
        if(nums.length==0)return 0;
        if(nums.length==1)return nums[0];
        int res1 = subrob(nums,0,nums.length-1);
        int res2 = subrob(nums,1,nums.length);
        return Math.max(res1,res2);
    }

    private int subrob(int[] nums,int s, int e) {
        int tmp=0,res=0,pre=0;
        for (int i = s; i < e; i++) {
            tmp = res;
            res = Math.max(res, pre + nums[i]);
            pre = tmp;
        }
        return res;
    }
}
