using System;
using System.Linq;

namespace LeetCode.Methods.Easy
{
    /// <summary>
    /// Leet2956
    /// </summary>
    public class Leet2956
    {
        public int[] Action()
        {
            var input1 = new int[] { 4, 3, 2, 3, 1 };
            var input2 = new int[] { 2, 2, 5, 2, 3, 6 };

            return FindIntersectionValues2(input1, input2);
        }

        public int[] FindIntersectionValues(int[] nums1, int[] nums2)
        {
            var result = new int[2];
            var hs1 = nums1.ToHashSet();
            var hs2 = nums2.ToHashSet();
            foreach (var i in nums1)
            {
                if (hs2.Contains(i)) { result[0]++; };
            }
            foreach (var i in nums2)
            {
                if (hs1.Contains(i)) { result[1]++; };
            }
            return result;
        }

        public int[] FindIntersectionValues2(int[] nums1, int[] nums2)
        {
            return new[] { nums1.Count(nums2.Contains), nums2.Count(nums1.Contains) };
        }
    }
}