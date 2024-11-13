using System.Collections.Generic;

namespace LeetCode.Methods.Middle
{
    /// <summary>
    /// 2374
    /// </summary>
    public class Leet2374
    {
        public int EdgeScore(int[] edges)
        {
            var r = 0;
            long max = 0;
            var dict = new Dictionary<int, long>();
            for (int i = 0; i < edges.Length; i++)
            {
                var edge = edges[i];
                if (dict.ContainsKey(edge))
                {
                    dict[edge] += i;
                }
                else
                {
                    dict.Add(edge, i);
                }
                if (max < dict[edge])
                {
                    max = dict[edge];
                    r = edge;
                }
                else if (max == dict[edge] && edge < r)
                {
                    r = edge;
                }
            }
            return r;
        }
    }
}