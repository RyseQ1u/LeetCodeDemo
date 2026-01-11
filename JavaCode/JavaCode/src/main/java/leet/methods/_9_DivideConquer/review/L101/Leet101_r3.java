package leet.methods._9_DivideConquer.review.L101;

import leet._class.Tree.TreeNode;

import java.util.LinkedList;

/// 给你一个二叉树的根节点 root ， 检查它是否轴对称。
public class Leet101_r3 {

    /// 递归实现
    public boolean isSymmetric(TreeNode root) {
        if (root == null) return true;
        return dfs(root.left, root.right);
    }

    boolean dfs(TreeNode l, TreeNode r) {
        if (l == null && r == null) return true;
        if (l == null || r == null) return false;
        if (l.val != r.val) return false;
        return dfs(l.left, r.right) && dfs(l.right, r.left);
    }

    /// 迭代实现
    public boolean isSymmetric_V2(TreeNode root) {
        if (root == null) return true;
        LinkedList<TreeNode> nodes = new LinkedList<>();
        nodes.add(root.left);
        nodes.add(root.right);
        while (!nodes.isEmpty()) {
            TreeNode left = nodes.poll();
            TreeNode right = nodes.poll();
            if (left == null && right == null) continue;
            if (left == null || right == null) return false;
            if (left.val != right.val) return false;
            nodes.add(left.left);
            nodes.add(right.right);
            nodes.add(left.right);
            nodes.add(right.left);
        }
        return true;
    }

}
