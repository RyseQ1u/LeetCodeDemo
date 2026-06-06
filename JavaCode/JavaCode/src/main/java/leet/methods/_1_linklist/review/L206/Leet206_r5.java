package leet.methods._1_linklist.review.L206;

import leet._class.linklist.ListNode;

public class Leet206_r5 {

    ///反转链表 迭代循环实现
    public ListNode reverseList(ListNode head) {
        //记录上一个节点
        ListNode pre = null;
        while (head!=null){
            ListNode tmp = head.next;
            head.next =pre;
            pre = head;
            head=tmp;
        }
        return pre;
    }

    /// 反转链表 递归
    public ListNode reverseList2(ListNode head) {
        return reverse(head, null);
    }

    private ListNode reverse(ListNode cur, ListNode pre) {
        if(cur==null)return pre;
        ListNode res = reverse(cur.next,cur);
        //将当前节点下一个元素的指针指向上一个元素
        cur.next =pre;
        return res;
    }


}
