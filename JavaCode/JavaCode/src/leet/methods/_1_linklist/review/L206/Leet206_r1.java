package leet.methods._1_linklist.review.L206;

import leet._class.linklist.ListNode;

public class Leet206_r1 {

    ///反转链表 迭代循环实现
    public ListNode reverseList(ListNode head) {
        ListNode last = null;
        ListNode cur = head;
        while (cur!=null){
            ListNode next = cur.next;
            cur.next = last;
            last =  cur;
            //遍历
            cur =  next;
        }
        return last;
    }

    /// 反转链表 递归
    public ListNode reverseList2(ListNode head) {
        return reverse(head, null);
    }
    private ListNode reverse(ListNode cur, ListNode pre) {
        if(cur==null)return pre ;
        ListNode res =reverse(cur.next,cur);
        cur.next =pre;
        return res;
    }
    
}
