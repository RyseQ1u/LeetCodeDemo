package leet.methods._8_Recall.review.L113;

import leet._class.Tree.TreeNode;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;

public class Leet113_r4 {
    List<List<Integer>> res = new ArrayList<>();
    LinkedList<Integer> cur = new LinkedList<>();

    public List<List<Integer>> pathSum(TreeNode root, int targetSum) {
        dfs(root, targetSum);
        return res;
    }

    void dfs(TreeNode root, int targetSum) {
        if (root == null) return;
        targetSum -= root.val;
        cur.add(root.val);
        if (targetSum == 0 && root.left == null && root.right == null) {
            res.add(new LinkedList<>(cur));
        }
        dfs(root.left,targetSum);
        dfs(root.right,targetSum);
        cur.removeLast();
    }
}
