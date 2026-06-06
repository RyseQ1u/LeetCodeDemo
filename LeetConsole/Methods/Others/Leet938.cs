using LeetCode.Class;

namespace Leet.Methods
{
    /// <summary>
    ///
    /// </summary>
    public class Leet938
    {
        public int Action()
        {
            //var postorder = new int[] { 3, 9, 20, 15, 7 };
            //var inorder = new int[] { 9, 3, 15, 20, 7 };

            //var r = KthLargestLevelSum(new TreeNode(5,
            //    new TreeNode(8,new TreeNode(2,new TreeNode(4),new TreeNode(6)),new TreeNode(1)),new TreeNode(9,new TreeNode(3),new TreeNode(7)))
            //    ,2);
            var r = RangeSumBST(new TreeNode(10, new TreeNode(5, new TreeNode(3), new TreeNode(7)), new TreeNode(15, null, new TreeNode(18))), 7, 15);
            return r;
        }

        public int RangeSumBST(TreeNode root, int low, int high)
        {
            var s = 0;
            if (root.val >= low && root.val <= high)
            {
                s += root.val;
            }
            if (root.left != null)
            {
                s += RangeSumBST(root.left, low, high);
            }
            if (root.right != null)
            {
                s += RangeSumBST(root.right, low, high);
            }
            return s;
        }
    }
}