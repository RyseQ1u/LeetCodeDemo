package leet.methods._10_Dynamic;

/**
 * 一维数组的动态求和
 */
public class Leet1480 {
    public int[] runningSum(int[] nums) {

        int[] res = new int[nums.length];
        int a =0;
        for (int i = 0; i < nums.length; i++) {
            res[i] = a+nums[i];
            a = res[i];
        }
        return res;
    }

    /**
     * 修改原数组
     */
    public int[] runningSum_V2(int[] nums) {
        for (int i = 1; i < nums.length; i++) {
            nums[i] +=nums[i-1];
        }
        return nums;
    }
}
