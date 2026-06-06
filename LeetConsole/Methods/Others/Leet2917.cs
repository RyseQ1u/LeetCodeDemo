namespace Leet.Methods
{
    /// <summary>
    ///
    /// </summary>
    public class Leet2917
    {
        public int Action()
        {
            //var postorder = new int[] { 3, 9, 20, 15, 7 };
            //var inorder = new int[] { 9, 3, 15, 20, 7 };

            //var r = KthLargestLevelSum(new TreeNode(5,
            //    new TreeNode(8,new TreeNode(2,new TreeNode(4),new TreeNode(6)),new TreeNode(1)),new TreeNode(9,new TreeNode(3),new TreeNode(7)))
            //    ,2);
            //var r = ValidPartition(new int[] { 4, 4, 4, 5, 6 });
            //MyQueue myQueue = new MyQueue();
            //var r = FindKOr(new int[] { 7, 12, 9, 8, 9, 15 }, 4);
            var r = FindKOr(new int[] { 24, 18, 3, 23, 16, 11, 27, 18, 5, 29 }, 6);
            return r;
        }

        public int FindKOr(int[] nums, int k)
        {
            var r = 0;
            var m = 0;
            for (int j = 0; j < 31; ++j)
            {
                var c = 0;
                for (int i = 0; i < nums.Length; i++)
                {
                    if (((nums[i] >> m) & 1) == 1)
                    {
                        c++;
                    }
                }
                if (c == 0) break;
                if (c >= k)
                {
                    if (m == 0)
                    {
                        r += 1;
                    }
                    else
                    {
                        r += 2 << m - 1;
                    }
                }
                m++;
            }
            return r;
        }
    }
}