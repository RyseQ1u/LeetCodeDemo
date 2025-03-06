package leet.methods.linklist.middle;

import leet._class.ListNode;

public class Leet237 {

    /// 删除某个节点
    public void deleteNode(ListNode node) {
        //将下一个节点的值赋值给当前节点
        node.val = node.next.val;
        //删除下一个节点
        node.next = node.next.next;
    }
    
}
