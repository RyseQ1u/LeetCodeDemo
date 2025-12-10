package leet.methods._7_Tree.review.L103;

import leet._class.Tree.TreeNode;

import java.util.ArrayList;
import java.util.List;
import java.util.Stack;

/// 锯齿形 层序遍历
public class Leet103_r1 {
    public List<List<Integer>> zigzagLevelOrder(TreeNode root) {
        Stack<TreeNode> nodes = new Stack<>();
        List<List<Integer>> res = new ArrayList<>();
        if(root==null) return  res;
        nodes.add(root);
        boolean flag = true;
        while (!nodes.isEmpty()){
            Stack<TreeNode> tmp  = new Stack<>();
            ArrayList<Integer> list  = new ArrayList<>();
            while (!nodes.isEmpty()){
                TreeNode cur = nodes.pop();
                list.add(cur.val);
                if(flag){
                    if(cur.left!=null)
                        tmp.add(cur.left);
                    if(cur.right!=null)
                        tmp.add(cur.right);
                }else {
                    if(cur.right!=null)
                        tmp.add(cur.right);
                    if(cur.left!=null)
                        tmp.add(cur.left);
                }
            }
            res.add(list);
            nodes =tmp;
            flag = !flag;
        }
        return res;
    }
}
