using System;

namespace LeetCode.Methods.Middle
{
    /// <summary>
    /// 3097
    /// </summary>
    public class Leet3097
    {
        public int MinimumSubarrayLength(int[] nums, int k)
        {
            int n = nums.Length;
            int[] bits = new int[30];
            int res = int.MaxValue;

            for (int left = 0, right = 0; right < n; right++)
            {
                for (int i = 0; i < 30; i++)
                {
                    bits[i] += (nums[right] >> i) & 1;
                }
                while (left <= right && Calc(bits) >= k)
                {
                    res = Math.Min(res, right - left + 1);
                    for (int i = 0; i < 30; i++)
                    {
                        bits[i] -= (nums[left] >> i) & 1;
                    }
                    left++;
                }
            }

            return res == int.MaxValue ? -1 : res;
        }

        private int Calc(int[] bits)
        {
            int ans = 0;
            for (int i = 0; i < bits.Length; i++)
            {
                if (bits[i] > 0)
                {
                    ans |= 1 << i;
                }
            }
            return ans;
        }
    }
}