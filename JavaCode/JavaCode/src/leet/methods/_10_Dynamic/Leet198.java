package leet.methods._10_Dynamic;

/**
 * 打家劫舍
 */
public class Leet198 {

    /**
     * 打家劫舍
     * 维护前一位的最大和
     */
    public int rob(int[] nums) {

        int[] ints = new int[nums.length+1];
        for (int i = 0; i < ints.length-1; i++) {
            ints[i+1]=nums[i];
        }
        for (int i = 2; i < ints.length; i++) {
            ints[i] = Math.max(ints[i-1],ints[i]+ints[i-2]);

        }
        return ints[ints.length];
    }

    /**
     * 打家劫舍
     * 维护前一位的最大和
     * 优化代码
     */
    public int rob_V2(int[] nums) {
        int cur = 0,pre=0,tmp=0;
        for (int num : nums) {
            tmp = cur;
            cur = Math.max(cur,pre+num);
            pre = tmp;
        }
        return cur;
    }
}
