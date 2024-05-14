using System.Collections.Generic;

namespace Leet.Methods
{
    public class Leet2670
    {
        public int[] Action()
        {
            //string s1 = "acb", s2 = "ab";
            //int n1 = 4, n2 = 2;
            //var value = new int[] { 5, 3, 4, 1, 1 };
            //var value = new int[] { 6, 5, 3, 9, 2, 7 };
            var value = new int[] { 1, 2, 3, 4, 5 };

            return DistinctDifferenceArray(value);
        }

        public int[] DistinctDifferenceArray(int[] nums)
        {
            var r = new int[nums.Length];
            var f = new HashSet<int>();
            var b = new HashSet<int>();
            for (int i = 0; i < nums.Length; i++)
            {
                f.Clear();
                b.Clear();
                for (int j = i; j >= 0; j--)
                {
                    f.Add(nums[j]);
                }
                for (int j = i + 1; j < nums.Length; j++)
                {
                    b.Add(nums[j]);
                }
                r[i] = f.Count - b.Count;
            }
            return r;
        }
    }
}