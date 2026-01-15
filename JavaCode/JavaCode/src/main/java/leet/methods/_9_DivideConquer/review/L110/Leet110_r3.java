package leet.methods._9_DivideConquer.review.L110;

import leet._class.Tree.TreeNode;

public class Leet110_r3 {
    public boolean isBalanced(TreeNode root) {
        return dfs(root,0)!=-1;
    }

    private  int dfs(TreeNode root,int n){
        if(root==null)return n;
        int l = dfs(root.left,n+1);
        if(l==-1) return -1;
        int r = dfs(root.right,n+1);
        if(r==-1) return -1;
        if(Math.abs(l-r)>1)return -1;
        return Math.max(l,r);
    }
}
