package leet.methods._6_Search.review.L724;

public class Leet724_r1 {
    public int pivotIndex(int[] nums) {
        //左边的和 * 2 = 总和
        int sum = 0,leftSum = 0;
        for (int num : nums) {
            sum+=num;
        }
        for (int i = 0; i < nums.length; i++) {
            if(sum - nums[i] == leftSum * 2) return i;
            leftSum+=nums[i];
        }
        return -1;
    }
}
