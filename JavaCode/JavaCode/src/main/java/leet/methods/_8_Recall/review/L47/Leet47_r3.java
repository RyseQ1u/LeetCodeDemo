package leet.methods._8_Recall.review.L47;

import java.util.*;

public class Leet47_r3 {
    private final List<List<Integer>> res = new ArrayList<>();
    private final List<Integer> cur =  new LinkedList<>();
    public List<List<Integer>> permuteUnique(int[] nums) {
        for (int num : nums) {
            cur.add(num);
        }
        backtracking(0);
        return res;
    }

    void backtracking(int index){
        if(index==cur.size()){
            res.add(new LinkedList<>(cur));
            return;
        }
        HashSet<Integer> set = new HashSet<>();
        for (int i = index; i < cur.size(); i++) {
            if(!set.add(cur.get(i)))continue;
            Collections.swap(cur,index,i);
            backtracking(index+1);
            Collections.swap(cur,i,index);
        }
    }
}
