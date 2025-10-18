package leet.methods._1_linklist.middle;

import leet._class.linklist.ListNode;

public class Leet237_r1 {

    /// 删除某个节点 直接夺舍next节点
    public void deleteNode(ListNode node) {
        node.val = node.next.val;
        node.next = node.next.next;
    }

}
