package leet.methods.tree;

import leet._class.Tree.TreeNode;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;

public class Leet103 {

    public List<List<Integer>> levelOrder(TreeNode root) {
        List<List<Integer>> lists = new ArrayList<>();
        //空判断
        if(root==null) return lists;
        //队列
        LinkedList<TreeNode> nodes = new LinkedList<>();
        nodes.add(root);
        boolean f = true;
        while (!nodes.isEmpty()){
            int length = nodes.size();
            ArrayList<Integer> curList = new ArrayList<>(length);
            LinkedList<TreeNode> curNodes = new LinkedList<>();

            while (!nodes.isEmpty()){
                TreeNode curNode = nodes.poll();
                if(curNode==null) continue;
                if(f){
                    curList.add(curNode.val);
                }else {
                curList.add(0,curNode.val);
                }

                    if(curNode.left!=null)
                curNodes.add(curNode.left);
                    if(curNode.right!=null)
                curNodes.add(curNode.right);

            }
            nodes = curNodes;
            lists.add(curList);
        }
        return lists;
    }


}
