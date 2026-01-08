package leet.methods._9_DivideConquer.review.L226;
import leet._class.Tree.TreeNode;

import java.util.LinkedList;

public class Leet226_r2 {
    public TreeNode invertTree(TreeNode root) {
        //中序遍历交换节点 递归
        if(root==null)return root;
        TreeNode tmp = root.left;
        root.left = invertTree(root.right);
        root.right = invertTree(tmp);
        return root;
    }

    public TreeNode invertTree_V2(TreeNode root) {
        //层序遍历交换节点
        if(root==null)return root;
        LinkedList<TreeNode> nodes = new LinkedList<>();
        nodes.add(root);
        while (!nodes.isEmpty()){
            LinkedList<TreeNode> tmp = new LinkedList<>();
            while (!nodes.isEmpty()){
                TreeNode cur =nodes.poll();
                if(cur.left!=null)nodes.add(cur.left);
                if(cur.right!=null)nodes.add(cur.right);
                TreeNode curTmp = cur.left;
                cur.left=cur.right;
                cur.right=curTmp;
            }
        }
        return root;
    }
}
