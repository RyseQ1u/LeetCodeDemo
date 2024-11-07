using LeetCode.Class;
using System.Linq;

namespace Leet.Methods
{
    /// <summary>
    ///
    /// </summary>
    public class Leet106
    {
        public TreeNode Action()
        {
            //var postorder = new int[] { 3, 9, 20, 15, 7 };
            //var inorder = new int[] { 9, 3, 15, 20, 7 };

            var inorder = new int[] { 9, 3, 15, 20, 7 };
            var postorder = new int[] { 9, 15, 7, 20, 3 };

            var r = BuildTree(inorder, postorder);
            return r;
        }

        public TreeNode BuildTree(int[] inorder, int[] postorder)
        {
            if (postorder.Length == 0) return null;
            var r = new TreeNode(postorder[postorder.Length - 1]);

            for (int i = 0; i < inorder.Length; i++)
            {
                if (inorder[i] == r.val)
                {
                    if (i > 0)
                    {
                        r.left = BuildTree(inorder.Take(i).ToArray(), postorder.Take(i).ToArray());
                    }
                    if (i < inorder.Length - 1)
                    {
                        r.right = BuildTree(inorder.Skip(i + 1).Take(inorder.Length - i - 1).ToArray(), postorder.Skip(i).Take(postorder.Length - i - 1).ToArray());
                    }
                    break;
                }
            }

            return r;
        }
    }
}