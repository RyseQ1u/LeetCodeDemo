package leet.methods._8_Recall.review.L104;


import leet._class.Tree.TreeNode;

import java.util.LinkedList;

public class Leet104_r7 {
    /// 递归实现
    public int maxDepth(TreeNode root) {
        if(root==null)return 0;
        return 1 + Math.max(maxDepth(root.left),maxDepth(root.right));
    }

    /// 迭代实现
    public int maxDepth_bfs(TreeNode root) {
        int res=0;
        if(root==null)return res;
        LinkedList<TreeNode> nodes = new LinkedList<>();
        nodes.add(root);
        while (!nodes.isEmpty()){
            LinkedList<TreeNode> tmp = new LinkedList<>();
            while (!nodes.isEmpty()){
            TreeNode cur = nodes.pop();
                if(cur.left!=null)tmp.add(cur.left);
                if(cur.right!=null)tmp.add(cur.right);
            }
            res++;
            nodes=tmp;
        }
        return res;
    }
}
