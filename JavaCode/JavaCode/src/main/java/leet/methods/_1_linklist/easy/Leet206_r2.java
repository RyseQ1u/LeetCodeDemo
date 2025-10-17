package leet.methods._1_linklist.easy;

import leet._class.linklist.ListNode;

public class Leet206_r2 {

    ///反转链表 迭代循环实现
    public ListNode reverseList(ListNode head) {
            ListNode pre= null;
            ListNode cur= head;
            while (cur!=null){
                ListNode next = cur.next;
                cur.next = pre;
                pre = next;
                cur=next;
            }
            return pre;
    }

    /// 反转链表 递归
    public ListNode reverseList2(ListNode head) {
        return reverse(head, null);
    }

    private ListNode reverse(ListNode cur, ListNode pre) {
        if(cur==null) return pre;
        ListNode res = reverse(cur.next ,cur);
        cur.next = pre;
        return res;
    }


}
