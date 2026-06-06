package leet.methods._6_Search.review.L724;

/// 寻找数组的中心下标
/// index 左边的和 等于 右边的和
public class Leet724_r3 {
    public int pivotIndex(int[] nums) {
        int cout = 0 ;
        for (int num : nums) {
            cout+=num;
        }
        int leftCount = 0;
        for (int i = 0; i < nums.length; i++) {
            if(leftCount * 2 == cout - nums[i]) return i;
            leftCount+=nums[i];
        }
        return -1;
    }
}
