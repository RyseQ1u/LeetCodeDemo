package leet.methods.recall;

import java.util.Arrays;
import java.util.LinkedList;
import java.util.List;

public class Leet40 {
    List<List<Integer>> res = new LinkedList<>();
    LinkedList<Integer> cur = new LinkedList<>();

    public List<List<Integer>> combinationSum2(int[] candidates, int target) {
        //排序
        Arrays.sort(candidates);
        backtracking(candidates, target, 0);
        return res;
    }

    void backtracking(int[] nums, int tar, int index) {
        //满足条件
        if (tar == 0) {
            res.add(new LinkedList<>(cur));
            return;
        }
        for (int i = index; i < nums.length; i++) {
            //大小判断
            if (tar - nums[i] < 0) {
                break;
            }
            //是否选择了大小重复的元素
            if (i > index && nums[i] == nums[i - 1]) continue;
            //添加当前元素
            cur.add(nums[i]);
            //递归
            backtracking(nums, tar - nums[i], i + 1);
            //退回当前元素
            cur.removeLast();
        }
    }


}
