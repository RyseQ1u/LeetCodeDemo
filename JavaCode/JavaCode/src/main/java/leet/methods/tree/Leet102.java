package leet.methods.tree;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;
import java.util.Queue;
import leet._class.Tree.TreeNode;

public class Leet102 {

    public List<List<Integer>> levelOrder(TreeNode root) {
        List<List<Integer>> lists = new ArrayList<>();
        //空判断
        if(root==null) return lists;
        //使用队列实现层序遍历
        Queue<TreeNode> nodes = new LinkedList<>();
        nodes.add(root);
        while (!nodes.isEmpty()){
            //记录子节点
            Queue<TreeNode> subNodes = new LinkedList<>();
            ArrayList<Integer> list = new ArrayList<>();
            while (!nodes.isEmpty()){
                TreeNode curNode = nodes.poll();
                list.add(curNode.val);
                if(curNode.left!=null)
                    subNodes.add(curNode.left);
                if(curNode.right!=null)
                    subNodes.add(curNode.right);
            }
            nodes = subNodes;
            lists.add(list);
        }
        return lists;
    }


}
