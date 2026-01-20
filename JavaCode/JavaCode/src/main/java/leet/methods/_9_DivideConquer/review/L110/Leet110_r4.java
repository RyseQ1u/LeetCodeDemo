package leet.methods._9_DivideConquer.review.L110;

import leet._class.Tree.TreeNode;

/**
 * 判断它是否是 平衡二叉树
 */
public class Leet110_r4 {
    public boolean isBalanced(TreeNode root) {
            return dfs(root)!=-1;
    }
    int dfs(TreeNode root){
       if(root==null) return 0;
       int l = dfs(root.left);
       if(l==-1)return -1;
       int r = dfs(root.right);
       if(r==-1)return -1;
       if(Math.abs(l-r)>1)return -1;
       return Math.max(l,r)+1;
    }
}
