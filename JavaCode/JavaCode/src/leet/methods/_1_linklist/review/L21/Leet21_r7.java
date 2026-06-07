package leet.methods._1_linklist.review.L21;

import leet._class.linklist.ListNode;

/// 将两个升序链表合并为一个新的 升序 链表并返回。新链表是通过拼接给定的两个链表的所有节点组成的。
public class Leet21_r7 {
    public ListNode mergeTwoLists(ListNode list1, ListNode list2) {
        if(list1==null)return list2;
        if(list2==null)return list1;
        ListNode head=list2;
        if (list1.val<list2.val){
            head = list1;
        }
        head.next = list1.val<list2.val ? mergeTwoLists(list1.next,list2):mergeTwoLists(list1,list2.next);
        return head;
    }

    public ListNode mergeTwoListsIteration(ListNode list1, ListNode list2) {
        return null;
    }
}
