package leet.methods._7_Tree.review.L103;

import leet._class.Tree.TreeNode;

import java.util.ArrayList;
import java.util.Collections;
import java.util.LinkedList;
import java.util.List;

/// 锯齿形 层序遍历
public class Leet103_r6 {
    public List<List<Integer>> zigzagLevelOrder(TreeNode root) {
        List<List<Integer>> res = new ArrayList<>();
        if (root == null) return res;
        LinkedList<TreeNode> nodes = new LinkedList<>();
        nodes.add(root);
        while (!nodes.isEmpty()) {
            LinkedList<TreeNode> tmp = new LinkedList<>();
            ArrayList<Integer> curRes = new ArrayList<>();
            while (!nodes.isEmpty()) {
                TreeNode cur = nodes.poll();
                curRes.add(cur.val);
                if (cur.left != null) {
                    tmp.add(cur.left);
                }
                if (cur.right != null) {
                    tmp.add(cur.right);
                }
            }
            if ((res.size() & 1) == 1) Collections.reverse(curRes);
            res.add(curRes);
            nodes = tmp;
        }
        return res;
    }
}
