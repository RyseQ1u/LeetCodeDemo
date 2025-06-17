package leet.methods.tree;

import leet._class.Tree.TreeNode;

public class Leet230 {

//    private ArrayList<Integer> arrayList = new ArrayList<>() ;
//
//    public int kthSmallest(TreeNode root, int k) {
//            return  inOrder(root,k);
//    }
//
//    // 中序遍历 左 中 右
//    int inOrder(TreeNode node,int k) {
//        if (node == null) return -1;
//        // 左子树
//        int left = inOrder(node.left,k);
//        // 访问根
//        arrayList.add(node.val);
//        if(arrayList.size()==k){
//            return node.val;
//        }
//        // 右子树
//        int right = inOrder(node.right,k);
//        return left==-1? right:left;
//    }

    int K, res;

    //优化数组
    public int kthSmallest(TreeNode root, int k) {
        //无效k判断
        if (K == 0) return res;
        K = k;
        inOrder(root);
        return res;
    }

    // 中序遍历 左 中 右
    void inOrder(TreeNode node) {
        //空判断
        if (node == null) return;
        // 左子树
        inOrder(node.left);
        // 访问根
        if (--K == 0)
            res = node.val;
        // 右子树
        inOrder(node.right);

    }
}
