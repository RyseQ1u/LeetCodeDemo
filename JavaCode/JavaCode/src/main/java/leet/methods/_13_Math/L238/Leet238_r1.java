package leet.methods._13_Math.L238;

public class Leet238_r1 {
    public int[] productExceptSelf(int[] nums) {
        //前缀积
        int n = nums.length;
        int[] res = new int[n];
        int[] pre = new int[n+1],next = new int[n+1];
        pre[0]=1;
        next[n]=1;
        for (int i = 0; i < nums.length; i++) {
            pre[i+1] = pre[i]*nums[i];
            next[n-1-i] = next[n-i]*nums[n-1-i];
        }
        for (int i = 0; i < n; i++) {
            res[i] = pre[i] * next[i+1];
        }
        return res;
    }

    /**
     * 空间优化
     * @param nums
     * @return
     */
    public int[] productExceptSelf_V2(int[] nums) {
        int n = nums.length;
        int[] res = new int[n];

        // 先计算前缀积：res[i] = nums[0]*...*nums[i-1]
        res[0] = 1;
        for (int i = 1; i < n; i++) {
            res[i] = res[i - 1] * nums[i - 1];
        }

        // 再从右往左乘后缀积：维护 suffix 表示 nums[i+1]*...*nums[n-1]
        int suffix = 1;
        for (int i = n - 1; i >= 0; i--) {
            res[i] *= suffix;
            suffix *= nums[i];
        }
        return res;
    }
}
