using System;
using System.Collections.Generic;

namespace Leet.Methods
{
    public class Leet2859
    {
        public long Action()
        {
            //string s1 = "acb", s2 = "ab";
            //int n1 = 4, n2 = 2;
            //var value = new int[] { 5, 3, 4, 1, 1 };
            //var value = new int[] { 6, 5, 3, 9, 2, 7 };
            var value = new int[] { 5, 10, 1, 5, 2 };
            //var value = new int[] { 4, 3, 2, 1 };
            var k = 1;

            return SumIndicesWithKSetBits(value, k);
        }

        public int SumIndicesWithKSetBits(IList<int> nums, int k)
        {
            var c = 0;
            for (int i = 0; i < nums.Count; i++)
            {
                var bc = 0;
                string binaryString = Convert.ToString(i, 2);
                foreach (var b in binaryString)
                {
                    if (b == '1')
                    {
                        bc++;
                    }
                }
                if (bc == k) c += nums[i];
            }
            return c;
        }
    }
}