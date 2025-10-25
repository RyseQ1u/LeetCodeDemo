package leet.methods._1_linklist.review.L86;

import leet._class.linklist.ListNode;

public class Leet86_r3 {

    /// 分隔链表
    public ListNode partition(ListNode head, int x) {
        ListNode big = new ListNode(0);
        ListNode small = new ListNode(0);
        ListNode res = small;
        ListNode big2 = big;
        while (head != null) {
            if (head.val < x) {
                small.next = head;
                small = small.next;
            } else {
                big.next = head;
                big = big.next;
            }
            head = head.next;
        }
        /// 收尾
        big.next = null;
        small.next = big2.next;
        return res.next;
    }

}
