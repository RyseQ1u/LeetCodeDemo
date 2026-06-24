package leet.methods._8_Recall.review.L104;


import leet._class.Tree.TreeNode;

import java.util.ArrayList;
import java.util.LinkedList;

public class Leet104_Template {
    /// 递归实现
    public int maxDepth(TreeNode root) {
        if(root==null)return 0;
        return Math.max(maxDepth(root.left),maxDepth(root.right))+1;
    }

    /// 迭代实现
    public int maxDepth_bfs(TreeNode root) {
        if(root==null)return 0;
        int res = 0;
        LinkedList<TreeNode> nodes = new LinkedList<>();
        nodes.add(root);
        while (!nodes.isEmpty()){
            LinkedList<TreeNode> curs = new LinkedList<>();
            while (!nodes.isEmpty()){
                TreeNode cur = nodes.pop();
                if(cur.left!=null)curs.add(cur.left);
                if(cur.right!=null)curs.add(cur.right);
            }
            nodes=curs;
            res++;
        }
        return res;
    }
}
