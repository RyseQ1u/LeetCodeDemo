using System;

namespace LeetCode.Methods.Middle
{
    /// <summary>
    /// 522
    /// </summary>
    public class Leet522
    {
        public int Action()
        {
            //var input = new string[] { "aba", "cdc", "eae" };
            var input = new string[] { "aaa", "aaa", "aa" };
            return FindLUSlength(input);
        }

        #region 方法一

        public int FindLUSlength(string[] strs)
        {
            var result = -1;
            Array.Sort(strs, (a, b) => b.Length.CompareTo(a.Length));

            for (int i = 0; i < strs.Length; i++)
            {
                bool f = true;
                for (int j = 0; j < strs.Length; j++)
                {
                    if (j == i) continue;

                    //判断是否为子串
                    if (strs[j].Length < strs[i].Length) continue;
                    int left = 0;
                    for (int k = 0; k < strs[j].Length; k++)
                    {
                        if (strs[j][k] == strs[i][left])
                        {
                            left++;
                        }
                        if (left == strs[i].Length)
                        {
                            f = false;
                            break;
                        }
                    }
                }
                if (f)
                {
                    return strs[i].Length;
                }
            }

            return result;
        }

        #endregion 方法一
    }
}