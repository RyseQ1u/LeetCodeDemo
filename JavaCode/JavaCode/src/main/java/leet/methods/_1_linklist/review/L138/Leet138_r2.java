package leet.methods._1_linklist.review.L138;


import leet._class.linklist.Node;

import java.util.HashMap;

public class Leet138_r2 {

    /// 随机链表的复制
    public Node copyRandomList(Node head) {
        ///记录新旧节点映射关系
        HashMap<Node, Node> map = new HashMap<>();
        Node cur = head;
        ///复制链表
        while (cur!=null){
            map.put(cur,new Node(cur.val));
            cur=cur.next;
        }
        cur=head;
        /// 更新新节点的映射关系
        while (cur!=null){
            map.get(cur).next = map.get(cur.next);
            map.get(cur).random   =map    .get(cur.random);
            cur=cur.next;
        }
        return map.get(head);
    }

}
