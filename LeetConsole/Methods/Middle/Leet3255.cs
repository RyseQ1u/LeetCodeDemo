using System;
using System.Collections.Generic;
using System.Linq;
using System.Text.RegularExpressions;

namespace LeetCode.Methods.Middle
{
    /// <summary>
    /// 3255 解法与 3254相同
    /// </summary>
    public class Leet3255
    {
        /// <summary>
        /// 统计个数
        /// </summary>
        /// <param name="nums"></param>
        /// <param name="k"></param>
        /// <returns></returns>
        public int[] ResultsArray(int[] nums, int k)
        {
            var res = new int[nums.Length - k + 1];
            Array.Fill(res, -1);
            //递增次数
            int cnt = 0;
            for (int i = 0; i < nums.Length; i++)
            {
                //是否递增
                if (cnt == 0 || nums[i] == nums[i - 1] + 1)
                {
                    cnt++;
                }
                else
                {
                    cnt = 1;
                }
                if (cnt >= k)
                {
                    res[i - k + 1] = nums[i];
                }
            }
            return res;
        }
    }
}