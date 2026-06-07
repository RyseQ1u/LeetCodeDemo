package leet.methods._1_linklist.review.L206;

import leet._class.linklist.ListNode;

public class Leet206_r9 {


    /// 反转链表 递归
    public ListNode reverseList(ListNode head) {
        return reverse(head, null);
    }

    private ListNode reverse(ListNode cur, ListNode pre) {
        if(cur==null)return pre;
        ListNode tmp = cur.next;
        cur.next = pre;
        return reverse(cur.next,cur);
    }

    ///反转链表 迭代循环实现
    public ListNode reverseList_V2(ListNode head) {
        return null;
    }

}
