package leet.methods._10_Dynamic.review.L53;

public class Leet53_r1 {
    public int maxSubArray(int[] nums) {
        //维护当前元素的最大值
        int res=nums[0],pre=nums[0];
        for (int i = 1; i < nums.length; i++) {
            //通过比较前面元素和 当前元素 获取到当前位置能取得的最大值
            pre = Math.max(nums[i],pre+nums[i]);
            res=Math.max(res,pre);
        }
        return res;
    }
}
