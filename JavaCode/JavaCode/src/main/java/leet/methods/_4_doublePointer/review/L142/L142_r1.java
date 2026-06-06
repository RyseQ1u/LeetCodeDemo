package leet.methods._4_doublePointer.review.L142;
import leet._class.linklist.ListNode;

/**
 * 环形链表
 * 寻找链表中可能存在的环节点
 */
public class L142_r1 {
    public ListNode detectCycle(ListNode head) {
        //快慢指针
        ListNode slow = head;
        ListNode fast = head;
        //找第一次交点 没有代表无交点
        while (true){
            if(fast==null || fast.next==null) return null;
            fast=fast.next.next;
            slow=slow.next;
            //代表找到了交点
            if(fast==slow)break;
        }
        //寻找链表交点
        fast = head;
        while (fast != slow){
            fast=fast.next;
            slow=slow.next;
        }
        return fast;
    }
}
