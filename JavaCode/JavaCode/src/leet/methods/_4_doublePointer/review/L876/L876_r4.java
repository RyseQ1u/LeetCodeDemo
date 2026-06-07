package leet.methods._4_doublePointer.review.L876;

import leet._class.linklist.ListNode;

public class L876_r4 {
    public ListNode middleNode(ListNode head) {
        int count = 0;
        //快慢指针 快指针走两步 慢指针走一步
        ListNode f = head,s = head;
        while (f!=null){
            f=f.next;
            count++;
            if((count&1)==0){
                s=s.next;
            }
        }
        return s;
    }
}
