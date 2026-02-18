package leet.methods._10_Dynamic.review.L213;

public class Leet213_r4 {
    public int rob(int[] nums) {
        int pre1=0,pre2=0,res1=0,res2=0,tmp;
        for (int i = 0; i < nums.length-1; i++) {
            tmp = res1;
            res1 = Math.max(pre1+nums[i],res1);
            pre1 = tmp;
        }
        for (int i = 1; i < nums.length; i++) {
            tmp = pre2;
            res2 = Math.max(pre2+nums[i],res2);
            pre2 = tmp;
        }
        return Math.max(res1,res2);
    }
}
