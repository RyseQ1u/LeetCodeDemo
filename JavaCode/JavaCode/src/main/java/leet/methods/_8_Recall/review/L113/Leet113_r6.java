package leet.methods._8_Recall.review.L113;

import leet._class.Tree.TreeNode;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;

public class Leet113_r6 {

    private final LinkedList<Integer> list = new LinkedList<>();
    private final List<List<Integer>> res = new ArrayList<>();
    public List<List<Integer>> pathSum(TreeNode root, int targetSum) {
        dfs(root,targetSum);
        return res;
    }

    void  dfs(TreeNode root,int targetSum){
        if(root==null)return;
        list.add(root.val);
        if(root.left==null&&root.right==null&& targetSum==root.val) {
            res.add(new ArrayList<>(list));
        }
        dfs(root.right,targetSum-root.val);
        dfs(root.left,targetSum-root.val);
        list.removeLast();
    }
}
