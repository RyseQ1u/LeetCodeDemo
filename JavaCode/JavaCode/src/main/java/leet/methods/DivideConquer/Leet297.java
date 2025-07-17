package leet.methods.DivideConquer;

import leet._class.Tree.TreeNode;

import java.util.LinkedList;
import java.util.Queue;

/**
 * 二叉树的序列化和反序列化
 */
public class Leet297 {

    public void test1() {
        Codec codec = new Codec();
        String s = codec.serialize(new TreeNode(1, new TreeNode(2), new TreeNode(3, new TreeNode(4), new TreeNode(5))));
        System.out.println(s);
        TreeNode root = codec.deserialize(s);
    }
}

/**
 * 层序遍历
 */
class Codec {

    // Encodes a tree to a single string.
    public String serialize(TreeNode root) {
        if (root == null) return "";
        StringBuilder sb = new StringBuilder();
        Queue<TreeNode> nodes = new LinkedList<>();
        nodes.add(root);
        while (!nodes.isEmpty()) {
            TreeNode node = nodes.poll();
            if (node == null) {
                sb.append("#,");
            } else {
                sb.append(node.val).append(",");
                nodes.add(node.left);
                nodes.add(node.right);
            }
        }
        return sb.toString();
    }

    // Decodes your encoded data to tree.
    public TreeNode deserialize(String data) {
        if( data.isEmpty())
        return null;
        String[] split = data.split(",");
        TreeNode root = new TreeNode(Integer.parseInt(split[0]));
        LinkedList<TreeNode> nodes = new LinkedList<>();
        nodes.add(root);
        int i =1;
        while (!nodes.isEmpty()){
            TreeNode node = nodes.poll();
            //处理左节点
            if(!split[i].equals("#")){
                node.left = new TreeNode(Integer.parseInt(split[i]));
                nodes.add(node.left);
            }
            i++;
            //处理右节点
            if(!split[i].equals("#")){
                node.right = new TreeNode(Integer.parseInt(split[i]));
                nodes.add(node.right);
            }
            i++;
        }
        return root;
    }
}