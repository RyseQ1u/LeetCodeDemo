package leet.methods._1_linklist.review.L138;


import leet._class.linklist.Node;

import java.util.HashMap;

public class Leet138_r7 {

    /// 随机链表的复制
    public Node copyRandomList(Node head) {
        HashMap<Node, Node> map = new HashMap<>();
        //对每个节点映射
        Node cur = head;
        while (cur!=null){
            map.put(cur,new Node(cur.val));
            cur=cur.next;
        }
        cur =head;
        while (cur!=null){
            Node newCur = map.get(cur);
            newCur.random = map.get(cur.random);
            newCur.next = map.get(cur.next);
            cur=cur.next;
        }
        return map.get(head);
    }

}
