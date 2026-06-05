using System;

namespace LeetCode.Methods.Easy
{
    /// <summary>
    /// 2239
    /// </summary>
    public class Leet2239
    {
        public int FindClosestNumber(int[] nums)
        {
            //最小距离数字
            int n = int.MaxValue;
            //最小距离数字与0的距离
            int len = int.MaxValue;
            //遍历数组
            foreach (int i in nums)
            {
                //获取当前数字的绝对值 即 与0的距离
                int abs = Math.Abs(i);
                //当前距离小于最小距离
                if (abs < len)
                {
                    //更新数据
                    n = i;
                    len = abs;
                }
                //当前距离等于最小距离
                else if (abs == len)
                {
                    //将最小距离数字更新为较大值
                    n = Math.Max(i, n);
                }
            }
            //返回结果
            return n;
        }
    }
}