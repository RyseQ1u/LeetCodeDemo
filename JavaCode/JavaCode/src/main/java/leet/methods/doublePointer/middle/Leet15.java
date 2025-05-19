package leet.methods.doublePointer.middle;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Leet15 {


    public List<List<Integer>> threeSum(int[] nums) {
        //对数组排序
        Arrays.sort((nums));
        List<List<Integer>> res = new ArrayList<>();
        //left记录第一个元素
        for (int left = 0; left < nums.length-2; left++) {
            //如果第一个元素大于0，后续不会有结果，直接跳出循环
            if (nums[left] > 0) break;
            //如果第一个元素与上一次相同 跳过该次循环 避免结果重复
            if (left > 0 && nums[left] == nums[left-1]) continue;
            //设置middle，right
            int middle = left + 1, right = nums.length - 1;
            //开始循环匹配
            while (middle < right) {
                int sum = nums[left] + nums[middle] + nums[right];
                if (sum < 0) {
                    //需要→移动middle指针
                    while (middle < right && nums[middle] == nums[++middle]) ;
                } else if (sum > 0) {
                    //需要←移动right指针
                    while (middle < right && nums[right] == nums[--right]) ;
                } else {
                    //等于0的时候记录答案，并同时移动两个指针
                    res.add(new ArrayList<>(Arrays.asList(nums[left], nums[middle], nums[right])));
                    while (middle < right && nums[middle] == nums[++middle]) ;
                    while (middle < right && nums[right] == nums[--right]) ;
                }
            }
        }
        return res;
    }

}
