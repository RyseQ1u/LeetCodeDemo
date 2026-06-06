package leet.methods._6_Search.review.L704;

///  升序数组 二分查找
public class Leet704_r6 {
    public int search(int[] nums, int target) {
        int l = 0, r = nums.length - 1;
        while (l <= r) {
            //取中位数
            int n = l + (r - l) / 2;
            if (nums[n] < target) {
                l = n + 1;
            } else if (nums[n] > target) {
                r = n - 1;
            } else {
                return n;
            }
        }
        return -1;
    }
}
