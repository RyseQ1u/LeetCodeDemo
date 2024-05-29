using System;
using System.Collections;
using System.Collections.Generic;
using System.Diagnostics.CodeAnalysis;
using System.Linq;

namespace ConsoleApp3.Methods
{
    /// <summary>
    /// Leet2951
    /// </summary>
    public class LeetLeet2951
    {
        public IList<int> Action()
        {
            //4 2
            var rolls = new int[] { 1, 4, 3, 8, 5 };
            // 3 4
            //var rolls = new int[] { 1, 5, 6 };
            //5,3
            //var rolls = new int[] { 3, 5, 3 };

            return FindPeaks(rolls);
        }

        public IList<int> FindPeaks(int[] mountain)
        {
            var r = new List<int>();
            for (int i = 1; i < mountain.Length - 1; i++)
            {
                if (mountain[i - 1] < mountain[i] && mountain[i + 1] < mountain[i])
                {
                    r.Add(i);
                }
            }

            return r;
        }
    }
}