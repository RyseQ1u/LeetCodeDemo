using System;
using System.Collections;
using System.Collections.Generic;
using System.Diagnostics.CodeAnalysis;
using System.Linq;
using System.Runtime.CompilerServices;

namespace ConsoleApp3.Methods
{
    /// <summary>
    /// Leet2965.cs
    /// </summary>
    public class Leet2965

    {
        public int[] Action()
        {
            //4 2
            var s = new int[][] { new int[] { 1, 3 }, new int[] { 2, 2 } };
            // 3 4
            //var rolls = new int[] { 1, 5, 6 };
            //5,3
            //var rolls = new int[] { 3, 5, 3 };

            return FindMissingAndRepeatedValues(s);
        }

        public int[] FindMissingAndRepeatedValues(int[][] grid)
        {
            var r = new int[2];
            var temp = new int[grid.Length * grid.Length + 1];
            for (int i = 0; i < grid.Length; i++)
            {
                for (int j = 0; j < grid[i].Length; j++)
                {
                    temp[grid[i][j]]++;
                }
            }
            for (int i = 1; i < temp.Length; i++)
            {
                if (temp[i] == 0)
                {
                    r[1] = i;
                }
                else if (temp[i] == 2)
                {
                    r[0] = i;
                }
            }
            return r;
        }
    }
}