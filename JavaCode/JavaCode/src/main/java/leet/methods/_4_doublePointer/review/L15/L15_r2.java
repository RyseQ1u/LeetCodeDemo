package leet.methods._4_doublePointer.review.L15;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class L15_r2 {
    public List<List<Integer>> threeSum(int[] nums) {
        //排序 拆分成两数之和
        Arrays.sort(nums);
        List<List<Integer>> res = new ArrayList<>();
        for (int l = 0; l < nums.length-2; l++) {
            //去重
            if(l>0 && nums[l]==nums[l-1]) continue;
            int m=l+1,r = nums.length-1;
            if(nums[l]+nums[m]+nums[m+1]>0){
                //当前最小值 大于0
                //没有结果直接返回
                break;
            }
            if(nums[l]+nums[r]+nums[r-1]<0){
                //当前最大值 小于0
                //跳过当前循环
                continue;
            }
            //计算两数之和
            while (m<r){
                if(nums[l]+nums[m]+nums[r] < 0){
                    m++;
                }else if(nums[l]+nums[m]+nums[r] > 0){
                    r--;
                }else {
                    res.add(new ArrayList<>(Arrays.asList( nums[l],nums[m],nums[r])));
                    //跳过重复项
                    while (m<r && nums[m] == nums[++m]);
                    while (m<r && nums[r] == nums[--r]);
                }
            }
        }
        return res;
    }
}
