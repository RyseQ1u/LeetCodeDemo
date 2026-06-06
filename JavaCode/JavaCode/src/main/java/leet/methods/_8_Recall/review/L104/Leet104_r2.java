package leet.methods._8_Recall.review.L104;


import leet._class.Tree.TreeNode;

import java.util.LinkedList;

public class Leet104_r2 {
    int res = 0;
    public int maxDepth_dfs(TreeNode root) {
        if(root==null){
            return 0;
        }else {
            res =  Math.max(maxDepth_dfs(root.left),maxDepth_dfs(root.right))+1;
        }
        return res;
    }

    public int maxDepth_bfs(TreeNode root) {
        LinkedList<TreeNode> list = new LinkedList<>();
        int res =0 ;
        if(root==null)return res;
        list.add(root);
        while (!list.isEmpty()){
            LinkedList<TreeNode> tmp = new LinkedList<>();
            while (!list.isEmpty()){
                TreeNode node = list.poll();
                if(node.left!=null) tmp.add(node.left);
                if(node.right!=null) tmp.add(node.right);
            }
            list=tmp;
            res++;
        }
        return res;
    }
}
