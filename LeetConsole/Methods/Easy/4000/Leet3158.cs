using System;
using System.Collections.Generic;
using System.Linq;
using System.Security.Cryptography;

namespace LeetCode.Methods.Easy
{
    /// <summary>
    /// 3158
    /// </summary>
    public class Leet3158
    {
        /// <summary>
        /// 题目数字范围1-50可以用位运算将空间复杂度降到O(1)
        /// </summary>
        /// <param name="nums"></param>
        /// <returns></returns>
        public int DuplicateNumbersXOR(int[] nums)
        {
            //0异或任何数都等于它本身
            var r = 0;
            var set1 = new HashSet<int>();
            foreach (var x in nums)
            {
                if (!set1.Add(x))
                {
                    r ^= x;
                }
            }
            return r;
        }
    }
}