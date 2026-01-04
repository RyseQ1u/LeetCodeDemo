package leet.methods._8_Recall.review.L47;

import java.util.ArrayList;
import java.util.Collections;
import java.util.HashSet;
import java.util.List;

public class Leet47_r4 {
    private final List<List<Integer>> res = new ArrayList<>();
    private final List<Integer> cur = new ArrayList<>();

    public List<List<Integer>> permuteUnique(int[] nums) {
        for (int num : nums) {
            cur.add(num);
        }
        bt(0);
        return res;
    }
    private void bt(int i){
        if(i==cur.size()){
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
