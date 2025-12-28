package leet.methods._8_Recall.review.L46;

import java.util.LinkedList;
import java.util.List;

public class Leet46_r3 {
    LinkedList<List<Integer>> res = new LinkedList<>();
    LinkedList<Integer> cur = new LinkedList<>();

    public List<List<Integer>> permute(int[] nums) {
        boolean[] used = new boolean[nums.length];
        dfs(nums,used);
        return res;
    }

    void dfs(int[] nums,boolean[] used){
        if(cur.size()==nums.length){
            res.add(new LinkedList<>(cur));
            return;
        }
        for (int i = 0; i < nums.length; i++) {
            if(used[i])continue;
            used[i]=true;
            cur.add(nums[i]);
            dfs(nums,used);
            cur.removeLast();
            used[i]=false;
        }
    }
}
