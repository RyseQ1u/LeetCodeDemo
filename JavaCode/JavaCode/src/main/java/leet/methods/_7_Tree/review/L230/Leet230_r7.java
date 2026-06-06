package leet.methods._7_Tree.review.L230;

import leet._class.Tree.TreeNode;

import java.util.ArrayList;

/// 二叉搜索树中第 K 小的元素
public class Leet230_r7 {
    private final ArrayList<Integer> list = new ArrayList<Integer>();
    private int K;

    public int kthSmallest(TreeNode root, int k) {
        K = k;
        dfs(root);
        return list.get(list.size() - 1);
    }

    private void dfs(TreeNode root) {
        if (root == null) return;
        dfs(root.left);
        if (list.size() == K)
            return;
        list.add(root.val);
        dfs(root.right);
    }
}
