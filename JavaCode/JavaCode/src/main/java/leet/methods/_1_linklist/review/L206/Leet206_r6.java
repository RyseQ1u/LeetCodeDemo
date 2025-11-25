package leet.methods._1_linklist.review.L206;

import leet._class.linklist.ListNode;

public class Leet206_r6 {

    ///反转链表 迭代循环实现
    public ListNode reverseList(ListNode head) {
        ListNode cur = head;
        ListNode pre = null;
        while (cur!=null){
            //暂存下一个节点
            ListNode tmp = cur.next;
            //将上一节点移到下一节点
            cur.next =pre;
            //将当前节点当成上一节点
            pre = cur;
            //遍历
            cur =tmp;
        }
        return pre;
    }

    /// 反转链表 递归
    public ListNode reverseList2(ListNode head) {
        return reverse(head, null);
    }

    private ListNode reverse(ListNode cur, ListNode pre) {
        if(cur==null) return pre;
        ListNode res = reverse(cur.next,pre);
        cur.next = pre;
        return res;
    }


}
