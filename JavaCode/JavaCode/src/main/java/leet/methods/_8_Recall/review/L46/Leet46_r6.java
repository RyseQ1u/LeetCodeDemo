package leet.methods._8_Recall.review.L46;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;

public class Leet46_r6 {
    private final List<List<Integer>> res = new ArrayList<>();
    private final LinkedList<Integer> list = new LinkedList<>();
    public List<List<Integer>> permute(int[] nums) {
        //判断是否被使用了
        boolean[] used = new boolean[nums.length];
        dfs(nums,used);
        return res;
    }

    void dfs(int[] nums,boolean[] used){
        if(list.size()==nums.length){
            res.add(new ArrayList<>(list));
            return;
        }
        for (int i = 0; i < nums.length; i++) {
            if(used[i])continue;
            list.add(nums[i]);
            used[i]=true;
            dfs(nums,used);
            used[i]=false;
            list.removeLast();
        }
    }
}
