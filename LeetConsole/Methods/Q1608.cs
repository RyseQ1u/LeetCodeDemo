using System;
using System.Collections.Generic;
using System.Text;

namespace ConsoleApp1.Methods
{
    public static class Q1608
    {
        public static int Method1(int[] nums)
        {
            int n = nums.Length;
            int count = 0;

            for (int i = 0; i <= n; i++)
            {
                count = 0;
                for (int j = 0; j < n; j++)
                {
                    if (nums[j] >= i) count++;
                }
                if (count == i)
                {
                    return count;
                }
                else
                {
                    count = -1;
                }
            }
            return count;
        }

        public static int Method2(int[] nums)
        {
            int count = -1;
            for (int i = 0; i <= nums.Length; i++)
            {
                count = 0;
                foreach (int item in nums)
                {
                    if (item >= i) count++;
                }
                if (count == i)
                {
                    return count;
                }
                count = -1;
            }
            return count;
        }
    }
}