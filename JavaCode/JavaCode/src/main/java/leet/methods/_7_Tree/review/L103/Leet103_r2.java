package leet.methods._7_Tree.review.L103;
import leet._class.Tree.TreeNode;

import java.util.ArrayList;
import java.util.List;
import java.util.Stack;

/// 锯齿形 层序遍历
public class Leet103_r2 {
    public List<List<Integer>> zigzagLevelOrder(TreeNode root) {
        Stack<TreeNode> nodes = new Stack<>();
        List<List<Integer>> res = new ArrayList<>();
        if (root == null) return res;
        nodes.add(root);
        boolean flag = true;
        while (!nodes.isEmpty()){
            ArrayList<Integer> tmp = new ArrayList<>();
            Stack<TreeNode> tmpNodes = new Stack<>();
            while (!nodes.isEmpty()){
                TreeNode cur = nodes.pop();
                tmp.add(cur.val);
                if(flag){
                    if(cur.left!=null)
                    tmpNodes.add(cur.left);
                    if(cur.right!=null)
                    tmpNodes.add(cur.right);
                }else {
                    if(cur.right!=null)
                    tmpNodes.add(cur.right);
                    if(cur.left!=null)
                    tmpNodes.add(cur.left);
                }
            }
            flag=!flag;
            nodes=tmpNodes;
            res.add(tmp);
        }
        return res;
    }
}
