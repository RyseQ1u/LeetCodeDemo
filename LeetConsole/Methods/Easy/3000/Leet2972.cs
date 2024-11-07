using System;
using System.Collections.Generic;
using System.Linq;
using System.Security.Cryptography;

namespace LeetCode.Methods.Easy
{
    /// <summary>
    /// Leet2972
    /// </summary>
    public class Leet2972
    {
        public int Action()
        {
            //var input1 = new int[] { 1, 7, 3, 6, 5, 6 };
            var input1 = new int[] { 1, 2, 3, 4 };

            return IncremovableSubarrayCount(input1);
        }

        public int IncremovableSubarrayCount(int[] nums)
        {
            int n = nums.Length;
            int res = 0;
            int l = 1;
            while (l < n && nums[l - 1] < nums[l])
            {
                l++;
            }
            res += l + (l < n ? 1 : 0);
            for (int r = n - 2; r >= 0; r--)
            {
                while (l > 0 && nums[l - 1] >= nums[r + 1])
                {
                    l--;
                }
                res += l + (l <= r ? 1 : 0);
                if (nums[r] >= nums[r + 1])
                {
                    break;
                }
            }
            return res;
        }
    }
}