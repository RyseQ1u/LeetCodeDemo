using LeetCode.Class;
using System.Collections.Generic;

namespace Leet.Methods
{
    /// <summary>
    ///
    /// </summary>
    public class Leet899
    {
        public TreeNode Action()
        {
            //var postorder = new int[] { 3, 9, 20, 15, 7 };
            //var inorder = new int[] { 9, 3, 15, 20, 7 };

            var preorder = new int[] { 1, 2, 4, 5, 3, 6, 7 };
            var postorder = new int[] { 4, 5, 2, 6, 7, 3, 1 };

            var r = ConstructFromPrePost(preorder, postorder);
            return r;
        }

        public TreeNode ConstructFromPrePost(int[] preorder, int[] postorder)
        {
            int n = preorder.Length;
            IDictionary<int, int> postDictionary = new Dictionary<int, int>();
            for (int i = 0; i < n; i++)
            {
                postDictionary.Add(postorder[i], i);
            }
            return DFS(preorder, postorder, postDictionary, 0, n - 1, 0, n - 1);
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