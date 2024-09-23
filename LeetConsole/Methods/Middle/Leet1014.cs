using System;
using System.Collections.Generic;
using System.Linq;

namespace LeetCode.Methods.Middle
{
    /// <summary>
    /// 1014
    /// </summary>
    public class Leet1014
    {
        public int MaxScoreSightseeingPair(int[] values)
        {
            //= [i] + [j] + i- j
            var max = 0;
            //=[i] + [j]
            var maxI = 0;
            for (var i = 0; i < values.Length; i++)
            {
                max = Math.Max(max, maxI + values[i] - i);
                maxI = Math.Max(maxI, values[i] + i);
            }
            return max;
        }

        public int MaxScoreSightseeingPair3(int[] values)
        {
            var max = 0;
            var maxI = 0;
            for (var i = 0; i < values.Length; i++)
            {
                if (values[maxI] + maxI - i > values[i]) continue;
                for (var j = i + 1; j < values.Length; j++)
                {
                    var n = values[i] + values[j] + i - j;
                    if (max < n)
                    {
                        max = n;
                        maxI = i;
                    }
                }
            }
            return max;
        }

        /// <summary>
        /// 超时
        /// </summary>
        /// <param name="values"></param>
        /// <returns></returns>
        public int MaxScoreSightseeingPair2(int[] values)
        {
            var max = 0;
            for (var i = 0; i < values.Length; i++)
            {
                for (var j = i + 1; j < values.Length; j++)
                {
                    max = Math.Max(max, values[i] + values[j] + i - j);
                }
            }
            return max;
        }
    }
}