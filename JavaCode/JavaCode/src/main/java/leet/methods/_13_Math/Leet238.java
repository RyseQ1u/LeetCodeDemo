package leet.methods._13_Math;

import java.util.Arrays;

/**
 * 除自身以外数组的乘积
 */
public class Leet238 {

    public int[] productExceptSelf(int[] nums) {
        int[] res = new int[nums.length];
        Arrays.fill(res,1);
        //先计算左边的元素的乘积
        for (int i = 1; i < nums.length; i++) {
            res[i] = res[i - 1] * nums[i - 1];
        }
        //计算右边元素的乘积并乘入结果中
        int tmp = 1;
        for (int i = nums.length - 2; i >= 0; i--) {
            tmp*=nums[i+1];
            res[i]*=tmp;
        }

        return res;
    }
}
