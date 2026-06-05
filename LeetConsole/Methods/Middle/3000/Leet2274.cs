using System;
using System.Text.RegularExpressions;

namespace LeetCode.Methods.Middle
{
    /// <summary>
    /// 2274
    /// </summary>
    public class Leet2274
    {
        public int MaxConsecutive(int bottom, int top, int[] special)
        {
            Array.Sort(special);
            var sl = special.Length;
            if (sl == top - bottom + 1) return 0;
            if (bottom == special[0] && top == special[1]) return top;
            var max = 0;
            var cur = bottom;
            for (int i = 0; i < special.Length; i++)
            {
                max = Math.Max(max, special[i] - cur);
                {
                    cur = special[i];
                }
                if (i == sl - 1)
                {
                    max = Math.Max(max, top - cur);
                }
                else { cur++; }
            }
            return max;
        }
    }
}