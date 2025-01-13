using System;
using System.Numerics;
using System.Text.RegularExpressions;

namespace LeetCode.Methods.Middle
{
    /// <summary>
    /// 2270
    /// </summary>
    public class Leet2270
    {
        public int WaysToSplitArray_V2(int[] nums)
        {
            long total = 0;
            foreach (int x in nums)
            {
                {
                    total += x;
                }
            }

            int ans = 0;
            //s=nums[0]+nums[1]+⋯+nums[i]
            // s 左边部分
            //要求统计 s > total-s
            long s = 0;
            for (int i = 0; i < nums.Length - 1; i++)
            {
                s += nums[i];
                if (s * 2 >= total)
                {
                    ans++;
                }
            }
            return ans;
        }

        #region 想复杂了。。。

        public int WaysToSplitArray(int[] nums)
        {
            int res = 0;
            //统计前缀和
            var preSum = new int[nums.Length + 1];
            for (int i = 0; i < nums.Length; i++)
            {
                preSum[i + 1] = preSum[i] + nums[i];
            }
            var n = preSum.Length - 1;
            for (int i = 0; i < preSum.Length - 1; i++)
            {
                if (preSum[i] > GetRangeSum(preSum, i + 1, n)) res++;
            }
            return res;
        }

        /// <summary>
        /// 获取前缀和区间的和
        /// </summary>
        /// <param name="prefixSum"></param>
        /// <param name="start"></param>
        /// <param name="end"></param>
        /// <returns></returns>
        public long GetRangeSum(int[] preSum, int start, int end)
        {
            if (start == 0)
            {
                return preSum[end];
            }
            else
            {
                return preSum[end] - preSum[start - 1];
            }
        }

        #endregion 想复杂了。。。
    }
}