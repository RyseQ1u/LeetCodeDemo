using LeetCode.Class;
using System.Linq;

namespace Leet.Methods
{
    /// <summary>
    ///
    /// </summary>
    public class Leet105
    {
        public TreeNode Action()
        {
            //var preorder = new int[] { 3, 9, 20, 15, 7 };
            //var inorder = new int[] { 9, 3, 15, 20, 7 };

            var preorder = new int[] { 1, 2, 3 };
            var inorder = new int[] { 3, 2, 1 };

            var r = BuildTree(preorder, inorder);
            return r;
        }

        public TreeNode BuildTree(int[] preorder, int[] inorder)
        {
            if (preorder.Length == 0) return null;
            var r = new TreeNode(preorder[0]);

            for (int i = 0; i < inorder.Length; i++)
            {
                if (inorder[i] == r.val)
                {
                    if (i > 0)
                    {
                        r.left = BuildTree(preorder.Skip(1).Take(i).ToArray(), inorder.Take(i).ToArray());
                    }
                    if (i < inorder.Length - 1)
                    {
                        r.right = BuildTree(preorder.Skip(i + 1).Take(preorder.Length - i - 1).ToArray(), inorder.Skip(i + 1).Take(preorder.Length - i - 1).ToArray());
                    }
                    break;
                }
            }

            return r;
        }

        public TreeNode BuildTree(int[] preorder, int[] inorder, int ls, int ll, int rs, int rl)
        {
            if (preorder.Length == 0) return null;
            var result = new TreeNode(preorder[0]);

            for (int i = 0; i < inorder.Length; i++)
            {
                if (inorder[i] == result.val)
                {
                    if (i > 0)
                    {
                        result.left = BuildTree(preorder.Skip(1).Take(i).ToArray(), inorder.Take(i).ToArray());
                    }
                    if (i < inorder.Length - 1)
                    {
                        result.right = BuildTree(preorder.Skip(i + 1).Take(preorder.Length - i - 1).ToArray(), inorder.Skip(i + 1).Take(preorder.Length - i - 1).ToArray());
                    }
                    break;
                }
            }

            return result;
        }
    }
}