package leet.methods._4_doublePointer.review.L15;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class L15_r5 {
    /// 排序 转换两数字和
    public List<List<Integer>> threeSum(int[] nums) {
        Arrays.sort(nums);
        int n  = nums.length;
        List<List<Integer>> res = new ArrayList<>();
        for (int l=0; l < n-2; l++) {
            if (l > 0 && nums[l] == nums[l - 1]) continue;
            int m=l+1,r=n-1;
            if(nums[l]+nums[m]+nums[m+1]>0) break;
            if(nums[l]+nums[r]+nums[r-1]<0)continue;
            //两数之和
            while (m<r){
                int sum = nums[l]+nums[m]+nums[r];
                if(sum>0){
                    r--;
                }else if(sum<0) {
                    m++;
                }else {
                    res.add(Arrays.asList(nums[l],nums[m],nums[r]));
                    while (m<r && nums[m] == nums[++m]);
                    while (m<r && nums[r] == nums[--r]);
                }
            }
        }
        return res;
    }
}
