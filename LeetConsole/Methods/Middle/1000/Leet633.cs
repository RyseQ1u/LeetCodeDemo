using System;

namespace LeetCode.Methods.Middle
{
    /// <summary>
    /// 633
    /// </summary>
    public class Leet633
    {
        public bool JudgeSquareSum(int c)
        {
            //mod 4 判断c是否有整数解
            if (c % 4 == 3) return false;
            //a b 最大值不超过 c的平方根
            var limit = Math.Floor(Math.Sqrt(c)) + 1;
            for (int i = 0; i < limit; i++)
            {
                var b_squared = c - i * i;
                var b = Math.Floor(Math.Sqrt(b_squared));
                if (b * b == b_squared)
                {
                    return true;
                }
            }
            return false;
        }

        /// <summary>
        /// 直接枚举 双指针
        /// </summary>
        /// <param name="c"></param>
        /// <returns></returns>
        public bool JudgeSquareSum2(int c)
        {
            int a = 0;
            int b = (int)Math.Sqrt(c);
            while (a <= b)
            {
                // 避免溢出
                if (a * a == c - b * b)
                {
                    return true;
                }
                if (a * a < c - b * b)
                {
                    a++;
                }
                else
                {
                    b--;
                }
            }
            return false;
        }
    }
}