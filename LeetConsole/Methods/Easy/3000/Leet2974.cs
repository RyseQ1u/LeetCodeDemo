using System;
using System.Collections.Generic;
using System.Linq;
using System.Security.Cryptography;

namespace LeetCode.Methods.Easy
{
    /// <summary>
    /// Leet2974
    /// </summary>
    public class Leet2974
    {
        public int[] Action()
        {
            //var input1 = new int[] { 1, 7, 3, 6, 5, 6 };
            var input1 = new int[] { 5, 4, 2, 3 };

            return NumberGame(input1);
        }

        public int[] NumberGame(int[] nums)
        {
            var r = new int[nums.Length];
            Array.Sort(nums);
            for (int i = 0; i < nums.Length - 1; i += 2)
            {
                r[i] = nums[i + 1];
                r[i + 1] = nums[i];
            }
            return r;
        }
    }
}