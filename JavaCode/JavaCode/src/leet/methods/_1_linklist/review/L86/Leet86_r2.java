package leet.methods._1_linklist.review.L86;

import leet._class.linklist.ListNode;

public class Leet86_r2 {

    /// 分隔链表
    public ListNode partition(ListNode head, int x) {
        //使用大小链表
        ListNode small = new ListNode(0);
        ListNode big = new ListNode(0);
        ListNode curSmall = small;
        ListNode curbig = big;
        //遍历节点
        while (head!=null){
            if(head.val<x){
                curSmall.next = head;
                curSmall = curSmall.next;
            }else {
                curbig.next = head;
                curbig = curbig.next;
            }
            head = head.next;
        }
        //合并链表
        curSmall.next = big.next;
        //收尾
        curbig.next = null;
        return small.next;
    }

}
