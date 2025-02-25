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
            //使用字典记录每个字符的投票情况
            //key => 字符 int[] => 投票情况

            var dict = new Dictionary<char, int[]>();
            foreach (char vid in votes[0])
            {
                //初始化数组
                dict[vid] = new int[votes[0].Length];
            }

            //遍历统计
            foreach (var vot in votes)
            {
                for (var i = 0; i < vot.Length; i++)
                {
                    //当前字符
                    var c = vot[i];
                    //记录当前字符的位置
                    dict[c][i]++;
                }
            }
            //取出全部的keys
            var keys = dict.Keys.ToArray();
            //先排序一次 对平票的情况处理
            Array.Sort(keys);
            //冒泡排序 倒序
            for (int i = 0; i < keys.Length - 1; i++)
            {
                for (int j = 0; j < keys.Length - i - 1; j++)
                {
                    if (Compare(dict[keys[j + 1]], dict[keys[j]]))
                    {
                        //使用元组交换元素
                        (keys[j + 1], keys[j]) = (keys[j], keys[j + 1]);
                    }
                }
            }

            return string.Concat(keys);
        }

        /// <summary>
        /// 比较方法
        /// </summary>
        /// <returns></returns>
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