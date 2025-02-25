using System;
using System.Collections.Generic;
using System.Linq;

namespace Leet.Methods
{
    /// <summary>
    ///
    /// </summary>
    public class Leet2673
    {
        public int Action()
        {
            //var postorder = new int[] { 3, 9, 20, 15, 7 };
            //var inorder = new int[] { 9, 3, 15, 20, 7 };

            //var r = KthLargestLevelSum(new TreeNode(5,
            //    new TreeNode(8,new TreeNode(2,new TreeNode(4),new TreeNode(6)),new TreeNode(1)),new TreeNode(9,new TreeNode(3),new TreeNode(7)))
            //    ,2);
            var r = MinIncrements2(7, new int[] { 1, 5, 2, 2, 3, 3, 1 });
            return r;
        }

        public int MinIncrements2(int n, int[] cost)
        {
            int ans = 0;
            for (int i = n - 2; i > 0; i -= 2)
            {
                ans += Math.Abs(cost[i] - cost[i + 1]);
                // 叶节点 i 和 i+1 的双亲节点下标为 i/2（整数除法）
                cost[i / 2] += Math.Max(cost[i], cost[i + 1]);
            }
            return ans;
        }

        public int MinIncrements(int n, int[] cost)
        {
            int r = 0;
            Queue<int> q = new Queue<int>();
            q.Enqueue(cost[0]);
            //层数
            int h = (int)Math.Ceiling(Math.Log(n + 1, 2));
            int leftIndex = 1;
            for (int i = 1; i < h; i++)
            {
                //每层数量
                int m = (int)Math.Pow(2, i);
                //每两个子节点 从队列弹出一个父节点相加
                int t = 0;
                for (int j = 0; j < m; j++)
                {
                    if (j % 2 == 0) t = q.Dequeue();
                    q.Enqueue(cost[leftIndex + j] + t);
                }
                leftIndex += m;
            }
            int max = q.Max();
            int qc = q.Count;
            for (int i = 0; i < qc; i++)
            {
                q.Enqueue(max - q.Dequeue());
            }
            for (int i = h - 1; i > 0; i--)
            {
                //每层数量
                int m = (int)Math.Pow(2, i);
                int t = 0;
                int t2 = 0;

                for (int j = 0; j < m / 2; j++)
                {
                    t = q.Dequeue();
                    t2 = q.Dequeue();
                    if (t > t2)
                    {
                        q.Enqueue(t2);
                        r += t - t2;
                    }
                    else if (t < t2)
                    {
                        q.Enqueue(t);
                        r += t2 - t;
                    }
                    else
                    {
                        q.Enqueue(t);
                        r += t2 - t;
                    }
                }
            }

            return r;
        }
    }
}