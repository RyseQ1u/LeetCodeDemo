using System;

namespace LeetCode.Methods.Middle
{
    /// <summary>
    /// 1561
    /// </summary>
    public class Leet1561
    {
        public int MaxCoins(int[] piles)
        {
            int res = 0;
            //排序
            Array.Sort(piles);
            int n = piles.Length;
            int l = n / 3;
            for (int i = 1; i <= l; i++)
            {
                res += piles[n - 2 * i];
            }
            return res;
        }

        /// <summary>
        /// 减少计算
        /// </summary>
        /// <param name="piles"></param>
        /// <returns></returns>
        public int MaxCoins_V2(int[] piles)
        {
            Array.Sort(piles, (a, b) => a - b);

            var res = 0;

            for (int i = piles.Length / 3; i < piles.Length; i += 2)
            {
                res += piles[i];
            }

            return res;
        }
    }
}