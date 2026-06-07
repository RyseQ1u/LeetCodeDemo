package leet.methods._7_Tree.review.L230;

import leet._class.Tree.TreeNode;

import java.util.ArrayList;

/// 二叉搜索树中第 K 小的元素
public class Leet230_r6 {
    ArrayList<Integer> list = new ArrayList<Integer>();
    public int kthSmallest(TreeNode root, int k) {
        //中序遍历取第k位
        dfs(root);
        return list.get(k-1);
    }

    void dfs(TreeNode root){
        if(root==null)return;
        dfs(root.left);
        list.add(root.val);
        dfs(root.right);
    }


    int res;
    int count;
    public int kthSmallest_V2(TreeNode root, int k){
        dfs(root,k);
        return res;
    }
    void dfs(TreeNode root, int k){
        if(root==null|| count==k)return;
        dfs(root.left,k);
        count++;
        if(k==count){
            res= root.val;
            return;
        }
        dfs(root.right,k);
    }
}
