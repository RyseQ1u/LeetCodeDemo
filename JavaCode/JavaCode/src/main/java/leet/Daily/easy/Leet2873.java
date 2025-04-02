package leet.Daily.easy;

public class Leet2873 {

    /**
     * 暴力破解
     * @param nums
     * @return
     */
    public long maximumTripletValue_V1(int[] nums) {
        long max = 0;
        for (int i = 0; i < nums.length; i++) {
            for (int j = i+1; j < nums.length; j++) {
                for (int k = j+1; k < nums.length; k++) {
                    //注意类型溢出
                    max = Math.max((long)((nums[i]-nums[j])) * nums[k],max);
                }
            }
        }
        return max;
    }


    /**
     * 记录前后最大值
     * @param nums
     * @return
     */
    public long maximumTripletValue(int[] nums) {
        int n = nums.length;
        //从后往前 记录当前 nums[k] 最大值
        int[] sufMax = new int[n + 1];
        for (int i = n - 1; i > 1; i--) {
            sufMax[i] = Math.max(sufMax[i + 1], nums[i]);
        }

        long ans = 0;
        //一边计算 一边记录从前往后当前（nums[i]+nums[j]）的最大值
        int preMax = nums[0];
        for (int j = 1; j < n - 1; j++) {
            ans = Math.max(ans, (long) (preMax - nums[j]) * sufMax[j + 1]);
            preMax = Math.max(preMax, nums[j]);
        }
        return ans;
    }

}
