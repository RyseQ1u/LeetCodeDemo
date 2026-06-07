package leet.methods._7_Tree.review.L230;

import leet._class.Tree.TreeNode;

/// 二叉搜索树中第 K 小的元素
public class Leet230_r4 {
    int res,k;
    //中序遍历取第k个元素
    void dfs(TreeNode root){
        if(root==null) return;
        dfs(root.left);
        if(k==0)return;
        if(--k==0)res=root.val;
        dfs(root.right);
    }

    public int kthSmallest(TreeNode root, int k) {
        this.k=k;
        dfs(root);
        return res;
    }
}
