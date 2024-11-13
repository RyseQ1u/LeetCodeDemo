using System;
using System.Linq;

namespace LeetCode.Methods.Easy
{
    /// <summary>
    /// Leet3131
    /// </summary>
    public class Leet3131
    {
        public int Action()
        {
            var input1 = new int[] { 2, 6, 4 };
            var input2 = new int[] { 9, 7, 5 };

            return AddedInteger(input1, input2);
        }

        public int AddedInteger(int[] nums1, int[] nums2)
        {
            // 对两个数组进行排序
            Array.Sort(nums1);
            Array.Sort(nums2);
            return nums1[0] - nums2[0];
        }

        public int AddedInteger2(int[] nums1, int[] nums2)
        {
            return nums2.Min() - nums1.Min();
        }
    }
}