package leet.methods._4_doublePointer.review.L876;

import leet._class.linklist.ListNode;

public class L876_r7 {
    public ListNode middleNode(ListNode head) {
        //快慢指针找中间节点
        ListNode fast = head,middle = head;
        while (fast!=null&&fast.next!=null){
            fast=fast.next.next;
            middle=middle.next;
        }
        return middle;
    }
}
