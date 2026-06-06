package leet.methods._9_DivideConquer.review.L226;

import leet._class.Tree.TreeNode;

import java.util.LinkedList;

/**
 * 翻转二叉树
 * 给你一棵二叉树的根节点 root ，翻转这棵二叉树，并返回其根节点。
 */
public class Leet226_r4 {
    public TreeNode invertTree(TreeNode root) {
        if (root == null) return root;
        TreeNode tmp = root.left;
        root.left = invertTree(root.right);
        root.right = invertTree(tmp);
        return root;
    }

    public TreeNode invertTree_V2(TreeNode root) {
        if (root == null) return root;
        //层序遍历 交换节点
        LinkedList<TreeNode> nodes = new LinkedList<>();
        nodes.add(root);
        while (!nodes.isEmpty()) {
            TreeNode cur = nodes.poll();
            if (cur.left != null) nodes.add(cur.left);
            if (cur.right != null) nodes.add(cur.right);
            TreeNode tmp = cur.left;
            cur.left = cur.right;
            cur.right = tmp;
        }
        return root;
    }
}
