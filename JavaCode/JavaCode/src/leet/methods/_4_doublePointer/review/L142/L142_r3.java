package leet.methods._4_doublePointer.review.L142;

import leet._class.linklist.ListNode;

/**
 * 环形链表
 * 寻找链表中可能存在的环节点
 */
public class L142_r3 {
    public ListNode detectCycle(ListNode head) {
        //快慢指针
        ListNode f = head, s = head;
        //第一次遍历寻找交点
        while (true) {
            if (f.next == null || f.next.next == null) {
                return null;
            }
            f=f.next.next   ;
            s=s.next;
            if(f==s)break;
        }
        //寻找环节点
        f=head;
        while (f!=s){
            f=f.next;
            s=s.next    ;
        }

        return f;
    }
}
