using System;

namespace LeetCode.Methods.Easy
{
    /// <summary>
    /// LCP2748
    /// </summary>
    public class Leet61
    {
        public int Action()
        {
            //1;
            //var input1 = new int[] { -14, 7, -19, 9, 13, 40, 19, 15, -18 };
            //var inpu2 = new int[] { 3, 16, 28, 32, 25, 12, 13, -6, 4 };

            //2
            //var input1 = new int[] { 21, 18, 18, 18, 31 };
            //var inpu2 = new int[] { 34, 32, 16, 16, 17 };

            //3
            var input1 = new int[] { 5, 10, 16, -6, 15, 11, 3 };
            var input2 = new int[] { 16, 22, 23, 23, 25, 3, -16 };

            return TemperatureTrend2(input1, input2);
        }

        public int TemperatureTrend(int[] temperatureA, int[] temperatureB)
        {
            var r = 0;
            var diffA = new int[temperatureA.Length - 1];
            var diffB = new int[temperatureA.Length - 1];
            //处理数据 上升 1 平稳 0 下降 -1
            for (int i = 0; i < temperatureA.Length - 1; i++)
            {
                var ta = temperatureA[i] - temperatureA[i + 1];
                var tb = temperatureB[i] - temperatureB[i + 1];
                diffA[i] = ta > 0 ? 1 : ta == 0 ? 0 : -1;

                diffB[i] = tb > 0 ? 1 : tb == 0 ? 0 : -1;
            }
            //找相同的
            for (int i = 0; i < diffA.Length - 1; i++)
            {
                if (diffA[i] == diffB[i])
                {
                    var right = i + 1;
                    var cur = 1;
                    while (right < diffA.Length)
                    {
                        if (diffA[right] == diffB[right])
                        {
                            cur++;
                        }
                        else
                        {
                            break;
                        }
                        right++;
                    }
                    r = Math.Max(r, cur);
                }
            }
            return r;
        }

        /// <summary>
        /// 一次遍历
        /// </summary>
        /// <param name="temperatureA"></param>
        /// <param name="temperatureB"></param>
        /// <returns></returns>
        public int TemperatureTrend2(int[] temperatureA, int[] temperatureB)
        {
            var r = 0;
            var diffA = new int[temperatureA.Length - 1];
            var diffB = new int[temperatureA.Length - 1];
            var cur = 0;
            for (int i = 0; i < temperatureA.Length - 1; i++)
            {
                var ta = temperatureA[i] - temperatureA[i + 1];
                var tb = temperatureB[i] - temperatureB[i + 1];
                diffA[i] = ta > 0 ? 1 : ta == 0 ? 0 : -1;

                diffB[i] = tb > 0 ? 1 : tb == 0 ? 0 : -1;
                if (diffA[i] == diffB[i])
                {
                    cur++;
                    r = Math.Max(r, cur);
                }
                else
                {
                    cur = 0;
                }
            }

            return r;
        }
    }
}