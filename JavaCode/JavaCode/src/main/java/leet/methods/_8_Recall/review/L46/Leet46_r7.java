package leet.methods._8_Recall.review.L46;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;

public class Leet46_r7 {
    List<List<Integer>> res ;
    LinkedList<Integer> cur = new LinkedList<>();

    public List<List<Integer>> permute(int[] nums) {
        res =new ArrayList<>();
        boolean[] used = new boolean[nums.length];
        recall(nums,used);
        return res;
    }

    void recall(int[] nums,boolean[] used){
        if(cur.size()==nums.length){
            res.add(new ArrayList<>(cur));
            return;
        }
        for (int i = 0; i < nums.length; i++) {
            if(used[i])continue;
            cur.add(nums[i]);
            used[i]=true;
            recall(nums,used);
            used[i]=false;
            cur.removeLast();
        }
    }
}
