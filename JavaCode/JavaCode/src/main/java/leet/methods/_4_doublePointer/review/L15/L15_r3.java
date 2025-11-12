package leet.methods._4_doublePointer.review.L15;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class L15_r3 {
    public List<List<Integer>> threeSum(int[] nums) {
        List<List<Integer>> res = new ArrayList<>();
        //排序
        Arrays.sort(nums);
        int n = nums.length;
        for (int l = 0; l < n-2; l++) {
            if(l>0 && nums[l]==nums[l-1])continue;
            //转换为两数之和
            int m=l+1,r=n-1;
            //提前判断
            if(nums[l]+nums[m]+nums[m+1]>0) break;
            if(nums[l]+nums[r]+nums[r-1]<0)continue;
            while (m<r){
                int sum = nums[l]+nums[m]+nums[r];
                if(sum>0){
                    r--;
                }else if(sum<0){
                    m++;
                }else {
                    res.add(new ArrayList<>(Arrays.asList(nums[l],nums[m],nums[r])));
                    //排查重复项
                    while (m<r && nums[r]==nums[--r]);
                    while (m<r && nums[m]==nums[++m]);
                }
            }
        }
        return res;
    }
}
