using System;

namespace LeetCode.Methods.Easy
{
    /// <summary>
    /// 2535
    /// </summary>
    public class Leet2535
    {
        public int DifferenceOfSum(int[] nums)
        {
            var sum = 0;
            for (int i = 0; i < nums.Length; i++)
            {
                var n = nums[i];
                sum += n;
                while (n > 0)
                {
                    sum -= n % 10;
                    n /= 10;
                }
            }
            //元素值一定比位数值大所有不用求绝对值
            //return Math.Abs(sum - and);
            return sum;
        }

        public int DifferenceOfSum2(int[] nums)
        {
            var sum = 0;
            var and = 0;
            for (int i = 0; i < nums.Length; i++)
            {
                var n = nums[i];
                sum += n;
                while (n > 0)
                {
                    and += n % 10;
                    n /= 10;
                }
            }
            return Math.Abs(sum - and);
        }
    }
}