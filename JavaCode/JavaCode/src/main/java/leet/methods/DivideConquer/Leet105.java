package leet.methods.DivideConquer;

import leet._class.Tree.TreeNode;

import java.util.HashMap;
import java.util.Map;

public class Leet105 {

    public TreeNode buildTree(int[] preorder, int[] inorder) {
        int n = preorder.length;
        Map<Integer, Integer> index = new HashMap<>(n); // 预分配空间
        for (int i = 0; i < n; i++) {
            index.put(inorder[i], i);
        }
        return dfs(preorder, 0, n, 0, n, index); // 左闭右开区间
    }

    private TreeNode dfs(int[] preorder, int preL, int preR, int inL, int inR, Map<Integer, Integer> index) {
        if (preL == preR) { // 空节点
            return null;
        }
        int leftSize = index.get(preorder[preL]) - inL; // 左子树的大小
        TreeNode left = dfs(preorder, preL + 1, preL + 1 + leftSize, inL, inL + leftSize, index);
        TreeNode right = dfs(preorder, preL + 1 + leftSize, preR, inL + 1 + leftSize, inR, index);
        return new TreeNode(preorder[preL], left, right);
    }
}
