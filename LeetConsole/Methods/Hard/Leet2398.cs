using System;
using System.Collections.Generic;
using System.Linq;

namespace LeetCode.Methods.Hard
{
    /// <summary>
    /// Leet2398
    /// </summary>
    public class Leet2398
    {
        /// <summary>
        /// 时间复杂度 n2 待优化
        /// </summary>
        /// <param name="chargeTimes"></param>
        /// <param name="runningCosts"></param>
        /// <param name="budget"></param>
        /// <returns></returns>
        public int MaximumRobots(int[] chargeTimes, int[] runningCosts, long budget)
        {
            var result = 0;
            //前缀和数组
            var sumArr = new long[runningCosts.Length + 1];
            for (var i = 0; i < chargeTimes.Length; i++)
            {
                sumArr[i + 1] = sumArr[i] + runningCosts[i];
            }
            var l = 0;
            var r = 0;
            while (r <= chargeTimes.Length)
            {
                //获取范围内的最大值
                int max = chargeTimes[l];
                for (int i = l; i <= r; i++)
                {
                    if (chargeTimes[i] > max)
                    {
                        max = chargeTimes[i];
                    }
                }
                //获取范围内的和
                var sum = sumArr[r + 1] - sumArr[l];
                var n = r - l + 1;
                if (Check(max, sum, n, budget))
                {
                    result = Math.Max(result, n);
                    r++;
                }
                else
                {
                    l++;

                    r++;
                }
            }

            return result;
        }

        private bool Check(int max, long sum, int n, long budget)
        {
            return (long)((long)max + (long)sum * n) < budget;
        }
    }
}