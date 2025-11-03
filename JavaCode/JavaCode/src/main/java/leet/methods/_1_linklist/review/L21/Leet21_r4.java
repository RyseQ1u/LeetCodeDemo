package leet.methods._1_linklist.review.L21;

import leet._class.linklist.ListNode;

public class Leet21_r4 {
    public ListNode mergeTwoLists(ListNode list1, ListNode list2) {
        if (list2 == null) return list1;
        if (list1 == null) return list2;
        ListNode res = list1.val < list2.val ? list1 : list2;
        res.next = mergeTwoLists(res.next, list1.val >= list2.val ? list1 : list2);
        return res;
    }

    public ListNode mergeTwoListsIteration(ListNode list1, ListNode list2) {
        //虚拟头结点
        ListNode tmp = new ListNode(0);
        //用于遍历
        ListNode cur = tmp;
        //遍历两个链表，将值较小的节点连接到新链表
        //两个链表都不为空的时候
        while (list1 != null && list2 != null) {
            if (list1.val < list2.val) {
                cur.next = list1;
                list1 = list1.next;
            } else {
                cur.next = list2;
                list2 = list2.next;
            }
            cur = cur.next;
        }
        //将剩余的节点连接到新链表
        cur.next = list1 == null ? list2 : list1;
        return tmp.next;
    }
}
