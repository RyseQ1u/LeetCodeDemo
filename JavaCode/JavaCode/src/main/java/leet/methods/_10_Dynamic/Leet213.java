package leet.methods._10_Dynamic;

/**
 * 打家劫舍 II
 */
public class Leet213 {

    /**
     * 打家劫舍 II
     * 维护前一位的最大和
     */
    public int rob(int[] nums) {
        //分情况
        //第一家偷了最后一家就不能偷 n -> [0,nums.length-2]
        //第一家没偷 n -> [1,nums.length-1]
        int n = nums.length;
        if(n==1) return nums[0];
        if(n==0) return 0;
        int[] dp1 = new int[n];
        int[] dp2 = new int[n];
        //设置第一间的最大值
        dp1[0] = nums[0];
        //设置第二间的最大值
        dp1[1] =  Math.max(nums[0], nums[1]);
        //第一间不偷 第一间最大值为0跳过设置 省略 dp2[0]=0
        dp2[1] = nums[1];
        for (int i = 2; i < dp1.length; i++) {
            dp1[i] = Math.max(dp1[i-1],dp1[i-2]+nums[i]);
            dp2[i] = Math.max(dp2[i-1],dp2[i-2]+nums[i]);
        }
        //dp1 最后一间不能偷所以取值取到n-2
        return Math.max(dp1[n-2],dp2[n-1]);
    }
}
