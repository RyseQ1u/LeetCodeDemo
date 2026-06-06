package leet.methods._4_doublePointer.review.L160;

import leet._class.linklist.ListNode;

public class L160_r1 {
    public ListNode getIntersectionNode(ListNode headA, ListNode headB) {
        ListNode a= headA, b= headB;
        while (a!=b){
            a =a==null? headB:  a.next;
            b = b==null? headA :b.next;
        }
        return a;
    }
}
