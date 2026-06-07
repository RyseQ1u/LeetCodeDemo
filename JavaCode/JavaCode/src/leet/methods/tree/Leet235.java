package leet.methods.tree;

import leet._class.Tree.TreeNode;

public class Leet235 {

    /**
     * 二叉搜索树 迭代
     */
    public TreeNode lowestCommonAncestor(TreeNode root, TreeNode p, TreeNode q) {
        while (root != null) {
            //p,q在左侧的情况
            if (root.val > p.val && root.val > q.val) {
                //公共父节点在左侧树中
                root = root.left;
            }
            //p,q都在右侧的情况
            else if (root.val < p.val && root.val < q.val) {
                //公共父节点在右侧树中
                root = root.right;
            } else {
                //否则,root节点就是最小父节点
                break;
            }
        }
        return root;
    }

    /**
     * 优化判断逻辑
     */
    public TreeNode lowestCommonAncestor_V2(TreeNode root, TreeNode p, TreeNode q) {
        // 保证 p.val < q.val 即可省略一步大小判断
        if (p.val > q.val) {
            TreeNode tmp = p;
            p = q;
            q = tmp;
        }

        while (root != null) {
            //p,q在左侧的情况
            if (root.val > q.val) {
                //公共父节点在左侧树中
                root = root.left;
            }
            //p,q都在右侧的情况
            else if (root.val < p.val) {
                //公共父节点在右侧树中
                root = root.right;
            } else {
                //否则,root节点就是最小父节点
                break;
            }
        }
        return root;
    }


    /**
     * 搜索二叉树 递归
     */
    public TreeNode lowestCommonAncestor_V3(TreeNode root, TreeNode p, TreeNode q) {
        if(root == null) return null;
        if(root.val>p.val && root.val>q.val){
            //p,q都在左侧,递归左节点
            return lowestCommonAncestor_V3(root.left,p,q);
        }
        if(root.val<p.val && root.val<q.val){
            //p,q都在右侧,递归右节点
            return lowestCommonAncestor_V3(root.right,p,q);
        }
        //否则返回根节点
        return root;
    }

    /**
     * 通用二叉树 递归
     */
    public TreeNode lowestCommonAncestor_V4(TreeNode root, TreeNode p, TreeNode q) {
        if(root == null) return null;
        //判断是否找到目标节点
        if(root == q || root == p) return root;
        //递归左节点
        TreeNode left = lowestCommonAncestor_V4(root.left,p,q);
        //递归右节点
        TreeNode right =lowestCommonAncestor_V4(root.right,p,q);
        //p,q都不在左侧
        if(left == null) return right;
        //p,q都不在右侧
        if(right == null) return left;
        //p,q分别在左右两边
        return root;
    }
}
