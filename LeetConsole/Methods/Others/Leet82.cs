using LeetCode.Class;
using System.Collections.Generic;
using System.Linq;

namespace ConsoleApp3.Methods
{
    /// <summary>
    ///Method82
    /// </summary>
    public class Leet82
    {
        public ListNode Action()
        {
            //string s1 = "acb", s2 = "ab";
            //int n1 = 4, n2 = 2;
            var head = new ListNode(1, new ListNode(2, new ListNode(3, new ListNode(3, new ListNode(4, new ListNode(4, new ListNode(5)))))));
            //var head = new ListNode(5, new ListNode(2, new ListNode(13, new ListNode(3, new ListNode(8)))));
            //var head = new ListNode(1, new ListNode(1, new ListNode(1, new ListNode(1))));
            return DeleteDuplicates(head);
        }

        /// <summary>
        /// 超时
        /// </summary>
        /// <param name="head"></param>
        /// <returns></returns>
        public ListNode DeleteDuplicates(ListNode head)
        {
            var cur = head;
            Dictionary<int, int> ky = new Dictionary<int, int>();
            while (cur != null)
            {
                if (ky.ContainsKey(cur.val))
                {
                    ky[cur.val]++;
                }
                else
                {
                    ky.Add(cur.val, 1);
                }
                cur = cur.next;
            }
            var list = ky.Where(p => p.Value == 1).Select(p => p.Key).OrderByDescending(p => p).ToList();

            ListNode h = null;
            foreach (var item in list)
            {
                ListNode p = new ListNode(item);
                p.next = h;
                h = p;
            }

            return h;
        }
    }
}