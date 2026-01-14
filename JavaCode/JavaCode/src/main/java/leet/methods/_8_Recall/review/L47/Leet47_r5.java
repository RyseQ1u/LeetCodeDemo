package leet.methods._8_Recall.review.L47;

import java.util.*;

public class Leet47_r5 {
    private final List<List<Integer>> res = new ArrayList<>();
    private final LinkedList<Integer> cur = new LinkedList<>();
    public List<List<Integer>> permuteUnique(int[] nums) {
        for (int num : nums) {
            cur.add(num);
        }

        return new LinkedList<>();
    }
    private void bt(int i){
        if(cur.size()==i){
            res.add(new ArrayList<>(cur));
            return;
        }
        HashSet<Integer> set = new HashSet<>();
        for (int j = i; j < cur.size(); j++) {
            if(!set.add(cur.get(j)))continue;
            Collections.swap(cur,i,j);
            bt(i+1);
            Collections.swap(cur,j,i);
        }
    }
}
