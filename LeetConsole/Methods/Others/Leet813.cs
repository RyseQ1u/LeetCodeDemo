using System;

namespace ConsoleApp3.Methods
{
    /// <summary>
    /// 813
    /// </summary>
    public class Leet813
    {
        public double Action()
        {
            //string s = "zzzzzyyyyy";
            //var words = new string[] { "zzyy", "zy", "zyy" };
            int k = 3;
            var nums = new int[] { 9, 1, 2, 3, 9 };
            return Function1(nums, k);
        }

        public double Function1(int[] nums, int k)
        {
            int n = nums.Length;
            double[] prefix = new double[n + 1];
            //求前缀和
            for (int i = 0; i < n; i++)
            {
                prefix[i + 1] = prefix[i] + nums[i];
            }
            double[][] dp = new double[n + 1][];
            for (int i = 0; i <= n; i++)
            {
                dp[i] = new double[k + 1];
            }

            for (int i = 1; i <= n; i++)
            {
                dp[i][1] = prefix[i] / i;
            }
            for (int j = 2; j <= k; j++)
            {
                for (int i = j; i <= n; i++)
                {
                    for (int x = j - 1; x < i; x++)
                    {
                        dp[i][j] = Math.Max(dp[i][j], dp[x][j - 1] + (prefix[i] - prefix[x]) / (i - x));
                    }
                }
            }
            return dp[n][k];
        }

        public int[] Function2(int[] nums)
        {
            int[] prefixArr = new int[nums.Length];
            prefixArr[0] = nums[0];
            for (int i = 1; i < nums.Length; i++)
            {
                prefixArr[i] = prefixArr[i - 1] + nums[i];
            }
            return prefixArr;
        }
    }
}