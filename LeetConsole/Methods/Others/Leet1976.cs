using LeetCode.Class;
using System.Collections.Generic;

namespace Leet.Methods
{
    /// <summary>
    ///
    /// </summary>
    public class Leet1976
    {
        public bool Action()
        {
            //var postorder = new int[] { 3, 9, 20, 15, 7 };
            //var inorder = new int[] { 9, 3, 15, 20, 7 };

            //var r = KthLargestLevelSum(new TreeNode(5,
            //    new TreeNode(8,new TreeNode(2,new TreeNode(4),new TreeNode(6)),new TreeNode(1)),new TreeNode(9,new TreeNode(3),new TreeNode(7)))
            //    ,2);
            //var r = ValidPartition(new int[] { 4, 4, 4, 5, 6 });
            //MyQueue myQueue = new MyQueue();
            var r = CountPaths(7, new int[][] { new int[] { 0, 6, 7 }, new int[] { 0, 1, 2 }, new int[] { 1, 2, 3 }, new int[] { 1, 3, 3 }, new int[] { 6, 3, 3 }, new int[] { 3, 5, 1 }, new int[] { 6, 5, 1 }, new int[] { 2, 5, 1 }, new int[] { 0, 4, 5 }, new int[] { 4, 6, 2 } });
            return false;
        }

        public int CountPaths(int n, int[][] roads)
        {
            int r = 0;
            var node = new Node(0, new List<Node>());
            var q = new Queue<Node>();
            var parentQ = new Queue<Node>();
            var hs = new HashSet<int>();
            q.Enqueue(node);
            while (q.Count > 0)
            {
                var tc = q.Count;
                for (int i = 0; i < tc; i++)
                {
                    var curNode = q.Dequeue();
                    if (curNode.val == n - 1) continue;
                    for (int j = 0; j < roads.Length; j++)
                    {
                        //if (hs.Contains(j)) continue;
                        if (roads[j][0] == curNode.val)
                        {
                            if (curNode.pval == roads[j][1]) continue;
                            var c1 = new Node(roads[j][1], new List<Node>(), curNode.val);
                            curNode.children.Add(c1);
                            q.Enqueue(c1);
                            //hs.Add(j);
                        }
                        else if (roads[j][1] == curNode.val)
                        {
                            if (curNode.pval == roads[j][0]) continue;
                            var c2 = new Node(roads[j][0], new List<Node>(), curNode.val);
                            curNode.children.Add(c2);
                            q.Enqueue(c2);
                            //hs.Add(j);
                        }
                    }
                }
            }

            return r;
        }
    }
}