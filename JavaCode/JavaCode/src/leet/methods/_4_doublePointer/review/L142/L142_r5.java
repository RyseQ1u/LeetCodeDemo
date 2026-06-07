package leet.methods._4_doublePointer.review.L142;
import leet._class.linklist.ListNode;

/**
 * 环形链表
 * 寻找链表中可能存在的环节点
 */
public class L142_r5 {
    public ListNode detectCycle(ListNode head) {
        ListNode f= head;
        ListNode s = head;
        while (true){
            if(f == null || f.next == null) return null;
            f = f.next.next;
            s=s.next;
            if(f==s)break;
        }
        f = head;
        while (f!=s){
            f=f.next;
            s=s.next;
        }
        return f;
    }
}
