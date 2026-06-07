package leet.methods._6_Search.review.L724;

/// 寻找数组的中心下标
/// index 左边的和 等于 右边的和
public class Leet724_r6 {
    public int pivotIndex(int[] nums) {
        int sum = 0,leftsum=0;
        for (int num : nums) {
            sum+=num;
        }
        for (int i = 0; i < nums.length; i++) {
            sum-=nums[i];
            if(leftsum == sum)return i;
            leftsum +=nums[i];
        }
        return -1;
    }
}
