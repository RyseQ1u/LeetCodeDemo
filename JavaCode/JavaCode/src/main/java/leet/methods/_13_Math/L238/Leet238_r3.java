package leet.methods._13_Math.L238;

public class Leet238_r3 {
    public int[] productExceptSelf(int[] nums) {
        int n = nums.length;
        //记录正向的乘积
        int[] res = new int[n];
        res[0]=1;
        for (int i = 1; i < n; i++) {
            res[i] = res[i-1]*nums[i-1];
        }
        //临时变量 记录后一位的值
        int tmp =1;
        for (int i = n - 1; i >= 0; i--) {
            res[i]*=tmp;
            tmp*=nums[i];
        }
        return res;
    }
}
