using System;

namespace LeetCode.Methods.Middle
{
    /// <summary>
    /// Leet3132
    /// </summary>
    public class Leet3132
    {
        public int Action()
        {
            var input1 = new int[] { 4, 20, 16, 12, 8 };
            var input2 = new int[] { 14, 18, 10 };
            return MinimumAddedInteger(input1, input2);
        }

        /// <summary>
        /// 排序 枚举 判断子序列
        /// </summary>
        /// <param name="nums1"></param>
        /// <param name="nums2"></param>
        /// <returns></returns>
        public int MinimumAddedInteger(int[] nums1, int[] nums2)
        {
            //数组排序
            Array.Sort(nums1);
            Array.Sort(nums2);
            //需要排除两个数 优先排除最小值以得到差值最小的结果
            //先排除nums1[0] nums1[1] 即从nums1[2]开始枚举
            for (int i = 2; i > 0; i--)
            {
                //计算差值
                int x = nums2[0] - nums1[i];
                // 尝试在 (nums1[i] + x) 中寻找找子序列 nums2
                int j = 0;
                //子序列判断方法
                for (int k = i; k < nums1.Length; k++)
                {
                    //与差值相加之后判断是否相等
                    if (nums2[j] == nums1[k] + x && ++j == nums2.Length)
                    {
                        // nums2 是 {nums1[i] + x} 的子序列
                        //因为枚举结果从小到大，第一个进入判断的即最小结果
                        return x;
                    }
                }
            }
            // 题目保证答案一定存在
            return nums2[0] - nums1[0];
        }
    }
}