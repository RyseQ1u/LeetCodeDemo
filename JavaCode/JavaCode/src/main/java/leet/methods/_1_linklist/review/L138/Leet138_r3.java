package leet.methods._1_linklist.review.L138;


import leet._class.linklist.Node;

import java.util.HashMap;
import java.util.Map;

public class Leet138_r3 {

    /// 随机链表的复制
    public Node copyRandomList(Node head) {
        // 记录旧节点到新节点的映射
        HashMap<Node, Node> map = new HashMap<>();
        Node cur = head;
        // 第一次遍历，复制节点并建立映射
        while (cur != null) {
            map.put(cur, new Node(cur.val));
            cur = cur.next;
        }
        cur = head;
        // 第二次遍历，设置next和random指针
        while (cur != null) {
            //新节点
            Node newNode = map.get(cur);
            // 设置next和random指针
            newNode.next = map.get(cur.next);
            newNode.random = map.get(cur.random);
            cur = cur.next;
        }
        return map.get(head);
    }

}
