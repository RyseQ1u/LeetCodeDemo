package leet.methods._10_Dynamic.review.Leet198;

public class Leet198_r2 {
    public int rob(int[] nums) {
        int res = 0,pre=0,tmp=0;
        for (int num : nums) {
            tmp = res;
            res = Math.max(res,pre+num);
            pre = tmp;
        }
        return res;
    }
}
