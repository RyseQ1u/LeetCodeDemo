package leet.methods._4_doublePointer.review.L142;
import leet._class.linklist.ListNode;

/**
 * 环形链表
 * 寻找链表中可能存在的环节点
 */
public class L142_r7 {
    public ListNode detectCycle(ListNode head) {
        if(head==null)return null;
        //快慢指针寻找环点
        ListNode fast=head,slow=head;
        while (true){
            if(fast.next==null||fast.next.next==null)return null;
            fast= fast.next.next;
            slow= slow.next;
            if(fast==slow)break;
        }
        fast = head;
        while (fast!=slow){
            fast= fast.next;
            slow= slow.next;
        }
        return fast;
    }
}
