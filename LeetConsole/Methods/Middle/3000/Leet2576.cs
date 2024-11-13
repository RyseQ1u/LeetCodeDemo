using System;
using System.Collections.Generic;

namespace LeetCode.Methods.Middle
{
    /// <summary>
    /// Leet2576
    /// </summary>
    public class Leet2576
    {
        public int MaxNumOfMarkedIndices(int[] nums)
        {
            //先排序
            Array.Sort(nums);
            var n = nums.Length;
            var right = n - 1;
            var left = right / 2;
            var set = new HashSet<int>();
            for (; right >= left; right--)
            {
                if (set.Contains(right))
                {
                    right = left;
                    left--;
                }
                for (int j = left; left >= 0; left--)
                {
                    //找最大的
                    if (nums[left] * 2 <= nums[right])
                    {
                        if (set.Contains(left)) continue;
                        set.Add(right);
                        set.Add(left);
                        left--;
                        break;
                    }
                }
            }
            return set.Count;
        }
    }
}