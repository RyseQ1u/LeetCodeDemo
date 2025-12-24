package leet.methods._8_Recall.review.L113;

import leet._class.Tree.TreeNode;

import java.util.LinkedList;
import java.util.List;

public class Leet113_r2 {
    LinkedList<List<Integer>> res = new LinkedList<>();
    LinkedList<Integer> curList = new LinkedList<>();

    public List<List<Integer>> pathSum(TreeNode root, int targetSum) {
        dfs(root, targetSum);
        return res;
    }

    //前序遍历
    void dfs(TreeNode root, int tar) {
        if (root == null) return;
        curList.add(root.val);
        tar -= root.val;
        if (tar == 0 && root.left == null && root.right == null) res.add(new LinkedList<>(curList));
        dfs(root.left, tar);
        dfs(root.right, tar);
        //回溯 弹出当前值
        curList.removeLast();
    }
}
