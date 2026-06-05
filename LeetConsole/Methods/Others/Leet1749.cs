using System;

namespace ConsoleApp3.Methods
{
    /// <summary>
    /// 1749
    /// </summary>
    public class Leet1749
    {
        public int Action()
        {
            var source = new int[] { 1, -3, 2, 3, -4 };

            return MaxAbsoluteSum2(source);
        }

        public int MaxAbsoluteSum(int[] n)
        {
            int r = 0;
            int l = 0;
            while (l < n.Length)
            {
                for (int i = 0; i < n.Length - l; i++)
                {
                    int t = 0;
                    for (int j = 0; j <= l; j++)
                    {
                        t += n[j + i];
                    }
                    t = Math.Abs(t);
                    if (t > r)
                    {
                        r = t;
                    }
                }
                l++;
            }
            return r;
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