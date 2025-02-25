using System;
using System.Collections.Generic;
using System.Text.RegularExpressions;

namespace LeetCode.Methods.Easy
{
    /// <summary>
    /// Leet682
    /// </summary>
    public class Leet661
    {
        public int[][] ImageSmoother(int[][] img)
        {
            int n = img.Length, l = img[0].Length;
            int[][] res = new int[img.Length][];

            for (int i = 0; i < img.Length; i++)
            {
                res[i] = new int[img[i].Length];
            }

            for (int i = 0; i < n; i++)
            {
                for (int j = 0; j < l; j++)
                {
                    Smoother(img, res, i, j, n, l);
                }
            }

            return res;
        }

        private void Smoother(int[][] img, int[][] res, int x, int y, int n, int len)
        {
            var sum = img[x][y];
            var divisor = 9;
            //上下左右是否有值
            bool u = true, d = true, l = true, r = true;
            if (x - 1 >= 0)
            {
                sum += img[x - 1][y];
            }
            else
            {
                u = false;
                divisor--;
            }
            if (x + 1 < n)
            {
                sum += img[x + 1][y];
            }
            else
            {
                d = false;
                divisor--;
            }
            if (y - 1 >= 0)
            {
                sum += img[x][y - 1];
            }
            else
            {
                l = false;
                divisor--;
            }
            if (y + 1 < len)
            {
                sum += img[x][y + 1];
            }
            else
            {
                r = false;
                divisor--;
            }

            //左上
            if (u && l)
            {
                sum += img[x - 1][y - 1];
            }
            else
            {
                divisor--;
            }
            //右上
            if (u && r)
            {
                sum += img[x - 1][y + 1];
            }
            else
            {
                divisor--;
            }
            //左下
            if (d && l)
            {
                sum += img[x + 1][y - 1];
            }
            else
            {
                divisor--;
            }
            //右下
            if (d && r)
            {
                sum += img[x + 1][y + 1];
            }
            else
            {
                divisor--;
            }
            res[x][y] = (int)Math.Floor((double)(sum / divisor));
        }
    }
}