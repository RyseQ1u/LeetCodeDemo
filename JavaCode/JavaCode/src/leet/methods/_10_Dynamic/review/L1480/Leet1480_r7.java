package leet.methods._10_Dynamic.review.L1480;

public class Leet1480_r7 {
    public int[] runningSum(int[] nums) {
        int n = nums.length;
        int[] pres = new int[n];
        pres[0]=nums[0];
        for (int i = 1; i < n; i++) {
            pres[i]=pres[i-1]+nums[i];
        }
        return pres;
    }
}
