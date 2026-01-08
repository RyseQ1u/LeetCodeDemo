package leet.methods._9_DivideConquer.review.L101;
import leet._class.Tree.TreeNode;

import java.util.LinkedList;

/// 给你一个二叉树的根节点 root ， 检查它是否轴对称。
public class Leet101_r1 {

    /// 递归解
    public boolean isSymmetric(TreeNode root) {
        if(root==null)return true;
        TreeNode tmp = root;
        return dfs(root,tmp);
    }

    private boolean dfs(TreeNode root1,TreeNode root2){
        //两个都为空
        if(root1==null && root2==null)return true;
        //其中一个为空
        if(root1==null || root2 ==null)return false;
        //两个不为空且值不相等
        if(root1.val!=root2.val)return false;
        return dfs(root1.left,root2.right) && dfs(root1.right,root2.left);
    }

    /// 迭代解
    public boolean isSymmetric_V2(TreeNode root) {
        if(root==null) return true;
        //记录左节点
        LinkedList<TreeNode> nodes = new LinkedList<>();
        //记录右节点
        nodes.add(root.left);
        nodes.add(root.right);
        while (!nodes.isEmpty()){
            TreeNode left =nodes.poll();
            TreeNode right =nodes.poll();
            if(left == null &&  right==null)continue;
            if(left==null || right ==null)return false;
            if(left.val!=right.val)return false;
            nodes.add(left.left);
            nodes.add(right.right);
            nodes.add(left.right);
            nodes.add(right.left);
        }
        return true;
    }
}
