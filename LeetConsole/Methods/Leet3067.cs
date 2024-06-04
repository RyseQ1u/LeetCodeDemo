using System.Collections.Generic;
using System.Linq;

namespace ConsoleApp3.Methods
{
    /// <summary>
    /// 3067
    /// </summary>
    public class Leet3067

    {
        public int[] Action()
        {
            //4 2
            int[][] graphEdges = new int[][]
                {
                    new int[] {0, 6, 3},
                    new int[] {6, 5, 3},
                    new int[] {0, 3, 1},
                    new int[] {3, 2, 7},
                    new int[] {3, 1, 6},
                    new int[] {3, 4, 2}
                };
            var signalSpeed = 3;

            return CountPairsOfConnectableServers(graphEdges, 3);
        }

        public int[] CountPairsOfConnectableServers(int[][] edges, int signalSpeed)
        {
            var r = new int[edges.Length + 1];
            //构建图
            int n = edges.Length + 1;
            IList<int[]>[] graph = new IList<int[]>[n];
            for (int i = 0; i < n; i++)
            {
                graph[i] = new List<int[]>();
            }

            foreach (var edge in edges)
            {
                int s = edge[0];
                int e = edge[1];
                int l = edge[2];
                //记录相邻点的距离
                graph[s].Add(new int[] { e, l });
                graph[e].Add(new int[] { s, l });
            }

            for (int i = 0; i < r.Length; i++)
            {
                //统计左边合法的节点 前面遍历过的节点
                int left = 0;
                //遍历子节点
                foreach (var e in graph[i])
                {
                    //查询能被整除的路径子节点
                    //e[0]存的是子节点 e[1]存的是距离
                    int count = DFS(e[0], i, e[1] % signalSpeed, signalSpeed, graph);
                    //能通信服务器等于左边全部的乘上新的
                    r[i] += left * count;
                    //累加合法的节点
                    left += count;
                }
            }

            return r;
        }

        /// <summary>
        ///
        /// </summary>
        /// <param name="p">子节点</param>
        /// <param name="root">根节点</param>
        /// <param name="curr">距离求模</param>
        /// <param name="signalSpeed">除数</param>
        /// <param name="graph">图</param>
        /// <returns></returns>
        private int DFS(int p, int root, int curr, int signalSpeed, IList<int[]>[] graph)
        {
            int res = 0;
            //能被整除说明可以到达根节点
            if (curr == 0)
            {
                res++;
            }

            //递归遍历子节点
            foreach (int[] e in graph[p])
            {
                int v = e[0];
                int cost = e[1];
                if (v != root)
                {
                    res += DFS(v, p, (curr + cost) % signalSpeed, signalSpeed, graph);
                }
            }
            return res;
        }
    }
}