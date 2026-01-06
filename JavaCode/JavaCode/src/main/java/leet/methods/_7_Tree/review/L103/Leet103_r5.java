package leet.methods._7_Tree.review.L103;
import leet._class.Tree.TreeNode;

import java.util.*;

/// 锯齿形 层序遍历
public class Leet103_r5 {
    public List<List<Integer>> zigzagLevelOrder(TreeNode root) {
        List<List<Integer>> res = new ArrayList<>();
        if(root==null)return res;
        Queue<TreeNode> queue = new LinkedList<>();
        queue.add(root);
        while (!queue.isEmpty()){
            ArrayList<Integer> list = new ArrayList<>();
            LinkedList<TreeNode> tmp = new LinkedList<>();
            while (!queue.isEmpty()){
                TreeNode cur = queue.poll();
                list.add(cur.val);
                if(cur.left!=null)tmp.add(cur.left);
                if(cur.right!=null)tmp.add(cur.right);
            }
            if((res.size()&1)==0) Collections.reverse(list);
            res.add(list);
            queue=tmp;
        }
        return res;
    }
}
