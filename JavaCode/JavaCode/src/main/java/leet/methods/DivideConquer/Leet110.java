package leet.methods.DivideConquer;

import leet._class.Tree.TreeNode;

public class Leet110 {


    public boolean isBalanced(TreeNode root) {
        return getHeight(root)!=-1;
    }

    //计算树的高度
    int getHeight(TreeNode root){
        if(root==null) return 0;
        //计算左子树高度
        int leftH = getHeight(root.left);
        if(leftH==-1) return -1;
        int rightH = getHeight(root.right);
        if(rightH==-1 || Math.abs( leftH - rightH)>1)return -1;
        return Math.max(leftH,rightH) +1;
    }
}
