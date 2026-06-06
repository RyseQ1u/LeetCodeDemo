using System;

namespace LeetCode.Methods.Middle
{
    /// <summary>
    /// 2786
    /// </summary>
    public class Leet2786
    {
        public long Action()
        {
            //5
            var input = new int[] { 2, 3, 6, 1, 9, 2 };
            return MaxScore(input, 5);
        }

        #region 方法一

        public long MaxScore(int[] nums, int x)
        {
            long res = nums[0];
            long[] dp = { int.MinValue, int.MinValue };
            dp[nums[0] % 2] = nums[0];
            for (int i = 1; i < nums.Length; i++)
            {
                int parity = (int)(nums[i] % 2);
                long cur = Math.Max(dp[parity] + nums[i], dp[1 - parity] - x + nums[i]);
                res = Math.Max(res, cur);
                dp[parity] = Math.Max(dp[parity], cur);
            }
            return res;
        }

        #endregion 方法一
    }
}