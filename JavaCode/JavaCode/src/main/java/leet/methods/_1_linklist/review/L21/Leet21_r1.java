package leet.methods._1_linklist.review.L21;

import leet._class.linklist.ListNode;

public class Leet21_r1 {


    ///合并两个升序链 表 递归遍历链表
    public ListNode mergeTwoLists(ListNode list1, ListNode list2) {
        if (list2 == null)
            return list1;
        if(list1==null)
            return list2;
        ListNode res = list1.val > list2.val ? list2 : list1;
        res.next = mergeTwoLists(res.next,list1.val>=list2.val ?list1:list2);
        return res;
    }
}
