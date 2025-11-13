package leet.methods._4_doublePointer.review.L142;
import leet._class.linklist.ListNode;

/**
 * 环形链表
 * 寻找链表中可能存在的环节点
 */
public class L142_r4 {
    public ListNode detectCycle(ListNode head) {
        //使用快慢指针寻找是否存在环
        ListNode f= head,s = head;
        while (true){
            if(f==null || f.next==null) return null;
            f=f.next.next;
            s=s.next;
            if(f==s)break;
        }
        //此时列表中有环 快慢指针在环中相遇
        //重置快指针寻找入口
        f=head;
        while (f!=s){
            f=f.next;
            s=s.next;
        }
        return f;
    }
}
