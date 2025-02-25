using System;

namespace LeetCode.Methods.Middle
{
    /// <summary>
    /// 2024
    /// </summary>
    public class Leet2024
    {
        public int MaxConsecutiveAnswers(string answerKey, int k)
        {
            var r = 0;
            //滑动窗口
            //先计算T的情况
            var n = answerKey.Length;
            var left = 0;
            var right = 0;
            var other = 0;
            for (; right < n; right++)
            {
                //判断字符 统计不同的类型
                other += answerKey[right] == 'T' ? 0 : 1;
                //如果其他字符数量超过k值，则移动左指针
                while (other > k)
                {
                    //判断左指针字符类型
                    other -= answerKey[left++] == 'T' ? 0 : 1;
                }
                //计算当前长度和最大值
                r = Math.Max(r, right - left + 1);
            }
            //先计算F的情况

            left = 0;
            right = 0;
            other = 0;
            for (; right < n; right++)
            {
                //判断字符 统计不同的类型
                other += answerKey[right] == 'F' ? 0 : 1;
                //如果其他字符数量超过k值，则移动左指针
                while (other > k)
                {
                    //判断左指针字符类型
                    other -= answerKey[left++] == 'F' ? 0 : 1;
                }
                //计算当前长度和最大值
                r = Math.Max(r, right - left + 1);
            }
            return r;
        }
    }
}