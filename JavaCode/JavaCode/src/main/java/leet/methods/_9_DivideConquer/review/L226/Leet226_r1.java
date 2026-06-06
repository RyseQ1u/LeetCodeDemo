package leet.methods._9_DivideConquer.review.L226;
import leet._class.Tree.TreeNode;

import java.util.LinkedList;

public class Leet226_r1 {
    public TreeNode invertTree(TreeNode root) {
        if(root==null)return null;
        //层序遍历 交互节点
        LinkedList<TreeNode> nodes = new LinkedList<>();
        nodes.add(root);
        while (!nodes.isEmpty()){
            LinkedList<TreeNode> tmp = new LinkedList<>();
            while (!nodes.isEmpty()){
                TreeNode node = nodes.poll();
                TreeNode leftTmp = node.left;
                node.left=node.right;
                node.right=leftTmp;
                if(node.left!=null)tmp.add(node.left);
                if(node.right!=null)tmp.add(node.right);
            }
            nodes=tmp;
        }
        return root;
    }

    public TreeNode invertTree_dfs(TreeNode root) {
        if(root==null)return null;
        //中序遍历
        TreeNode tmp = root.left;
        root.left = invertTree_dfs(root.right);
        root.right = invertTree_dfs(tmp);
        return root;
    }
}
