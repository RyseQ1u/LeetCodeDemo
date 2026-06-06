package leet.methods._1_linklist.review.L138;


import leet._class.linklist.Node;

import java.util.HashMap;

public class Leet138_r6 {

    /// 随机链表的复制
    public Node copyRandomList(Node head) {
        HashMap<Node, Node> map = new HashMap<>();
        Node cur = head;
        while (cur!=null){
            map.put(cur,new Node(cur.val));
            cur=cur.next;
        }
        cur=head;
        while (cur!=null){
            Node newNode = map.get(cur);
            newNode.val=cur.val;
            newNode.next=map.get(cur.next);
            newNode.random=map.get(cur.random);
            cur=cur.next;
        }
        return map.get(head);
    }

}
