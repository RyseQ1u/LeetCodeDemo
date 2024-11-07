using System;
using System.Collections.Generic;
using System.Linq;
using System.Text.RegularExpressions;

namespace LeetCode.Methods.Middle
{
    /// <summary>
    /// 910
    /// </summary>
    public class Leet910
    {
        public int SmallestRangeII(int[] nums, int k)
        {
            //排序
            Array.Sort(nums);
            var n = nums.Length;
            var result = nums[nums.Length - 1] - nums[0];
            for (int i = 1; i < n; i++)
            {
                //找当前最小的最大值
                var mx = Math.Max(nums[i - 1] + k, nums[n - 1] - k);
                //找当前最大的最小值
                var mn = Math.Min(nums[0] + k, nums[i] - k);
                result = Math.Min(result, mx - mn);
            }
            return result;
        }
    }
}