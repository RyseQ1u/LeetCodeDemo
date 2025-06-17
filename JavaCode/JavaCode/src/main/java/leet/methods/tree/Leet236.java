package leet.methods.tree;

import leet._class.Tree.TreeNode;

public class Leet236 {

    public TreeNode lowestCommonAncestor(TreeNode root, TreeNode p, TreeNode q) {
        //判断是否为空
        if(root==null) return root;
        //判断是否找到了目标节点 向上返回
        if(root == p || root == q) return root;
        //递归左侧 若p,q在同侧则有返回值
        TreeNode left = lowestCommonAncestor(root.left,p,q);
        //递归右侧
        TreeNode rigth = lowestCommonAncestor(root.right,p,q);
        //表示目标都不在左侧
        if(left == null) return  rigth;
        //表示目标都不在右侧
        if(rigth == null) return  left;
        //表示目标在根节点两侧
        return root;
    }



}
