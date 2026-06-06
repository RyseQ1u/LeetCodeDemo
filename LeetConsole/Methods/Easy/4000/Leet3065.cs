using System.Collections.Generic;

namespace LeetCode.Methods.Easy
{
    /// <summary>
    /// 3065
    /// </summary>
    public class Leet3065
    {
        public int MinOperations(int[] nums, int k)
        {
            int res = 0;
            foreach (int i in nums)
            {
                if (i < k) res++;
            }
            return res;
        }
    }
}