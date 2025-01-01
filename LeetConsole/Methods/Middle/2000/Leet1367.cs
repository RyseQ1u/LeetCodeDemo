using LeetCode.Class;
using System;
using System.Collections.Generic;
using System.Linq;
using System.Text;

namespace LeetCode.Methods.Middle
{
    /// <summary>
    /// 1366
    /// </summary>
    public class Leet1367
    {
        public bool IsSubPath(ListNode head, TreeNode root)
        {
            if (root == null)
            {
                return false;
            }
            //子节点也可以作为起点
            return Dfs(root, head) || IsSubPath(head, root.left) || IsSubPath(head, root.right);
        }

        private bool Dfs(TreeNode rt, ListNode head)
        {
            // 链表已经全部匹配完，匹配成功
            if (head == null)
            {
                return true;
            }
            // 二叉树访问到了空节点，匹配失败
            if (rt == null)
            {
                return false;
            }
            // 当前匹配的二叉树上节点的值与链表节点的值不相等，匹配失败
            if (rt.val != head.val)
            {
                return false;
            }
            return Dfs(rt.left, head.next) || Dfs(rt.right, head.next);
        }

        //public bool IsSubPath(ListNode head, TreeNode root)
        //{
        //    //链表转list
        //    var list = new List<int>();
        //    while (head != null)
        //    {
        //        list.Add(head.val);
        //        head = head.next;
        //    }
        //    return dfs(list, root, 0) || dfs(list, root.left, 0) || dfs(list, root.right, 0);
        //}

        //private bool dfs(List<int> list, TreeNode root, int i)
        //{
        //    if (root == null) return false;
        //    if (root.val == list[i])
        //    {
        //        if (list.Count - 1 == i)
        //        {
        //            return true;
        //        }
        //        return dfs(list, root.left, i + 1) || dfs(list, root.right, i + 1);
        //    }
        //    else
        //    {
        //        //重新开始 i=0
        //        return dfs(list, root.left, 0) || dfs(list, root.right, 0);
        //    }
        //}
    }
}