package leet.methods._13_Math.L238;

public class Leet238_r5 {
    public int[] productExceptSelf(int[] nums) {
        int n = nums.length;
        int[] pre = new int[n+1];
        pre[0]=1;
        for (int i = 0; i < n; i++) {
            pre[i+1]=pre[i]*nums[i];
        }
        int[] res = new int[n];
        int right = 1;
        for (int i = nums.length - 1; i >= 0; i--) {
            res[i]=right*pre[i];
            right*=nums[i];
        }
        return res;
    }
}
