package leet.methods.Search;

public class Leet704 {

    /**
     * 给定一个 n 个元素有序的（升序）整型数组 nums 和一个目标值 target
     * ，写一个函数搜索 nums 中的 target，如果目标值存在返回下标，否则返回 -1。
     */
    public int search(int[] nums, int target) {
        int l = 0, r = nums.length - 1, i;
        while (l <= r) {
            i = (r + l) / 2;
            if (nums[i] < target) {
                l = i + 1;
            } else if (nums[i] > target) {
                r = i - 1;
            } else {
                return i;
            }
        }
        return -1;
    }


}
