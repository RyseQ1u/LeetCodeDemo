using System;
using System.Collections.Generic;
using System.Linq;
using System.Security.Cryptography;

namespace LeetCode.Methods.Easy
{
    /// <summary>
    /// 908
    /// </summary>
    public class Leet908
    {
        public int SmallestRangeI(int[] nums, int k)
        {
            //排序
            Array.Sort(nums);
            var n = nums.Length;
            int res = nums[n - 1] - nums[0];
            int k2 = 2 * k;
            if (res <= k2)
            {
                res = 0;
            }
            else
            {
                res -= k2;
            }
            return res;
        }

        public int SmallestRangeI2(int[] nums, int k)
        {
            int min = nums.Min();
            int max = nums.Max();
            return max - min <= 2 * k ? 0 : max - min - 2 * k;
        }
    }
}