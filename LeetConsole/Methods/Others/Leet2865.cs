using System;

namespace Leet.Methods
{
    public class Leet2865
    {
        public long Action()
        {
            //string s1 = "acb", s2 = "ab";
            //int n1 = 4, n2 = 2;
            //var value = new int[] { 5, 3, 4, 1, 1 };
            //var value = new int[] { 6, 5, 3, 9, 2, 7 };
            var value = new int[] { 1000000000, 1000000000, 1000000000 };

            return MaximumSumOfHeights(value);
        }

        public long MaximumSumOfHeights(int[] maxHeights)
        {
            var dif = long.MaxValue;
            long c = 0;
            for (int i = 0; i < maxHeights.Length; i++)
            {
                long t = 0;
                // <- i
                int left = maxHeights[i];
                for (int l = i; l > 0; l--)
                {
                    if (maxHeights[l - 1] > left)
                    {
                        //left = maxHeights[l - 1];
                        t += maxHeights[l - 1] - left;
                    }
                    else
                    {
                        left = maxHeights[l - 1];
                    }
                }
                // i->
                int right = maxHeights[i];
                for (int l = i; l < maxHeights.Length - 1; l++)
                {
                    if (maxHeights[l + 1] > right)
                    {
                        //right = maxHeights[l+1];
                        //maxHeights[l + 1] = right;
                        t += maxHeights[l + 1] - right;
                    }
                    else
                    {
                        right = maxHeights[l + 1];
                    }
                }
                dif = Math.Min(dif, t);
                c += maxHeights[i];
            }

            return c - dif;
        }
    }
}