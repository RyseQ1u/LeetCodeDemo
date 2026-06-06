package leet.methods._1_linklist.review.L21;

import leet._class.linklist.ListNode;

public class Leet21_r5 {
    public ListNode mergeTwoLists(ListNode list1, ListNode list2) {
        if (list1 == null) return list2;
        if (list2 == null) return list1;
        ListNode res = list1.val < list2.val ? list1 : list2;
        res.next = mergeTwoListsIteration(res.next, list1.val >= list2.val ? list1 : list2);
        return res;
    }

    public ListNode mergeTwoListsIteration(ListNode list1, ListNode list2) {
        ListNode tmp = new ListNode(0);
        ListNode cur = tmp;
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
        cur.next = list1==null? list2:list1;
        return tmp.next;
    }
}
