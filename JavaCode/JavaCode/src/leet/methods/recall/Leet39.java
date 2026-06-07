package leet.methods.recall;

import java.util.Arrays;
import java.util.LinkedList;
import java.util.List;

public class Leet39 {
    LinkedList<List<Integer>> res = new LinkedList<>();
    LinkedList<Integer> curPath = new LinkedList<>();

    public List<List<Integer>> combinationSum(int[] candidates, int target) {
        Arrays.sort(candidates);
        backtracking(candidates,target,0);
        return res;
    }

    void backtracking(int[] nums,int tar,int i){
        if(tar==0){
            res.add(new LinkedList<>(curPath));
            return;
        }
        for (int j = i; j < nums.length; j++) {
            int diff = tar-nums[j];
            if(diff<0){
                break;
            }
            curPath.add(nums[j]);
            //递归
            backtracking(nums,diff,j);
            //回退
            curPath.removeLast();
        }
    }
}
