package leet.methods._1_linklist.review.L86;

import leet._class.linklist.ListNode;

public class Leet86_r4 {

    /// 分隔链表
    public ListNode partition(ListNode head, int x) {
        ListNode big = new ListNode(0),curBig = big;
        ListNode small = new ListNode(0),curSmall = small;
        while (head!=null){
            if(head.val<x){
                small.next = head;
                small=small.next;
            }else {
                big.next = head;
                big=big.next;
            }
            head=head.next;
        }
        //合并 收尾
        big.next=null;
        small.next = curBig.next;
        return curSmall.next;
    }

}
