using System;

namespace ConsoleApp3.Methods
{
    /// <summary>
    ///2735
    /// </summary>
    public class Leet2735
    {
        public long Action()
        {
            int[] p1 = new int[] { 20, 1, 15 };
            int x = 5;
            return MinCost(p1, x);
        }

        public long MinCost(int[] nums, int x)
        {
            int n = nums.Length;
            int[] f = new int[n];
            Array.Copy(nums, 0, f, 0, n);
            long ans = GetSum(f);
            for (int k = 1; k < n; ++k)
            {
                for (int i = 0; i < n; ++i)
                {
                    f[i] = Math.Min(f[i], nums[(i + k) % n]);
                }
                ans = Math.Min(ans, (long)k * x + GetSum(f));
            }
            return ans;
        }

        public long GetSum(int[] f)
        {
            long sum = 0;
            foreach (int num in f)
            {
                sum += num;
            }
            return sum;
        }
    }
}