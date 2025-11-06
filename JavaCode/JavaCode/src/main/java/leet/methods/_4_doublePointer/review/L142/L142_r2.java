package leet.methods._4_doublePointer.review.L142;
import leet._class.linklist.ListNode;

/**
 * 环形链表
 * 寻找链表中可能存在的环节点
 */
public class L142_r2 {
    public ListNode detectCycle(ListNode head) {
        //快慢指针寻找交点
        ListNode fast = head,slow = head;
        while (true){
            //代表列表遍历完毕 没有发现环
            if(fast==null || fast.next==null) return null;
            fast=fast.next.next;
            slow=slow.next;
            if(slow==fast)break;
        }
        //此时两个节点位于相交节点
        //快节点多走的步长刚好等于起点到环节点的距离
        fast=head;
        while (fast!=slow){
            fast=fast.next;
            slow=slow.next;
        }
        return fast;
    }
}
