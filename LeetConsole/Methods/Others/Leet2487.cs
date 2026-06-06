using LeetCode.Class;

namespace ConsoleApp3.Methods
{
    /// <summary>
    ///Method2487
    /// </summary>
    public class Leet2487
    {
        public ListNode Action()
        {
            //string s1 = "acb", s2 = "ab";
            //int n1 = 4, n2 = 2;
            //var head = new ListNode(5, new ListNode(2, new ListNode(13, new ListNode(3, new ListNode(8,new ListNode(15))))));
            //var head = new ListNode(5, new ListNode(2, new ListNode(13, new ListNode(3, new ListNode(8)))));
            var head = new ListNode(1, new ListNode(1, new ListNode(1, new ListNode(1))));
            return RemoveNodes2(head);
        }

        /// <summary>
        /// 超时
        /// </summary>
        /// <param name="head"></param>
        /// <returns></returns>
        public ListNode RemoveNodes(ListNode head)
        {
            var max = head;
            var cur = head;
            while (cur != null)
            {
                if (max.val < cur.val)
                {
                    max = cur;
                }
                cur = cur.next;
            }
            if (max.next != null)
            {
                max.next = RemoveNodes(max.next);
            }
            return max;
        }

        public ListNode RemoveNodes2(ListNode head)
        {
            if (head == null)
            {
                return null;
            }
            head.next = RemoveNodes2(head.next);
            if (head.next != null && head.val < head.next.val)
            {
                return head.next;
            }
            else
            {
                return head;
            }
        }

        public ListNode Compare(ListNode node1, ListNode node2)
        {
            var cur = node1;
            while (cur != null)
            {
                if (cur.val == node2.val) break;
                //点2比当前点大 则替换链表头尾元素
                if (node2.val > cur.val)
                {
                    cur.val = node2.val;
                    cur.next = node2.next;
                    break;
                }
                cur = cur.next;
            }
            return node1;
        }
    }
}