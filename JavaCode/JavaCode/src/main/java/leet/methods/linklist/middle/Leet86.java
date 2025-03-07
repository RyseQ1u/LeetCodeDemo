package leet.methods.linklist.middle;

import leet._class.linklist.ListNode;

public class Leet86 {

    /// 分隔链表
    public ListNode partition(ListNode head, int x) {
        //创建两个链表存储数据
        // 记录两个链表起节点
        ListNode smallFirst = new ListNode(0), bigFirst = new ListNode(0);
        ListNode small = smallFirst,big = bigFirst;
        while (head != null) {
            //当前节点比 x 小
            if (head.val < x) {
                //进入 small 链表
                small.next = head;
                small = small.next;
            }else {
                //进入 big 链表
                big.next = head;
                big = big.next;
            }
            //递归遍历节点
            head = head.next;
        }
        //连接两个链表
        small.next = bigFirst.next;
        //big链表收尾
        big.next = null;
        //返回结果
        return smallFirst.next;
    }
    
}
