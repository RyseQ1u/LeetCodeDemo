using System;
using System.Collections.Generic;
using System.Linq;

namespace LeetCode.Methods.Middle
{
    /// <summary>
    /// Leet3111
    /// </summary>
    public class Leet3111
    {
        public int Action()
        {
            ////1
            //var input = new int[][]
            //{
            //    new int[] { 2, 1 },
            //    new int[] { 1, 0 },
            //    new int[] { 1, 4 },
            //    new int[] { 1, 8 } ,
            //    new int[] { 3, 5 } ,
            //    new int[] { 4, 6 } ,
            //};
            //3
            var input = new int[][]
            {
                new int[] { 0,0 },
                new int[] { 1, 1 },
                new int[] { 3, 2 },
                new int[] { 3, 3 } ,
                new int[] { 4, 4 } ,
                new int[] { 5, 5 } ,
                new int[] { 6, 6 } ,
            };
            return MinRectanglesToCoverPoints(input, 2);
        }

        /// <summary>
        /// 直接判断x轴即可
        /// </summary>
        /// <param name="points"></param>
        /// <param name="w"></param>
        /// <returns></returns>
        public int MinRectanglesToCoverPoints(int[][] points, int w)
        {
            var r = 0;
            //收集x轴位置去重
            var set = new HashSet<int>();

            foreach (var p in points)
            {
                set.Add(p[0]);
            }
            //排序
            var list = set.OrderBy(p => p).ToList();
            //和边长w判断
            for (int i = 0; i < list.Count;)
            {
                var t = list[i];
                for (int j = i; j < list.Count; j++)
                {
                    if (list[j] - t <= w)
                    {
                        i++;
                    }
                    else { break; }
                }
                r++;
            }
            return r;
        }

        /// <summary>
        /// 优化
        /// </summary>
        /// <param name="points"></param>
        /// <param name="w"></param>
        /// <returns></returns>
        public int MinRectanglesToCoverPoints_V2(int[][] points, int w)
        {
            var r = 0;
            //判断x轴位置
            var set = new HashSet<int>();

            foreach (var p in points)
            {
                set.Add(p[0]);
            }
            var list = set.OrderBy(p => p);
            //记录矩形右边缘的x轴坐标
            int right = -1;
            foreach (var item in list)
            {
                if (item > right)
                {
                    right = item + w;
                    r++;
                }
            }

            return r;
        }
    }
}