package leet.methods._9_DivideConquer.review.L226;

import leet._class.Tree.TreeNode;

import java.util.LinkedList;

/**
 * 翻转二叉树
 * 给你一棵二叉树的根节点 root ，翻转这棵二叉树，并返回其根节点。
 */
public class Leet226_r6 {
    public TreeNode invertTree(TreeNode root) {
        if(root==null)return root;
        TreeNode left = invertTree(root.left);
        TreeNode right = invertTree(root.right);
        root.left=right;
        root.right=left;
        return root;
    }

    public TreeNode invertTree_V2(TreeNode root) {
        if(root==null)return root;
        LinkedList<TreeNode> nodes = new LinkedList<>();
        nodes.add(root);
        while (!nodes.isEmpty()){
            TreeNode cur = nodes.pop();
            if(cur.left!=null)nodes.add(cur.left);
            if(cur.right!=null)nodes.add(cur.right);
            TreeNode tmp = cur.left;
            cur.left=cur.right;
            cur.right=tmp;
        }
        return root;
    }
}

