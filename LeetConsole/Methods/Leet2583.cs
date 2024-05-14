using LeetCode.Class;
using System.Collections.Generic;
using System.Linq;

namespace Leet.Methods
{
    /// <summary>
    ///
    /// </summary>
    public class Leet2583
    {
        public long Action()
        {
            //var postorder = new int[] { 3, 9, 20, 15, 7 };
            //var inorder = new int[] { 9, 3, 15, 20, 7 };

            var preorder = new int[] { 1, 2, 4, 5, 3, 6, 7 };
            var postorder = new int[] { 4, 5, 2, 6, 7, 3, 1 };

            //var r = KthLargestLevelSum(new TreeNode(5,
            //    new TreeNode(8,new TreeNode(2,new TreeNode(4),new TreeNode(6)),new TreeNode(1)),new TreeNode(9,new TreeNode(3),new TreeNode(7)))
            //    ,2);
            var r = KthLargestLevelSum(new TreeNode(1, new TreeNode(2, new TreeNode(3)), null), 1);
            return r;
        }

        public long KthLargestLevelSum(TreeNode root, int k)
        {
            var queue = new Queue<TreeNode>();
            queue.Enqueue(root);
            List<long> list = new List<long>();
            while (queue.Count > 0)
            {
                int levelSize = queue.Count;
                long levelSum = 0;
                for (int i = 0; i < levelSize; i++)
                {
                    var node = queue.Dequeue();
                    levelSum += node.val;
                    if (node.left != null) queue.Enqueue(node.left);
                    if (node.right != null) queue.Enqueue(node.right);
                }
                list.Add(levelSum);
            }
            var r = list.OrderByDescending(p => p).ToList();
            return k > r.Count ? -1 : r[k - 1];
        }

        public TreeNode DFS(int[] preorder, int[] postorder, IDictionary<int, int> postDictionary, int preLeft, int preRight, int postLeft, int postRight)
        {
            if (preLeft > preRight)
            {
                return null;
            }
            int leftCount = 0;
            if (preLeft < preRight)
            {
                leftCount = postDictionary[preorder[preLeft + 1]] - postLeft + 1;
            }
            return new TreeNode(preorder[preLeft],
                DFS(preorder, postorder, postDictionary, preLeft + 1, preLeft + leftCount, postLeft, postLeft + leftCount - 1),
                DFS(preorder, postorder, postDictionary, preLeft + leftCount + 1, preRight, postLeft + leftCount, postRight - 1));
        }
    }
}