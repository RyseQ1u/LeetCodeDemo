package leet.methods.easy;

import leet._class.ListNode;

import java.util.Stack;

public class Leet206 {

    ///迭代实现
    public ListNode reverseList(ListNode head) {
        //遍历，交换指针
        //上一个节点
        ListNode last = null;
        //当前节点
        ListNode cur = head;
        while (cur != null) {
            //取出下一个节点
            ListNode next = cur.next;
            //反转 将下一个节点替换为上一个节点
            cur.next = last;
            //将当前节点设置为上一个节点
            last = cur;
            //将下一个节点作为当前节点
            cur = next;
        }
        return last;
    }

    public ListNode reverseList2(ListNode head) {
        return reverse(head, null);
    }
    private ListNode reverse(ListNode cur, ListNode pre) {
        //终止条件 遍历到最后一个节点
        if (cur == null) return pre;
        //递归后继节点
        ListNode res = reverse(cur.next, cur);
        //反转 修改节点引用
        cur.next = pre;
        //尾节点成为头节点
        return res;
    }
    
}
