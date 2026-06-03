package leet.methods._4_doublePointer.review.L876;

import leet._class.linklist.ListNode;

public class L876_r8 {
    public ListNode middleNode(ListNode head) {
        //快慢指针
        ListNode fast = head,slow = head;
        while (fast!=null &&fast.next!=null){

            fast = fast.next.next;
            slow=slow.next;
        }
        return slow;
    }
}
