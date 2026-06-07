package leet.methods._10_Dynamic.review.L213;

public class Leet213_r5 {
    public int rob(int[] nums) {
        if(nums.length==0)return 0;
        if(nums.length==1)return nums[0];
        int cur1 =0,pre1 =0,cur2 =0,pre2 =0,tmp;
        for (int i = 0; i < nums.length-1; i++) {
            int num = nums[i];
            tmp = cur1;
            cur1=Math.max(pre1+num,cur1);
            pre1=tmp;
        }
        for (int i = 1; i < nums.length; i++) {
            int num = nums[i];
            tmp = cur2;
            cur2=Math.max(pre2+num,cur2);
            pre2=tmp;
        }
        return Math.max(cur1,cur2);
    }
}
