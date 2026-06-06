using System;
using System.Collections.Generic;

namespace LeetCode.Methods.Middle
{
    /// <summary>
    /// Leet2944
    /// </summary>
    public class Leet2944
    {
        public int MinimumCoins(int[] prices)
        {
            int n = prices.Length;
            int[] memo = new int[(n + 1) / 2];
            return Dfs(1, prices, memo);
        }

        private int Dfs(int i, int[] prices, int[] memo)
        {
            //表示可以直接买完
            if (i * 2 >= prices.Length)
            {
                // i 从 1 开始
                return prices[i - 1];
            }
            // 之前算过
            if (memo[i] != 0)
            {
                return memo[i];
            }
            int res = int.MaxValue;
            for (int j = i + 1; j <= i * 2 + 1; j++)
            {
                res = Math.Min(res, Dfs(j, prices, memo));
            }
            return memo[i] = res + prices[i - 1]; // 记忆化
        }
    }
}