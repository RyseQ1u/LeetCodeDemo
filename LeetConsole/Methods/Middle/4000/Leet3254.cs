using System;

namespace LeetCode.Methods.Middle
{
    /// <summary>
    /// 3524
    /// </summary>
    public class Leet3254
    {
        /// <summary>
        /// 统计个数
        /// </summary>
        /// <param name="nums"></param>
        /// <param name="k"></param>
        /// <returns></returns>
        public int[] ResultsArray(int[] nums, int k)
        {
            var res = new int[nums.Length - k + 1];
            Array.Fill(res, -1);
            //递增次数
            int cnt = 0;
            for (int i = 0; i < nums.Length; i++)
            {
                //是否递增
                if (cnt == 0 || nums[i] == nums[i - 1] + 1)
                {
                    cnt++;
                }
                else
                {
                    cnt = 1;
                }
                if (cnt >= k)
                {
                    res[i - k + 1] = nums[i];
                }
            }
            return res;
        }
    }
}