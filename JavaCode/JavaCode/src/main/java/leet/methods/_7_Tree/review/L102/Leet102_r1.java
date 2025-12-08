package leet.methods._7_Tree.review.L102;

import leet._class.Tree.TreeNode;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;
import java.util.Queue;

public class Leet102_r1 {
    public List<List<Integer>> levelOrder(TreeNode root) {
        Queue<TreeNode> nodes = new LinkedList<>();
        List<List<Integer>> res = new ArrayList<>();
        if(root==null) return res;
        nodes.add(root);
        while (!nodes.isEmpty()){
            LinkedList<TreeNode> tmp = new LinkedList<>();
            ArrayList<Integer> list = new ArrayList<>();
            while (!nodes.isEmpty()){
                TreeNode node = nodes.poll();
                if(node == null) continue;
                if(node.left!=null)  tmp.add(node.left);
                if(node.right!=null) tmp.add(node.right);
                list.add(node.val);
            }
            nodes = tmp;
            res.add(list);
        }
        return res;
    }
}
