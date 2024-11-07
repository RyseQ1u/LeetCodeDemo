using LeetCode.Class;
using System;

namespace LeetCode.Methods.Middle
{
    /// <summary>
    /// 1884
    /// </summary>
    public class Leet1884
    {
        /// <summary>
        /// 数学法 解方程
        /// 最小的情况
        /// x+(x-1)+(x-2)...+2+1>=n
        /// </summary>
        /// <param name="n"></param>
        /// <returns></returns>
        public int TwoEggDrop(int n)
        {
            return (int)Math.Ceiling((Math.Sqrt(n * 8 + 1) - 1) / 2);
        }
    }
}