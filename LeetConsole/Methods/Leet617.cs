using LeetCode.Class;
using System;
using System.Collections.Generic;

namespace ConsoleApp3.Methods
{
    /// <summary>
    /// 617
    /// </summary>
    public class Leet617
    {
        public TreeNode Action()
        {
            var root1 = new TreeNode(1, new TreeNode(3, new TreeNode(5)), new TreeNode(2));
            var root2 = new TreeNode(2, new TreeNode(1, null, new TreeNode(4)), new TreeNode(3, null, new TreeNode(7)));
            return MergeTrees2(root1, root2);
        }

        public TreeNode MergeTrees(TreeNode root1, TreeNode root2)
        {
            Stack<TreeNode> s = new Stack<TreeNode>();
            TreeNode treeNode = new TreeNode();
            TreeNode curNode = root1;
            s.Push(root1);
            while (s.Count > 0)
            {
                Console.WriteLine(curNode.val);
                if (curNode.right != null)
                {
                    s.Push(curNode.right);
                }
                if (curNode.left != null)
                {
                    curNode = curNode.left;
                }
                else
                {
                    //左子树访问完了，访问右子树
                    curNode = s.Pop();
                }
            }
            return treeNode;
        }

        public TreeNode MergeTrees2(TreeNode root1, TreeNode root2)
        {
            TreeNode treeNode = new TreeNode();
            var l1 = PreOrder1(root1);
            var l2 = PreOrder1(root2);
            bool f = true;
            int n = 0;
            var l3 = new List<int>();
            while (f)
            {
                int t = 0;
                if (l1.Count > n)
                {
                    t += l1[n];
                    f = true;
                }
                else
                {
                    f = false;
                }
                if (l2.Count > n)
                {
                    t += l2[n];
                    f = true;
                }
                else
                {
                    f = false;
                }
                l3.Add(t);
                n++;
            }

            return treeNode;
        }

        public TreeNode MergeTrees3(TreeNode root1, TreeNode root2)
        {
            TreeNode treeNode = new TreeNode();
            var l1 = PreOrder1(root1);
            var l2 = PreOrder1(root2);
            for (int i = 0; i < l1.Count; i++)
            {
            }

            return treeNode;
        }

        private List<int> PreOrder1(TreeNode node)
        {
            List<int> rl = new List<int>();
            Queue<TreeNode> s = new Queue<TreeNode>();
            s.Enqueue(node);
            rl.Add(node.val);
            while (s.Count > 0)
            {
                TreeNode curNode = s.Dequeue();

                bool l = curNode.left != null;
                bool r = curNode.right != null;
                if (l)
                {
                    s.Enqueue(curNode.left);
                    rl.Add(curNode.left.val);
                }
                else
                {
                    rl.Add(0);
                }
                if (r)
                {
                    s.Enqueue(curNode.right);
                    rl.Add(curNode.right.val);
                }
                else
                {
                    rl.Add(0);
                    Console.WriteLine(0);
                }
            }
            return rl;
        }

        private TreeNode MakeTree1(List<int> l)
        {
            TreeNode t = new TreeNode(l[0]);
            TreeNode ct = new TreeNode();
            for (int i = 0; i < l.Count; i++)
            {
                if (i / 2 == 0)
                {
                    ct = new TreeNode(l[i]);
                }
                else
                {
                }
            }
            return t;
        }
    }
}