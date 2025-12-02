package leet.methods.Search.review.L704;

///  升序数组 二分查找
public class Leet704_r1 {
    public int search(int[] nums, int target) {
        //创建左右指针
        int n = nums.length, l = 0, r = n - 1;
        while (l <= r) {
            int mid = (l + r) / 2;
            if (nums[mid] > target) {
                r = mid - 1;
            } else if (nums[mid] < target) {
                l = mid + 1;
            } else {
                return mid;
            }
        }
        return -1;
    }
}
