using System;
using System.Collections;
using System.Collections.Generic;
using System.Diagnostics.CodeAnalysis;
using System.Linq;

namespace ConsoleApp3.Methods
{
    /// <summary>
    /// 1673
    /// </summary>
    public class Leet2028
    {
        public int[] Action()
        {
            //4 2
            var rolls = new int[] { 3, 2, 4, 3 };
            // 3 4
            //var rolls = new int[] { 1, 5, 6 };
            //5,3
            //var rolls = new int[] { 3, 5, 3 };

            return MissingRolls2(rolls, 4, 2);
        }

        public int[] MissingRolls(int[] rolls, int mean, int n)
        {
            var r = new int[n];
            var c = 0;
            foreach (var item in rolls)
            {
                c += item;
            }
            var remainCount = (rolls.Length + n) * mean - c;
            var quotient = remainCount / n;
            if (remainCount < n || quotient > 6)
            {
                return new int[] { };
            }

            var remain = remainCount % n;
            if (quotient == 6 && remain > 0)
            {
                return new int[] { };
            }
            for (int i = 0; i < r.Length; i++)
            {
                r[i] = quotient;
                if (remain-- > 0)
                {
                    r[i]++;
                }
            }

            return r;
        }

        /// <summary>
        /// 优化
        /// </summary>
        /// <param name="rolls"></param>
        /// <param name="mean"></param>
        /// <param name="n"></param>
        /// <returns></returns>
        public int[] MissingRolls2(int[] rolls, int mean, int n)
        {
            //先计算出总数
            int sum = mean * (rolls.Length + n);

            //计算缺失的数量
            int missSum = sum;
            foreach (var item in rolls)
            {
                missSum += item;
            }
            //判断是否能还原
            if (missSum < n || missSum > n * 6)
            {
                return new int[] { };
            }
            int quotient = missSum / n, remain = missSum % n;
            var r = new int[n];
            for (int i = 0; i < r.Length; i++)
            {
                r[i] = quotient;
                if (remain-- > 0)
                {
                    r[i]++;
                }
            }

            return r;
        }
    }
}