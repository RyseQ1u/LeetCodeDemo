package leet.methods._8_Recall.review.L47;

import java.util.Collections;
import java.util.HashSet;
import java.util.LinkedList;
import java.util.List;

public class Leet47_r1 {
    LinkedList<List<Integer>> res = new LinkedList<>();
    LinkedList<Integer> curPath = new LinkedList<>();
    public List<List<Integer>> permuteUnique(int[] nums) {
        for (int num : nums) {
            curPath.add(num);
        }
        backtracking(0);
        return res;
    }

    void backtracking(int index) {
        if(index==curPath.size()){
            res.add(new LinkedList<>(curPath));
            return;
        }
        HashSet<Integer> set = new HashSet<>();
        for (int i = index; i < curPath.size(); i++) {
            if(!set.add(curPath.get(i)))continue;
            Collections.swap(curPath,index,i);
            backtracking(index+1);
            Collections.swap(curPath,i,index);
        }
    }
}
