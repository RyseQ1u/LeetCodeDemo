package leet.methods.DivideConquer;

import leet._class.Tree.TreeNode;

import java.util.LinkedList;

public class Leet101 {


    public boolean isSymmetric(TreeNode root) {
        if(root==null) return false;
//        迭代
//        return iteration(root.left,root.right);
        return Recursion(root.left,root.right);
    }


    /**
     * 递归
     */
    boolean Recursion(TreeNode left,TreeNode right){
        //都为空
        if(left == null && right == null) return true;
        //至少有一个不为空
        if(left == null || right == null)return false;
        //判断值及子节点是否相等
        return left.val == right.val && Recursion(left.left,right.right) && Recursion(left.right,right.left);
    }

    /**
     * iteration
     */
    boolean iteration(TreeNode left,TreeNode right){
        LinkedList<TreeNode> nodes = new LinkedList<>();
        nodes.add(left);
        nodes.add(right);
        while (!nodes.isEmpty()){
            //顺序出列获取左右节点
            TreeNode l = nodes.poll();
            TreeNode r = nodes.poll();
            //判断是否都为空
            if(l==null && r ==null) continue;
            //判断是否有一个空
            if(l==null || r==null) return false;
            //值比较
            if(l.val != r.val) return false;
            //对称添加子节点
            nodes.add(l.left);
            nodes.add(r.right);

            nodes.add(l.right);
            nodes.add(r.left);
        }
        return true;
    }
}
