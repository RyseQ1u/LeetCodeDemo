package leet.methods._7_Tree.review.L235;

import leet._class.Tree.TreeNode;

public class Leet235_r1 {
    public TreeNode lowestCommonAncestor(TreeNode root, TreeNode p, TreeNode q) {
        while (root != null) {
            //判断是否都小于左节点
            if (root.val > p.val && root.val > q.val) {
                //证明最小父节点应该在左侧
                root = root.left;
            } else if (root.val < p.val && root.val < q.val) {
                root = root.right;
            } else {
                break;
            }
        }
        return root;
    }

    public TreeNode lowestCommonAncestor_V2(TreeNode root, TreeNode p, TreeNode q) {
        if (root.val > p.val && root.val > q.val) {
            //证明最小父节点应该在左侧
            return lowestCommonAncestor_V2(root.left,p,q);
        } else if (root.val < p.val && root.val < q.val) {
            return lowestCommonAncestor_V2(root.right,p,q);
        }
        return root;
    }

}
