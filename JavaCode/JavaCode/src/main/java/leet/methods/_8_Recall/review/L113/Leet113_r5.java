package leet.methods._8_Recall.review.L113;

import leet._class.Tree.TreeNode;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;

public class Leet113_r5 {
    private final List<List<Integer>> res = new ArrayList<>();
    private final LinkedList<Integer> cur =  new LinkedList<>();
    public List<List<Integer>> pathSum(TreeNode root, int targetSum) {
        dfs(root,targetSum);
        return res;
    }
    private void dfs(TreeNode root, int targetSum){
        //前序遍历
        if(root==null)return;
        targetSum-=root.val;
        cur.add(root.val);
        if(targetSum ==0 && root.left==null&&root.right==null)res.add(new ArrayList<>(cur));
        if(root.left!=null)dfs(root.left,targetSum);
        if(root.right!=null)dfs(root.right,targetSum);
        cur.removeLast();
    }
}
