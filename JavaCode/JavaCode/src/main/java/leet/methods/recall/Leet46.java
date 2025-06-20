package leet.methods.recall;

import java.util.Collections;
import java.util.LinkedList;
import java.util.List;

public class Leet46 {

    LinkedList<List<Integer>> res = new LinkedList<>();
    LinkedList<Integer> curPath = new LinkedList<>();
    

    public List<List<Integer>> permute(int[] nums) {
        boolean[] used = new boolean[nums.length];
        backtracking(nums,used);
        return res;
    }

    //使用数组标记
    void backtracking(int[] nums,boolean[] used){
        //判断是否遍历完
        if(curPath.size() == nums.length){
            res.add(new LinkedList<>( curPath));
            return;
        }
        //遍历元素
        for (int i = 0; i < nums.length; i++) {
            //判断元素是否已经使用
            if(used[i]) continue;
            //将当前元素标记使用
            used[i]=true;
            //将当前元素加入列表
            curPath.add(nums[i]);
            //递归
            backtracking(nums,used);
            //弹出元素
            curPath.removeLast();
            //取消使用标记
            used[i] = false;
        }
    }

    public List<List<Integer>> permute_V2(int[] nums) {
        for (int num : nums) {
            curPath.add(num);
        }
        backtracking_V2(0);
        return res;
    }

    /**
     * 优化
     * 将已遍历的元素移动
     */
    void backtracking_V2(int index){
        //判断是否遍历完
        if(curPath.size() == index){
            res.add(new LinkedList<>( curPath));
            return;
        }
        //遍历元素
        for (int i = index; i < curPath.size(); i++) {
            //将当前数移动 将当前元素移动到左边代表已遍历
            Collections.swap(curPath,index,i);
            backtracking_V2(index+1);
            //回溯 撤销操作
            Collections.swap(curPath,i,index);

        }
    }
}
