package leet.methods._8_Recall.review.L46;

import java.util.LinkedList;
import java.util.List;

public class Leet46_r1 {
    LinkedList<List<Integer>> res = new LinkedList<>();
    LinkedList<Integer> curPath = new LinkedList<>();
    public List<List<Integer>> permute(int[] nums) {
        boolean[] used = new boolean[nums.length];
        backtracking(nums,used);
        return res;
    }

    void backtracking(int[] nums,boolean[] used){
        if(curPath.size()==nums.length){
            res.add(new LinkedList<>(curPath));
            return;
        }
        for (int i = 0; i < nums.length; i++) {
            if(used[i])continue;
            used[i]=true;
            curPath.add(nums[i]);
            backtracking(nums,used);
            curPath.removeLast();
            used[i]=false;
        }
    }
}
