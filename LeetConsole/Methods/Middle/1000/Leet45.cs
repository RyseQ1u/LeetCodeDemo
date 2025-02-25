using System;

namespace LeetCode.Methods.Middle
{
    /// <summary>
    /// 45
    /// </summary>
    public class Leet45
    {
        public int Jump(int[] nums)
        {
            int res = 0;
            //从index0开始
            //当前能跳到最远的右端点
            int curRight = 0;
            //最远右端点 当前范围内能跳到最远的右端点
            int maxRight = 0;
            //遍历到n-2 因为题目一定会到达n-1 所以不用对n-2作判断
            for (int i = 0; i < nums.Length - 1; i++)
            {
                //记录最远的右端点
                maxRight = Math.Max(maxRight, nums[i] + i);
                //如果当前已到达当前的右端点
                if (i == curRight)
                {
                    //跳跃到最远右端点
                    curRight = maxRight;
                    res++;
                }
            }

            return res;
        }
    }
}