package leet.methods._8_Recall.review.L47;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.LinkedList;
import java.util.List;

public class Leet47_r7 {
    List<List<Integer>> res =new ArrayList<>();
    LinkedList<Integer> cur = new LinkedList<>();
    public List<List<Integer>> permuteUnique(int[] nums) {
        dfs(nums,new boolean[nums.length]);
        return res;
    }

    void dfs(int[] nums,boolean[] used){
        if(cur.size()==nums.length){
            res.add(new ArrayList<>(cur));
            return;
        }
        HashSet<Integer> set = new HashSet<Integer>();
        for (int i = 0; i < nums.length; i++) {
            if(used[i] || !set.add(nums[i]))continue;
            cur.add(nums[i]);
            used[i]=true;
            dfs(nums,used);
            used[i]=false;
            cur.removeLast();
        }
    }
}
