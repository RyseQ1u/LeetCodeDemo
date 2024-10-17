using System;
using System.Collections.Generic;
using System.Linq;

namespace LeetCode.Methods.Easy
{
    /// <summary>
    /// 2748
    /// </summary>
    public class Leet2748
    {

        public int CountBeautifulPairs(int[] nums)
        {
            int res = 0, n = nums.Length;
            for (int i = 0; i < n; i++)
            {
                while (nums[i] >= 10)
                {
                    nums[i] /= 10;
                }
                for (int j = i + 1; j < n; j++)
                {
                    if (GCD(nums[i], nums[j] % 10) == 1)
                    {
                        res++;
                    }
                }
            }

            return res;
        }

        private int GCD(int a, int b)
        {
            return b == 0 ? a : GCD(b, a % b);
        }
    }
}