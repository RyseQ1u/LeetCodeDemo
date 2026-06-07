package leet.methods._10_Dynamic.review.L1480;

public class Leet1480_r1 {
    public int[] runningSum(int[] nums) {
        int[] adds = new int[nums.length+1];
        for (int i = 0; i < nums.length; i++) {
            adds[i+1]=adds[i]+nums[i];
        }
        int[] res = new int[nums.length];
        System.arraycopy(adds, 1, res, 0, adds.length - 1);
        return res;
    }
}
