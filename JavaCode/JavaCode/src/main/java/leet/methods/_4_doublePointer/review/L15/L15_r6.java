package leet.methods._4_doublePointer.review.L15;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

/// 三数之和
public class L15_r6 {
    public List<List<Integer>> threeSum(int[] nums) {
        //先排序，再转两数之和
        Arrays.sort(nums);
        List<List<Integer>> res = new ArrayList<>();
        int n = nums.length, left = 0;
        for (; left < n - 2; left++) {
            if (left > 0 && nums[left] == nums[left - 1]) continue;
            int mid = left + 1, right = n - 1;
            if (nums[left] + nums[mid + 1] + nums[mid] > 0) break;
            if (nums[left] + nums[right - 1] + nums[right] < 0) continue;
            while (mid < right) {
                if (nums[left] + nums[mid] + nums[right] > 0) {
                    right--;
                } else if (nums[left] + nums[mid] + nums[right] < 0) {
                    mid++;
                } else {
                    res.add(Arrays.asList(nums[left], nums[mid], nums[right]));
                    while (mid < right && nums[mid] == nums[++mid]) ;
                    while (mid < right && nums[right] == nums[--right]) ;
                }
            }
        }
        return res;
    }
}
