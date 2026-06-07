package leet.methods._13_Math.L238;

public class Leet238_r4 {
    public int[] productExceptSelf(int[] nums) {
            //前后缀积
            int n =nums.length;
            int[] res = new int[n];
            int[] prefix = new int[n+1];
            int[] suffix = new int[n+1];
            prefix[0]=1;
            suffix[n]=1;
            for (int i = 0; i < n; i++) {
                prefix[i+1]=prefix[i]*nums[i];
                suffix[n-1-i]=suffix[n-i]*nums[n-1-i];
            }
            for (int i = n-1; i >= 0; i--) {
                res[i]=prefix[i]*suffix[i+1];
            }
            return res;

    }
}
