package leet.methods.DivideConquer;

import leet._class.Tree.TreeNode;

import java.util.Stack;

public class Leet226 {

    /**
     * dfs
     */
    public TreeNode invertTree(TreeNode root) {
        //翻转左右节点
        if(root == null) return null;
        TreeNode tmp = root.right;
        TreeNode newLeft = invertTree(root.left);
        TreeNode newRight = invertTree(tmp);
        root.left = newLeft;
        root.right = newRight;
        return root;
    }

    /**
     * BFS
     */
    public TreeNode invertTree_bfs(TreeNode root) {
        //翻转左右节点
        if(root == null) return null;
        Stack<TreeNode> nodes = new Stack<>();
        nodes.add(root);
        while (!nodes.isEmpty()){
            TreeNode node = nodes.pop();
            if(node.left!=null) nodes.add(node.left);
            if(node.right!=null) nodes.add(node.right);
            //交换当前点的节点
            TreeNode tmp = node.left;
            node.left = node.right;
            node.right = tmp;
        }
        return root;
    }
}
