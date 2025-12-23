package leet.methods._8_Recall.review.L113;

import leet._class.Tree.TreeNode;

import java.util.LinkedList;
import java.util.List;

public class Leet113_Template {
    LinkedList<List<Integer>> res = new LinkedList<>();
    LinkedList<Integer> curList = new LinkedList<>();
    public List<List<Integer>> pathSum(TreeNode root, int targetSum) {
        dfs(root,targetSum);
        return res;
    }

    void dfs(TreeNode root,int tar){
        if(root==null)return;
        curList.add(root.val);
        tar-=root.val;
        //是否叶子节点并满足目标
        if(tar==0&&root.left==null&&root.right==null)
            res.add(new LinkedList<>(curList));
        dfs(root.left,tar);
        dfs(root.right,tar);
        curList.removeLast();
    }
}
