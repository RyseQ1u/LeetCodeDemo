package leet.methods._10_Dynamic.review.L1480;

public class Leet1480_r3 {
    public int[] runningSum(int[] nums) {
        //前缀和
        int[] pre = new int[nums.length+1];
        int[] res = new int[nums.length];
        for (int i = 0; i < nums.length; i++) {
            pre[i+1]=nums[i]+pre[i];
            res[i]=pre[i+1];
        }
        return res;
    }
}
