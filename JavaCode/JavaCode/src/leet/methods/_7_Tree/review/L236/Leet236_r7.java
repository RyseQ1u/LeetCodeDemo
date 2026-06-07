package leet.methods._7_Tree.review.L236;
import leet._class.Tree.TreeNode;

/// 二叉树的最近公共祖先
public class Leet236_r7 {
    private  TreeNode p;
    private  TreeNode q;
    public TreeNode lowestCommonAncestor(TreeNode root, TreeNode p, TreeNode q) {
        this.p=p;
        this.q=q;
        return dfs(root);
    }

    TreeNode dfs(TreeNode root){
        if(root==null)return null;
        if(root==p||root==q)return root;
        TreeNode left = dfs(root.left);
        TreeNode right = dfs(root.right);
        if(left==null)return right;
        if(right == null)return left;
        return root;
    }
}
