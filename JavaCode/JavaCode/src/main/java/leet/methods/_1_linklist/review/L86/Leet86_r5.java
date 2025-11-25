package leet.methods._1_linklist.review.L86;

import leet._class.linklist.ListNode;

public class Leet86_r5 {

    /// 分隔链表
    public ListNode partition(ListNode head, int x) {
        ListNode big = new ListNode(0),curBig = big;
        ListNode samll = new ListNode(0),curSmall = samll;
        ListNode cur = head;
        while (cur !=null){
            if(cur.val<x){
                curSmall.next =cur;
                curSmall=curSmall.next;
            }else {
                curBig.next = cur;
                curBig= curBig.next;
            }
            cur=cur.next;
        }
        curBig.next=null;
        curSmall.next = big.next;
      return samll.next;
    }

}
