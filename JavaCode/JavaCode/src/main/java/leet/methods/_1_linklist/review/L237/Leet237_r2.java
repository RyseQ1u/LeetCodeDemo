package leet.methods._1_linklist.review.L237;

import leet._class.linklist.ListNode;

public class Leet237_r2 {

    /// 删除某个节点 直接夺舍next节点
    public void deleteNode(ListNode node) {
        node.next = node.next.next;
        node.val = node.next.val;
    }

}
