namespace Leet.Methods
{
    /// <summary>
    ///
    /// </summary>
    public class Leet2369
    {
        public bool Action()
        {
            //var postorder = new int[] { 3, 9, 20, 15, 7 };
            //var inorder = new int[] { 9, 3, 15, 20, 7 };

            //var r = KthLargestLevelSum(new TreeNode(5,
            //    new TreeNode(8,new TreeNode(2,new TreeNode(4),new TreeNode(6)),new TreeNode(1)),new TreeNode(9,new TreeNode(3),new TreeNode(7)))
            //    ,2);
            var r = ValidPartition(new int[] { 4, 4, 4, 5, 6 });
            return r;
        }

        public bool ValidPartition(int[] nums)
        {
            int n = nums.Length;
            bool[] dp = new bool[n + 1];
            dp[0] = true;
            for (int i = 1; i <= n; i++)
            {
                if (i >= 2)
                {
                    dp[i] = dp[i - 2] && validTwo(nums[i - 2], nums[i - 1]);
                }
                if (i >= 3)
                {
                    dp[i] = dp[i] || (dp[i - 3] && validThree(nums[i - 3], nums[i - 2], nums[i - 1]));
                }
            }
            return dp[n];
        }

        public bool validTwo(int num1, int num2)
        {
            return num1 == num2;
        }

        public bool validThree(int num1, int num2, int num3)
        {
            return (num1 == num2 && num1 == num3) || (num1 + 1 == num2 && num2 + 1 == num3);
        }
    }
}