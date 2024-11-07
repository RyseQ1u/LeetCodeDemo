using System;
using System.Collections.Generic;
using System.Linq;

namespace LeetCode.Methods.Middle
{
    /// <summary>
    /// Leet2961
    /// </summary>
    public class Leet2961
    {
        public IList<int> Action()
        {
            //2
            var input = new int[][] { new int[] { 2, 3, 3, 10 }, new int[] { 3, 3, 3, 1 }, new int[] { 6, 1, 1, 4 } };
            //1
            int[][] jaggedArray = new int[][]
{
            new int[] { 30, 5, 43, 2 },
            new int[] { 15, 50, 35, 41 },
            new int[] { 45, 34, 41, 32 },
            new int[] { 14, 37, 33, 13 },
            new int[] { 6, 8, 1, 53 },
            new int[] { 37, 1, 12, 52 },
            new int[] { 42, 37, 2, 52 },
            new int[] { 9, 2, 15, 3 },
            new int[] { 31, 12, 21, 24 },
            new int[] { 52, 24, 6, 12 },
            new int[] { 51, 35, 21, 52 },
            new int[] { 30, 18, 10, 2 },
            new int[] { 27, 31, 50, 27 },
            new int[] { 29, 25, 26, 32 },
            new int[] { 15, 38, 43, 17 },
            new int[] { 22, 12, 16, 43 },
            new int[] { 48, 9, 15, 6 },
            new int[] { 41, 26, 22, 21 },
            new int[] { 41, 49, 52, 26 },
            new int[] { 53, 38, 9, 33 }
};
            return GetGoodIndices(jaggedArray, 1);
        }

        public IList<int> GetGoodIndices(int[][] variables, int target)
        {
            var r = new List<int>();
            for (int i = 0; i < variables.Length; i++)
            {
                if (FastExponentiationLoop(FastExponentiationLoop(variables[i][0], variables[i][1], 10), variables[i][2], variables[i][3]) == target)
                {
                    r.Add(i);
                }
            }
            return r;
        }

        /// <summary>
        /// 快速幂运算 循环
        /// </summary>
        /// <param name="baseValue"></param>
        /// <param name="exponent"></param>
        /// <returns></returns>
        private int FastExponentiationLoop(int baseValue, int exponent, int mod)
        {
            int result = 1;
            while (exponent > 0)
            {
                if (exponent % 2 == 1)
                {
                    result = result * baseValue % mod;
                }
                exponent /= 2;
                baseValue = baseValue * baseValue % mod;
            }
            return result;
        }

        /// <summary>
        /// 快速幂运算 递归
        /// </summary>
        /// <param name="baseValue"></param>
        /// <param name="exponent"></param>
        /// <returns></returns>
        private long FastExponentiation(long baseValue, long exponent)
        {
            if (exponent == 0)
            {
                return 1;
            }
            else if (exponent % 2 == 0)
            {
                long halfPower = FastExponentiation(baseValue, exponent / 2);
                return halfPower * halfPower;
            }
            else
            {
                long halfPower = FastExponentiation(baseValue, (exponent - 1) / 2);
                return halfPower * halfPower * baseValue;
            }
        }
    }
}