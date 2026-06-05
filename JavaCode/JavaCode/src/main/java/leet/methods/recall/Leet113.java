package leet.methods.recall;

import leet._class.Tree.TreeNode;

import java.util.LinkedList;
import java.util.List;

public class Leet113 {

    LinkedList<List<Integer>> res = new LinkedList<>();
    LinkedList<Integer> curPath = new LinkedList<>();
    
    /**
     * DFS
     */
    public List<List<Integer>> pathSum(TreeNode root, int targetSum) {
        recall(root,targetSum);
        return res;
    }
    
    void recall(TreeNode root, int tar){
        if(root==null) return;
        curPath.add(root.val);
        tar-=root.val;
        //判断是否抵达叶子节点并满足条件
        if (tar==0&&root.left==null&&root.right==null){
            res.add(new LinkedList<>(curPath));
        }
        recall(root.left,tar);
        recall(root.right,tar);
        //回溯 移除当前节点
        curPath.removeLast();
    }




}
