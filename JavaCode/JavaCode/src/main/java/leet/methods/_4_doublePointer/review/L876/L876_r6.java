package leet.methods._4_doublePointer.review.L876;

import leet._class.linklist.ListNode;

public class L876_r6 {
    public ListNode middleNode(ListNode head) {
        ListNode mid = head;
        while (head!=null){
            if(head.next==null) break;
            head = head.next.next;
            mid = mid.next;
        }
        return mid;
    }
}
