using LeetCode.Class;

namespace ConsoleApp3.Methods
{
    /// <summary>
    /// 2331
    /// </summary>
    public class Leet2331
    {
        public bool Action()
        {
            int n = 3;
            //var r = new int[2][] { new int[]{ 0, 1 }, new int[]{ 1, 2 } };
            //var b = new int[0][];
            TreeNode tree = new TreeNode(2, new TreeNode(1), new TreeNode(3, new TreeNode(0), new TreeNode(1)));
            return Function1(tree);
        }

        public bool Function1(TreeNode root)
        {
            if (root.val == 0 || root.val == 1)
            {
                return root.val == 1;
            }
            else if (root.val == 2)
            {
                return Function1(root.left) | Function1(root.left);
            }
            else if (root.val == 3)
            {
                return Function1(root.left) & Function1(root.left);
            }
            return false;
        }
    }
}