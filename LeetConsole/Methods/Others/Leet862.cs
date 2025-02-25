using System;
using System.Collections;

namespace ConsoleApp3.Methods
{
    /// <summary>
    /// 862
    /// </summary>
    public class Leet862
    {
        public int Action()
        {
            int[] nums = new int[] { 2, -1, 2 };
            //nums = new int[] { 1, 1, 1, 0, 6, 12 };
            int k = 3;
            return Function1(nums, k);
        }

        public int Function1(int[] nums, int k)
        {
            int length = 0;
            bool flag = true;
            int[] arr = new int[nums.Length + 1];
            for (int i = 0; i < nums.Length; i++)
            {
                arr[i + 1] = arr[i] + nums[i];
            }
            Queue queue = new Queue();
            length++;

            return length;
        }

        /// <summary>
        ///
        /// </summary>
        /// <param name="sandwiches"></param>
        /// <param name="student"></param>
        /// <returns></returns>
        public int Function2(int[] nums)
        {
            int curMax = nums[0], index = 0, leftMax = nums[0];
            for (int i = 1; i < nums.Length - 1; i++)
            {
                curMax = Math.Max(curMax, nums[i]);
                if (nums[i] < leftMax)
                {
                    leftMax = curMax;
                    index = i;
                }
            }
            return index + 1;
        }
    }
}