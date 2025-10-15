package leet.methods._1_linklist.easy;

import leet._class.linklist.ListNode;

import java.util.List;

public class Leet206_r1 {

    ///反转链表 迭代循环实现
    public ListNode reverseList(ListNode head) {
        ListNode last = null;
        ListNode cur = head;
        while (cur!=null){
            ListNode next = cur.next;
            cur.next = last;
            last =  cur;
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
        cur.next =res;
        return res;
    }
    
}
