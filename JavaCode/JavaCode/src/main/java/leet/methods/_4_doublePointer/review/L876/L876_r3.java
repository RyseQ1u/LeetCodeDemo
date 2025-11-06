package leet.methods._4_doublePointer.review.L876;

import leet._class.linklist.ListNode;

public class L876_r3 {
    public ListNode middleNode(ListNode head) {
        ListNode fast =head,slow =head;
        int count = 0;
        while (fast!=null){
            if((count&1) == 1){
                slow = slow.next;
            }
            fast=fast.next;
            count++;
        }
        return slow;
    }
}
