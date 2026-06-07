package leet.methods._8_Recall.review.L47;

import java.util.*;

public class Leet47_r6 {
    private final List<List<Integer>> res = new ArrayList<>();
    private final LinkedList<Integer> list = new LinkedList<Integer>();

    public List<List<Integer>> permuteUnique(int[] nums) {
        for (int num : nums) {
            list.add(num);
        }
        dfs(0);
        return res;
    }

    void dfs(int i){
        if(list.size()==i){
            res.add(new ArrayList<>(list));
            return;
        }
        //去重 每个位置不能出现重复的值
        HashSet<Integer> set = new HashSet<>();
        for (int j = i; j < list.size(); j++) {
            if(!set.add(list.get(j)))continue;
            //交互元素
            Collections.swap(list,i,j);
            //递归
            dfs(i+1);
            //还原
            Collections.swap(list,j,i);
        }
    }
}
