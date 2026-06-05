package leet.methods.Search;

import java.util.Arrays;

public class Leet724 {

    /**
     * 遍历比较左右两边的数据大小
     */
    public int pivotIndex(int[] nums) {
        //左右两边元素的和
        int l=0,r= Arrays.stream(nums).sum();
        for (int i = 0; i < nums.length; i++) {
            //右边减去当前元素
            r-=nums[i];
            if(l==r){
                return i;
            }
            //左边添加当前元素
            l+=nums[i];
        }
        return -1;
    }

    /**
     * 使用左边的和 * 2 等于总和
     */
    public int pivotIndex_V2(int[] nums) {
        int s = 0;
        for (int num : nums) {
            s += num;
        }
        int leftS = 0;
        for (int i = 0; i < nums.length; i++) {
            if (leftS * 2 == s - nums[i]) {
                return i;
            }
            leftS += nums[i];
        }
        return -1;

    }

}
