using System;

namespace LeetCode.Methods.Easy
{
    /// <summary>
    /// 3194
    /// </summary>
    public class Leet3194
    {
        public double MinimumAverage(int[] nums)
        {
            //排序
            var r = int.MaxValue;
            Array.Sort(nums);
            for (int left = 0, right = nums.Length - 1; left < right; left++, right--)
            {
                r = Math.Min(r, (nums[left] + nums[right]));
            }
            //减少计算最后再除
            return r / 2D;
        }
    }
}