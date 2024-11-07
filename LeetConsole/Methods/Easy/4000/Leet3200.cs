using System;
using System.Collections.Generic;
using System.Linq;

namespace LeetCode.Methods.Easy
{
    /// <summary>
    /// 3200
    /// </summary>
    public class Leet3200
    {
        public int MaxHeightOfTriangle(int red, int blue)
        {
            return Math.Max(f(red, blue), f(blue, red));
        }

        private int f(int n, int m)
        {
            int odd = (int)Math.Sqrt(n);
            int even = (int)((Math.Sqrt(m * 4 + 1) - 1) / 2);
            return odd > even ? even * 2 + 1 : odd * 2;
        }
    }
}