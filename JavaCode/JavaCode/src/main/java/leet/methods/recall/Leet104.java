package leet.methods.recall;

import leet._class.Tree.TreeNode;

import java.util.LinkedList;

public class Leet104 {

    /**
     * DFS
     */
    public int maxDepth(TreeNode root) {
        return dfs_maxDepth(root, 0);
    }


    public void dfs(TreeNode root) {
        if (root == null) return;
        System.out.println(root.val);
        dfs(root.left);
        dfs(root.right);
    }

    public void dfs_depth(TreeNode root, int depth) {
        if (root == null) return;
        System.out.printf("root:%s depth:%d%n", root.val, ++depth);
        dfs_depth(root.left, depth);
        dfs_depth(root.right, depth);
    }

    public int dfs_maxDepth(TreeNode root, int depth) {
        if (root == null) return depth;
        int left = dfs_maxDepth(root.left, depth);
        int right = dfs_maxDepth(root.right, depth);
        return Math.max(left, right)+1;
    }

    public int bfs_maxDepth(TreeNode root){
        if(root == null)return 0;
        int res = 0;
        LinkedList<TreeNode> nodes = new LinkedList<>();
        nodes.add(root);
        while (!nodes.isEmpty()){
            LinkedList<TreeNode> tmp = new LinkedList<>();
            for (TreeNode node : nodes) {
                if(node.left!=null)tmp.add(node.left);
                if(node.right!=null)tmp.add(node.right);
            }
            nodes =tmp;
            res++;
        }
        return res;
    }

}
