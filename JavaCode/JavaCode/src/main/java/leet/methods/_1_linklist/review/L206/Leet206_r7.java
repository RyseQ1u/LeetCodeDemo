package leet.methods._1_linklist.review.L206;

import leet._class.linklist.ListNode;

public class Leet206_r7 {

    /// 反转链表 递归
    public ListNode reverseList(ListNode head) {
        return reverse(head, null);
    }

    private ListNode reverse(ListNode cur, ListNode pre) {
        if (cur == null) return pre;
        ListNode res = reverse(cur.next, cur);
        cur.next = pre;
        return res;
    }

    /// 反转链表 迭代循环实现
    public ListNode reverseList_V2(ListNode head) {
        //上一个节点
        ListNode pre = null;
        while (head != null) {
            //缓存下一个节点
            ListNode nextTmp = head.next;
            head.next = pre;
            pre = head;
            //递归到下一个节点
            head = nextTmp;
        }
        return pre;
    }

}
