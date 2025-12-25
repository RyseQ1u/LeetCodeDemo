package leet.methods._8_Recall.review.L104;


import leet._class.Tree.TreeNode;

import java.util.LinkedList;

public class Leet104_r3 {
    public int maxDepth_dfs(TreeNode root) {
        if(root==null){
            return 0;
        }else {
            return Math.max(maxDepth_dfs(root.left),maxDepth_dfs(root.right))+1;
        }
    }

    public int maxDepth_bfs(TreeNode root) {
        int res = 0;
        if(root==null)return res;
        LinkedList<TreeNode> queue = new LinkedList<>();
        queue.add(root);
        while (!queue.isEmpty()){
            LinkedList<TreeNode> tmp = new LinkedList<>();
            while (!queue.isEmpty()){
                TreeNode cur = queue.pop();
                if(cur.right!=null)tmp.add(cur.right);
                if(cur.left!=null)tmp.add(cur.left);
            }
            res++;
            queue = tmp;
        }
        return res;
    }
}
