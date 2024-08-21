using System;
using System.Collections.Generic;
using System.Linq;

namespace LeetCode.Methods.Middle
{
    /// <summary>
    /// 3007
    /// </summary>
    public class Leet3007
    {
        public long Action()
        {
            //var input1 = 9;
            //var input2 = 1;

            //33
            var input1 = 83;
            var input2 = 1;
            return FindMaximumNumber(input1, input2);
        }

        public long findMaximumNumber2(long k, int x)
        {
            long left = 0;
            long right = (k + 1) << x;
            while (left + 1 < right)
            {
                long mid = (left + right) >>> 1;
                if (countDigitOne(mid, x) <= k)
                {
                    left = mid;
                }
                else
                {
                    right = mid;
                }
            }
            return left;
        }

        private long countDigitOne(long num, int x)
        {
            long res = 0;
            int i = x - 1;
            for (long n = num >> i; n > 0; n >>= x, i += x)
            {
                res += (n / 2) << i;
                if (n % 2 > 0)
                {
                    long mask = (1L << i) - 1;
                    res += (num & mask) + 1;
                }
            }
            return res;
        }

        public long FindMaximumNumber(long k, int x)
        {
            var n = 0;
            var total = 0;
            var f = true;
            while (f)
            {
                n++;
                //计算当前价值
                var price = 0;
                for (int i = 1; i <= 3; i++)
                {
                    if ((n >> (x * i - 1) & 1) == 1)
                    {
                        price++;
                    }
                }
                total += price;
                if (total + price > k)
                {
                    f = false;
                    n--;
                }
            }

            return n;
        }
    }
}