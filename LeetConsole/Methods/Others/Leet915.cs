using System;

namespace ConsoleApp3.Methods
{
    /// <summary>
    /// 915
    /// </summary>
    public class Leet915
    {
        public int Action()
        {
            int[] nums = new int[] { 5, 0, 3, 8, 6 };
            //nums = new int[] { 1,1,1,0,6,12 };
            return Function1(nums);
        }

        public int Function1(int[] nums)
        {
            int index = 0;
            bool flag = false;
            for (int i = 0; i < nums.Length - 1; i++)
            {
                for (int j = i + 1; j < nums.Length - 1; j++)
                {
                    if (nums[i] < nums[j])
                    {
                        if (!flag)
                        {
                            index = Math.Max(index, j);
                            flag = true;
                        }
                    }
                    else
                    {
                        flag = false;
                    }
                }
            }

            return index;
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