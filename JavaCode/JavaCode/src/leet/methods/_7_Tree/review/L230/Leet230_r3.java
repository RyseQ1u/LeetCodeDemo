package leet.methods._7_Tree.review.L230;

import leet._class.Tree.TreeNode;

import java.util.ArrayList;

/// 二叉搜索树中第 K 小的元素
public class Leet230_r3 {

    private final ArrayList<Integer> list = new ArrayList<>();
    public int kthSmallest(TreeNode root, int k) {
        //使用中序遍历 查找第k
        int left = kthSmallest(root.left,k);
        list.add(root.val);
        if(list.size() == k){
            return root.val;
        }
        int right = kthSmallest(root.right,k);
        return left == -1?right:left;
    }
}
