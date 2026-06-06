package leet.methods._1_linklist.review.L86;

import leet._class.linklist.ListNode;

public class Leet86_r6 {

    /// 分隔链表
    public ListNode partition(ListNode head, int x) {
        //大小链表
        ListNode big = new ListNode(0),curBig = big;
        ListNode small = new ListNode(0),curSmall = small;
        while (head!=null){
            if(head.val<x){
                curSmall.next=head;
                curSmall=curSmall.next;
            }else {
                curBig.next=head;
                curBig= curBig.next;
            }
            head=head.next;
        }
        curBig.next=null;
        curSmall.next=big.next;
        return small.next;
    }

}
