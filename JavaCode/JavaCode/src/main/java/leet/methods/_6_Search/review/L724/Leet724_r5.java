package leet.methods._6_Search.review.L724;

/// 寻找数组的中心下标
/// index 左边的和 等于 右边的和
public class Leet724_r5 {
    public int pivotIndex(int[] nums) {
        int count = 0, leftCount = 0;
        for (int num : nums) {
            count += num;
        }
        for (int i = 0; i < nums.length; i++) {
            if(count-nums[i]== 2 * leftCount)return i;
            leftCount+=nums[i];
        }
        return -1;
    }
}
