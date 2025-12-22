package leet.methods._7_Tree.review.L103;

import leet._class.Tree.TreeNode;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;

/// 锯齿形 层序遍历
public class Leet103_r4 {
    public List<List<Integer>> zigzagLevelOrder(TreeNode root) {
        List<List<Integer>> res = new ArrayList<>();
        if (root == null) return res;
        LinkedList<TreeNode> queue = new LinkedList<>();
        queue.add(root);
        while (!queue.isEmpty()) {
            LinkedList<TreeNode> tmp = new LinkedList<>();
            LinkedList<Integer> list = new LinkedList<>();
            while (!queue.isEmpty()) {
                TreeNode node = queue.poll();
                if (res.size() % 2 == 1) list.addFirst(node.val);
                else list.addLast(node.val);
                if (node.left != null) tmp.add(node.left);
                if (node.right != null) tmp.add(node.right);
            }
            queue = tmp;
            res.add(list);
        }
        return res;
    }
}
