package leet.methods._4_doublePointer.review.L15;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class L15_r1 {
    public List<List<Integer>> threeSum(int[] nums) {
        //排序
        Arrays.sort(nums);
        List<List<Integer>> res = new ArrayList<>();
        for (int left = 0; left < nums.length-2; left++) {
            //如果第一个元素与上一次相同 跳过该次循环
            if(left>0 &&  nums[left] == nums[left -1])continue;

            //将题目转换为两数之和
            int middle = left+1,right = nums.length-1;
            //提前检查 判断后续两个个元素（即当前最小的三个元素）和是否大于0 代表点后续无结果直接返回
            if(nums[left] + nums[middle]+ nums[middle]>0)break;
            //提交检查 判断最后两个元素加起来是否小于0 代表当前left指针元素过小
            if(nums[left]+nums[right]+nums[right-1] < 0 )continue;

            while (middle<right){
                int  sum = nums[left]+nums[middle]+nums[right];
                if(sum>0){
                    //移动右指针使和变小 跳过重复数字
                    right--;
                }else if(sum<0) {
                    //移动左指针使和变大 跳过重复数字
                   middle++;
                }else {
                    //相等时移动两个指针 跳过重复数字
                    res.add(new ArrayList<>(Arrays.asList(nums[left],nums[middle],nums[right])));
                    while (middle<right && nums[right]==nums[--right]);
                    while (middle<right && nums[middle]==nums[++middle]);
                }
            }
        }
        return res;
    }
}
