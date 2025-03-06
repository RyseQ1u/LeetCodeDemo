package leet.methods.linklist.easy;

import leet._class.ListNode;

public class Leet21 {

    /// 有序合并两个链表有序链表 使用递归
    public ListNode mergeTwoLists(ListNode l1, ListNode l2) {
        //如果l1为空直接返回l2
        if (l1 == null) {
            return l2;
        }
        //如果l2为空直接返回l1
        else if (l2 == null) {
            return l1;
        }
        //
        else if (l1.val < l2.val) {
            l1.next = mergeTwoLists(l1.next, l2);
            return l1;
        } else {
            l2.next = mergeTwoLists(l1, l2.next);
            return l2;
        }
    }
}
