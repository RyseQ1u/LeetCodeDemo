using System;
using System.Collections.Generic;

namespace LeetCode.Methods.Middle
{
    /// <summary>
    /// 3549
    /// </summary>
    public class Leet3249
    {
        private int res = 0;
        private IList<int>[] g;

        public int CountGoodNodes(int[][] edges)
        {
            int n = edges.Length + 1;
            g = new IList<int>[n];
            for (int i = 0; i < n; i++)
            {
                g[i] = new List<int>();
            }
            foreach (int[] edge in edges)
            {
                g[edge[0]].Add(edge[1]);
                g[edge[1]].Add(edge[0]);
            }
            DFS(0, -1);
            return res;
        }

        public int DFS(int node, int parent)
        {
            bool valid = true;
            int treeSize = 0;
            int subTreeSize = 0;
            foreach (int child in g[node])
            {
                if (child != parent)
                {
                    int size = DFS(child, node);
                    if (subTreeSize == 0)
                    {
                        subTreeSize = size;
                    }
                    else if (size != subTreeSize)
                    {
                        valid = false;
                    }
                    treeSize += size;
                }
            }
            if (valid)
            {
                res++;
            }
            return treeSize + 1;
        }
    }
}