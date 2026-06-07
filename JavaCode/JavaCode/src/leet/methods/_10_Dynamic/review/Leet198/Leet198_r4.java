package leet.methods._10_Dynamic.review.Leet198;

public class Leet198_r4 {
    public int rob(int[] nums) {
        int res = 0,pre = 0,tmp;
        for (int i = 0; i < nums.length; i++) {
            tmp=res;
            res = Math.max(pre+nums[i],res);
            pre=tmp;
        }
        return res;
    }
}
