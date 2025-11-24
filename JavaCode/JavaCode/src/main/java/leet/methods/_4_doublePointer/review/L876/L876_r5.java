package leet.methods._4_doublePointer.review.L876;

import leet._class.linklist.ListNode;

public class L876_r5 {
    public ListNode middleNode(ListNode head) {
        //快慢指针
        ListNode m = head;
        while (true){
            if(head==null  || head.next==null)break;
            head=head.next.next;
            m= m.next;
        }
        return m;
    }
}
