using System;
using System.Collections.Generic;

namespace LeetCode.Methods.Easy
{
    /// <summary>
    /// 3152
    /// </summary>
    public class Leet3152
    {
        public bool[] Action()
        {
            ////false
            //var input1 = new int[] { 3, 4, 1, 2, 6 };
            //var input2 = new int[][] { new int[] { 0, 4 } };

            // false,true
            var input1 = new int[] { 4, 3, 1, 6 };
            var input2 = new int[][] { new int[] { 0, 2 }, new int[] { 2, 3 } };

            //true
            //var input1 = new int[] { 10, 2, 10, 9, 7 };
            //var input2 = new int[][] { new int[] { 2, 3 } };

            return IsArraySpecial2(input1, input2);
        }

        /// <summary>
        /// 判断范围内是否有连续相同奇偶的数
        /// </summary>
        /// <param name="nums"></param>
        /// <param name="queries"></param>
        /// <returns></returns>
        public bool[] IsArraySpecial(int[] nums, int[][] queries)
        {
            var res = new bool[queries.Length];
            Array.Fill(res, true);
            //遍历一次 记录奇偶相同的位置 两两一组
            var markIndexs = new List<int>();
            for (int i = 0; i < nums.Length - 1; i++)
            {
                if ((nums[i] & 1) == (nums[i + 1] & 1))
                {
                    markIndexs.Add(i);
                    markIndexs.Add(i + 1);
                }
            }

            for (int i = 0; i < queries.Length; i++)
            {
                var l = queries[i][0];
                var r = queries[i][1];
                //判断范围内是否有两个奇偶相同的数
                for (int j = 0; j < markIndexs.Count - 1; j += 2)
                {
                    //范围内有连续奇偶数

                    if (l <= markIndexs[j] && r >= markIndexs[j + 1])
                    {
                        res[i] = false;
                        break;
                    }
                }
            }

            return res;
        }

        /// <summary>
        /// 判断范围是否为特殊序列的子数组 动态规划
        /// </summary>
        /// <param name="nums"></param>
        /// <param name="queries"></param>
        /// <returns></returns>
        public bool[] IsArraySpecial2(int[] nums, int[][] queries)
        {
            int n = nums.Length;
            //记录特殊数组的长度
            int[] dp = new int[n];
            Array.Fill(dp, 1);
            for (int i = 1; i < n; i++)
            {
                if (((nums[i] ^ nums[i - 1]) & 1) != 0)
                {
                    dp[i] = dp[i - 1] + 1;
                }
            }

            bool[] res = new bool[queries.Length];
            for (int i = 0; i < queries.Length; i++)
            {
                int x = queries[i][0], y = queries[i][1];

                res[i] = dp[y] >= y - x + 1;
            }
            return res;
        }
    }
}