package leet.methods._4_doublePointer.review.L15;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

/// 三数之和
public class L15_r7 {
    public List<List<Integer>> threeSum(int[] nums) {
        //排序
        Arrays.sort(nums);
        List<List<Integer>> res = new ArrayList<>();
        int l = 0;
        for (; l < nums.length - 2; l++) {
            if (l > 0 && nums[l - 1] == nums[l]) continue;
            int m = l + 1, r = nums.length - 1;
            if (nums[l] + nums[m] + nums[m + 1] > 0) break;
            if (nums[l] + nums[r] + nums[r - 1] < 0) continue;
            while (m<r){
                int sum = nums[l] + nums[m] + nums[r];
                if (sum > 0) {
                    r--;
                } else if (sum < 0) {
                    m++;
                } else {
                    res.add(Arrays.asList(nums[l], nums[m], nums[r]));
                    while (m < r && nums[m] == nums[++m]) ;
                    while (m < r && nums[r] == nums[--r]) ;
                }
            }
        }
        return res;
    }
}
