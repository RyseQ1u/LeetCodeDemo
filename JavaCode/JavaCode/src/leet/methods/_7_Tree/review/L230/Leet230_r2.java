package leet.methods._7_Tree.review.L230;

import leet._class.Tree.TreeNode;

/// 二叉搜索树中第 K 小的元素
public class Leet230_r2 {

    private int tmp = 1;
    public int kthSmallest(TreeNode root, int k) {
        //二叉搜索树 左边节点比根节点小 右节点比根节点大
        //使用中序遍历使用计数 然后获取第k个元素
        if(root==null)return -1;
        int left = kthSmallest(root.left,k);
        if(tmp++ == k){
            return root.val;
        }
        int right = kthSmallest(root.right,k);
        //左节点不存在的情况
        return left==-1?right:left;
    }
}
