package leet.methods._7_Tree.review.L236;
import leet._class.Tree.TreeNode;

/// 二叉树的最近公共祖先
public class Leet236_r1 {
    /// 前序遍历 中左右
    public TreeNode lowestCommonAncestor(TreeNode root, TreeNode p, TreeNode q) {
        if(root==null)return null;
        if(root == p || root == q) return root;
        TreeNode left = lowestCommonAncestor(root.left,p,q);
        TreeNode right = lowestCommonAncestor(root.right,p,q);
        if(left == null) return right;
        if(right == null)return left;
        //一左一又返回根节点
        return root;
    }
}
