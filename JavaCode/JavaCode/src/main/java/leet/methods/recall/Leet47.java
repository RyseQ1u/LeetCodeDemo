package leet.methods.recall;

import java.util.Collections;
import java.util.HashSet;
import java.util.LinkedList;
import java.util.List;

public class Leet47 {

    LinkedList<List<Integer>> res = new LinkedList<>();
    LinkedList<Integer> curPath = new LinkedList<>();


    public List<List<Integer>> permuteUnique(int[] nums) {
        for (int num : nums) {
            curPath.add(num);
        }
        backtracking(0);
        return res;
    }

    /**
     * 优化
     * 将已遍历的元素移动
     */
    void backtracking(int index) {
        if (index == curPath.size()) {
            res.add(new LinkedList<>(curPath));
            return;
        }
        HashSet<Integer> set = new HashSet<>();
        for (int i = index; i < curPath.size(); i++) {
            //去重
            if (!set.add(curPath.get(i))) continue;
            //交换 记录已访问元素
            Collections.swap(curPath, index, i);
            backtracking(index + 1);
            //还原 回溯
            Collections.swap(curPath, i, index);
        }
    }
}
