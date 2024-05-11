using ConsoleApp1.Class;
using System;
using System.Collections.Generic;
using System.ComponentModel.Design;
using System.Linq;
using System.Timers;

namespace ConsoleApp1.Methods
{
    public class Leet2385
    {
        private TreeNode startNode;
        private Dictionary<TreeNode, TreeNode> fa = new();

        public int Action()
        {
            TreeNode treeNode = new TreeNode(1, new TreeNode(5, null, new TreeNode(4, new TreeNode(9), new TreeNode(2)))
                                            , new TreeNode(3, new TreeNode(10), new TreeNode(6)));
            //var r = AmountOfTime(treeNode, 3);
            //TreeNode treeNode = new TreeNode(1, new TreeNode(2, new TreeNode(3, new TreeNode(4, new TreeNode(5)))));
            var r = amountOfTime(treeNode, 6);

            return r;
        }

        public int amountOfTime(TreeNode root, int start)
        {
            dfs(root, null, start);
            return maxDepth(startNode, startNode);
        }

        private void dfs(TreeNode node, TreeNode from, int start)
        {
            if (node == null)
            {
                return;
            }
            fa.Add(node, from); // 记录每个节点的父节点
            if (node.val == start)
            {
                startNode = node; // 找到 start
            }
            dfs(node.left, node, start);
            dfs(node.right, node, start);
        }

        private int maxDepth(TreeNode node, TreeNode from)
        {
            if (node == null)
            {
                return -1; // 注意这里是 -1，因为 start 的深度为 0
            }
            int res = -1;
            if (node.left != from)
            {
                res = Math.Max(res, maxDepth(node.left, node));
            }
            if (node.right != from)
            {
                res = Math.Max(res, maxDepth(node.right, node));
            }
            if (fa[node] != from)
            {
                res = Math.Max(res, maxDepth(fa[node], node));
            }
            return res + 1;
        }

        public int AmountOfTime(TreeNode root, int start)
        {
            int r = 0;
            var ll = -1;
            var rl = -1;
            //对左右树节点进行层序遍历
            var left = FindAndCalculateLevels(root.left, start, out ll);
            var right = FindAndCalculateLevels(root.right, start, out rl);
            if (root.val == start)
            {
                if (left == 0 && right == 0)
                {
                    r = 0;
                }
                else
                {
                    r = left > right ? left : right;
                }
            }
            else if (ll > 0)
            {
                r = left - ll > right + ll ? left - ll : right + ll;
            }
            else if (rl > 0)
            {
                r = right - rl > left + rl ? right - rl : left + rl;
            }
            return r;
        }

        /// <summary>
        /// 层序遍历，并查找是否存在目标
        /// </summary>
        /// <param name="root"></param>
        /// <param name="targetVal"></param>
        /// <returns></returns>
        public int FindAndCalculateLevels(TreeNode root, int targetVal, out int targetLevel)
        {
            targetLevel = -1;
            if (root == null) return 0; // 如果树为空，返回-1表示未找到

            // 使用队列进行层次遍历，同时记录层数
            Queue<(TreeNode, int)> queue = new Queue<(TreeNode, int)>();
            queue.Enqueue((root, 1)); // 根节点入队，层数为1
            int level = 0;
            while (queue.Count > 0)
            {
                var (currentNode, currentLevel) = queue.Dequeue();
                if (currentNode.val == targetVal)
                {
                    // 找到目标节点，返回其层数
                    targetLevel = currentLevel;
                }
                if (currentNode.left != null)
                {
                    queue.Enqueue((currentNode.left, currentLevel + 1));
                }
                if (currentNode.right != null)
                {
                    queue.Enqueue((currentNode.right, currentLevel + 1));
                }
                level = currentLevel;
            }

            return level; // 遍历完未找到目标节点，返回-1
        }
    }
}