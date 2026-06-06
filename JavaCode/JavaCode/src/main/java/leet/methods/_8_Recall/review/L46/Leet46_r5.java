package leet.methods._8_Recall.review.L46;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;

public class Leet46_r5 {
    private final List<List<Integer>> res = new ArrayList<>();
    private final LinkedList<Integer> cur = new LinkedList<>();

    public List<List<Integer>> permute(int[] nums) {
        boolean[] used = new boolean[nums.length];
        bt(nums,used);
        return res;
    }
    private void bt(int[] nums, boolean[] used){
        if(cur.size()==nums.length){
            res.add(new ArrayList<>(cur));
            return;
        }
        for (int i = 0; i < nums.length; i++) {
            if(used[i])continue;
            used[i]=true;
            cur.add(nums[i]);
            bt(nums,used);
            used[i]=false;
            cur.removeLast();
        }

    }
}
