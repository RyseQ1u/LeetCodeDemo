package leet.methods._1_linklist.review.L138;


import leet._class.linklist.Node;

import java.util.HashMap;

public class Leet138_r1 {

    /// 随机链表的复制
    public Node copyRandomList(Node head) {
        if(head==null)return null;
        Node cur = head;
        HashMap<Node,Node> map = new HashMap<>();
        while (cur!=null){
            map.put(cur,new Node(cur.val));
            cur= cur.next;
        }
        cur = head;
        while (cur!=null){
            map.get(cur).random =map.get(cur.random);
            map.get(cur).next =map.get(cur.next);
            cur=cur.next;
        }
        return map.get(head);
    }

}
