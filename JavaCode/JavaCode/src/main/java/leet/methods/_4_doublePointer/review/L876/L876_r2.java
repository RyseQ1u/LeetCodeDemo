package leet.methods._4_doublePointer.review.L876;

import leet._class.linklist.ListNode;

///链表的中点
/// 快慢指针 主链表走两步 中链表走一步
public class L876_r2 {
    public ListNode middleNode(ListNode head) {
        ListNode res = head;
        int count =0;
        while (head!=null){
            head=head.next;
            if((count++ & 1 )==0){
                res=res.next;
            }
        }
        return res;
    }
}
