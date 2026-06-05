using System;

namespace Leet.Methods
{
    /// <summary>
    ///
    /// </summary>
    public class Leet2529
    {
        public int Action()
        {
            var nums = new int[] { -2, -1, -1, 1, 2, 3 };

            var r = MaximumCount(nums);
            return r;
        }

        public int MaximumCount(int[] nums)
        {
            int positive = 0;
            int negative = 0;
            foreach (int num in nums)
            {
                if (num > 0) positive++;
                if (num < 0) negative++;
            }
            return Math.Max(positive, negative);
        }
    }
}