using System;
using System.Collections.Generic;
using System.Linq;
using System.Text;

namespace LeetCode.Methods.Easy
{
    public class Leet3095
    {
        public int MinimumSubarrayLength(int[] nums, int k)
        {
            var res = int.MaxValue;
            for (int i = 0; i < nums.Length; i++)
            {
                var cur = 0;
                for (int j = i; j < nums.Length; j++)
                {
                    cur = (cur | nums[j]);
                    if (cur >= k)
                    {
                        res = Math.Min(res, j - i + 1);
                        break;
                    }
                }
            }

            return res == int.MaxValue ? -1 : res;
        }
    }
}