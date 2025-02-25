using System;

namespace ConsoleApp3.Methods
{
    /// <summary>
    /// 1281
    /// </summary>
    public class Leet1281
    {
        public int Action()
        {
            //var source = 234;
            var source = 4421;

            return MaxAbsoluteSum(source);
        }

        public int MaxAbsoluteSum(int n)
        {
            int m = 1;
            int p = 0;
            while (n > 0)
            {
                int o = n % 10;
                n /= 10;
                m *= o;
                p += o;
            }
            return Math.Abs(m - p);
        }

        public int MaxAbsoluteSum2(int[] nums)
        {
            int positiveMax = 0, negativeMin = 0;
            int positiveSum = 0, negativeSum = 0;
            foreach (int num in nums)
            {
                positiveSum += num;
                positiveMax = Math.Max(positiveMax, positiveSum);
                positiveSum = Math.Max(0, positiveSum);
                negativeSum += num;
                negativeMin = Math.Min(negativeMin, negativeSum);
                negativeSum = Math.Min(0, negativeSum);
            }
            return Math.Max(positiveMax, -negativeMin);
        }
    }
}