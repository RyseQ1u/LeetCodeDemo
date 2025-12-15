package leet.methods._7_Tree.review.L230;

import leet._class.Tree.TreeNode;

import java.util.ArrayList;

/// 二叉搜索树中第 K 小的元素
public class Leet230_r1 {
    private final ArrayList<Integer> list = new ArrayList<>();
    public int kthSmallest(TreeNode root, int k) {
        return inOrder(root,k);
    }
    int inOrder(TreeNode node,int k){
        if(node==null) return -1;
        //左
        int left = inOrder(node.left,k);
        //中
        list.add(node.val);
        if(list.size()==k){
            return node.val;
        }
        //右
        int right = inOrder(node.right,k);
        return left==-1?right:left;
    }
}
