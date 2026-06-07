package leet.methods._8_Recall.review.L113;

import leet._class.Tree.TreeNode;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;

public class Leet113_r7 {
    List<List<Integer>> res;
    LinkedList<Integer> cur;
    public List<List<Integer>> pathSum(TreeNode root, int targetSum) {
        res = new ArrayList<>();
        cur=new LinkedList<>();
        dfs(root,targetSum);
        return res;
    }

    void dfs(TreeNode root,int targetSum){
        if(root==null)return;
        cur.add(root.val);
        if(targetSum==root.val && root.right==null  && root.left==null){
            res.add(new ArrayList<>(cur));
        }
        dfs(root.left,targetSum-root.val);
        dfs(root.right,targetSum-root.val);
        cur.removeLast();
    }
}
