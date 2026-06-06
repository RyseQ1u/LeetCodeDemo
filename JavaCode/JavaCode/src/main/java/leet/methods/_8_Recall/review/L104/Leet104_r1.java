package leet.methods._8_Recall.review.L104;


import leet._class.Tree.TreeNode;

import java.util.LinkedList;

public class Leet104_r1 {
    public int maxDepth(TreeNode root) {
        //bfs
        int res = 0;
        if(root==null) return res;
        LinkedList<TreeNode> nodes = new LinkedList<>();
        nodes.add(root);
        while (!nodes.isEmpty()){
            LinkedList<TreeNode> tmp = new LinkedList<>();
            while (!nodes.isEmpty()){
                TreeNode node = nodes.poll();
                if(node.left!=null) tmp.add(node.left);
                if(node.right!=null)tmp.add(node.right);
            }
            nodes=tmp;
            res++;
        }

        return res;
    }

    int res = 0;
    public int maxDepth_dfs(TreeNode root) {
        if(root==null){
            return 0;
        }else {
            res = Math.max(maxDepth_dfs(root.left),maxDepth_dfs(root.right))+1;
        }
        return res;
    }
}
