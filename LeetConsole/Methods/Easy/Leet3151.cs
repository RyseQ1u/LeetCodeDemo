﻿using System;
using System.Collections.Generic;
using System.Linq;
using System.Security.Cryptography;

namespace LeetCode.Methods.Easy
{
    /// <summary>
    /// 3151
    /// </summary>
    public class Leet3151
    {
        public bool Action()
        {
            //var input1 = new int[] { 1, 7, 3, 6, 5, 6 };
            var input1 = new int[] { 2, 1, 4 };

            return IsArraySpecial(input1);
        }

        public bool IsArraySpecial(int[] nums)
        {
            var r = true;
            var f = (nums[0] & 1);
            for (int i = 1; i < nums.Length; i++)
            {
                var n = (nums[1] & 1);
                if (n == f)
                {
                    return false;
                }
                else
                {
                    f = n;
                }
            }
            return r;
        }
    }
}