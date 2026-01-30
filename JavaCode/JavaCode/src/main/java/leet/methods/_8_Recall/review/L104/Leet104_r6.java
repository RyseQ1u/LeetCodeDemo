package leet.methods._8_Recall.review.L104;


import leet._class.Tree.TreeNode;

import java.util.LinkedList;

public class Leet104_r6 {
    /// 递归实现
    public int maxDepth(TreeNode root) {
        if(root==null)return 0;
        int left = maxDepth(root.left)+1;
        int right = maxDepth(root.right)+1;
        return Math.max(left,right);
    }

    /// 迭代实现
    public int maxDepth_bfs(TreeNode root) {
        //层序遍历
        int res =0;
        LinkedList<TreeNode> nodes = new LinkedList<>();
        nodes.add(root);
        while (!nodes.isEmpty()){
            LinkedList<TreeNode> tmp = new LinkedList<>();
            while (!nodes.isEmpty()){
                TreeNode cur = tmp.poll();
                if(cur.left!=null) tmp.add(cur.left);
                if(cur.right!=null) tmp.add(cur.right);
            }
            res++;
            nodes=tmp;
        }
        return res;
    }
}
