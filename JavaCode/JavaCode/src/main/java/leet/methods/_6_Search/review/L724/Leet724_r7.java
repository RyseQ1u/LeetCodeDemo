package leet.methods._6_Search.review.L724;

/// 寻找数组的中心下标
/// index 左边的和 等于 右边的和
public class Leet724_r7 {
    public int pivotIndex(int[] nums) {
        int leftCount = 0,count=0;
        for (int num : nums) {
            count+=num;
        }
        for (int i = 0; i < nums.length; i++) {
            int n = nums[i];
            if(leftCount *2 == count-n){
                return i;
            }
            leftCount+=n;
        }
        return -1;
    }
}
