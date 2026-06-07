package leet.methods._8_Recall.review.L104;


import leet._class.Tree.TreeNode;

import java.util.LinkedList;

public class Leet104_r4 {
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
        LinkedList<TreeNode> nodes = new LinkedList<>();
        nodes.add(root);
        while (!nodes.isEmpty()){
            LinkedList<TreeNode> tmp = new LinkedList<>();
            while (!nodes.isEmpty()){
                TreeNode cur = nodes.poll();
                if(cur.left!=null) tmp.add(cur.left);
                if(cur.right!=null) tmp.add(cur.right);
            }
            nodes=tmp;
            res++;
        }
        return res;
    }
}
