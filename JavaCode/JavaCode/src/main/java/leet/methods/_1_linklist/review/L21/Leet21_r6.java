package leet.methods._1_linklist.review.L21;

import leet._class.linklist.ListNode;


/// 将两个升序链表合并为一个新的 升序 链表并返回。新链表是通过拼接给定的两个链表的所有节点组成的。
public class Leet21_r6 {
    public ListNode mergeTwoLists(ListNode list1, ListNode list2) {
        if(list1==null)return list2;
        if(list2==null)return list1;
        ListNode res = list1.val<list2.val?list1:list2;
        res.next =  list1.val < list2.val ? mergeTwoLists(list1.next,list2) : mergeTwoLists(list1,list2.next);
        return res;
    }

    public ListNode mergeTwoListsIteration(ListNode list1, ListNode list2) {
        if(list1==null)return list2;
        if(list2==null)return list1;
        ListNode res = new ListNode(0);
        ListNode head = res;
        while (list1!=null && list2!=null){
            if(list1.val < list2.val){
                res.next=list1;
                list1=list1.next;
            }else {
                res.next=list2;
                list2=list2.next;
            }
            res=res.next;
        }
        if(list1==null)res.next=list2;
        if(list2==null)res.next=list1;
        return head.next;
    }
}
