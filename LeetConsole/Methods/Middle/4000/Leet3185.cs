using System;
using System.Collections.Generic;
using System.Linq;
using System.Text.RegularExpressions;

namespace LeetCode.Methods.Middle
{
    /// <summary>
    /// 3185
    /// </summary>
    public class Leet3185
    {
        /// <summary>
        /// 正序遍历
        /// </summary>
        /// <param name="hours"></param>
        /// <returns></returns>
        public long CountCompleteDayPairs(int[] hours)
        {
            long res = 0;
            var n = hours.Length;
            var remains = new int[24];
            foreach (var hour in hours)
            {
                var remain = hour % 24;
                //再模24 排除24-0
                res += remains[(24 - remain) % 24];
                remains[remain]++;
            }
            return res;
        }

        /// <summary>
        /// 先取模 再倒序遍历
        /// </summary>
        /// <param name="hours"></param>
        /// <returns></returns>
        public long CountCompleteDayPairs2(int[] hours)
        {
            long res = 0;
            var n = hours.Length;
            //先统计余数
            var remains = new int[24];
            for (int i = 0; i < n; i++)
            {
                var remain = hours[i] % 24;
                remains[remain]++;
                hours[i] = remain;
            }
            for (int i = n - 1; i >= 0; i--)
            {
                var remain = hours[i];
                remains[remain]--;
                if (remain == 0)
                {
                    res += remains[remain];
                }
                else
                {
                    res += remains[24 - remain];
                }
            }

            return res;
        }
    }
}