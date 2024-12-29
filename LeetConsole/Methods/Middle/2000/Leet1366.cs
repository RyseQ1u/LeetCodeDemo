using System;
using System.Collections.Generic;
using System.Linq;
using System.Text;

namespace LeetCode.Methods.Middle
{
    /// <summary>
    /// 1366
    /// </summary>
    public class Leet1366
    {
        public string RankTeams(string[] votes)
        {
            var dict = new Dictionary<char, int[]>();
            foreach (char vid in votes[0])
            {
                dict[vid] = new int[votes[0].Length];
            }

            //遍历统计
            foreach (var vot in votes)
            {
                for (var i = 0; i < vot.Length; i++)
                {
                    dict[vot[i]][i]++;
                }
            }
            //取出全部的keys
            var keys = dict.Keys.ToArray();
            Array.Sort(keys);
            for (int i = 0; i < keys.Length - 1; i++)
            {
                for (int j = 0; j < keys.Length - i - 1; j++)
                {
                    if (Compare(dict[keys[j + 1]], dict[keys[j]]))
                    {
                        (keys[j + 1], keys[j]) = (keys[j], keys[j + 1]);
                    }
                }
            }

            return string.Concat(keys);
        }

        private bool Compare(int[] arr1, int[] arr2)
        {
            for (int i = 0; i < arr1.Length; i++)
            {
                if (arr1[i] > arr2[i])
                {
                    return true;
                }
                else if (arr1[i] == arr2[i])
                {
                    continue;
                }
                else
                {
                    return false;
                }
            }
            return false;
        }
    }
}