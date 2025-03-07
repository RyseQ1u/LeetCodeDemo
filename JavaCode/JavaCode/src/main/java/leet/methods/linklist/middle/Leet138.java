package leet.methods.linklist.middle;


import leet._class.linklist.Node;

import java.util.HashMap;
import java.util.Map;

public class Leet138 {

    /// 随机链表的复制
    public Node copyRandomList(Node head) {
        if (head == null){return null;}
        Node cur = head;
        //存贮新旧节点 key旧节点 value复制的新节点
        //因为可能存在相同value的节点，所以key的存放的是整个node对象
        Map<Node,Node> map = new HashMap<Node,Node>();
        //复制节点
        while (cur != null){
            map.put(cur,new Node(cur.val));
            //遍历链表
            cur = cur.next;
        }
        cur = head;
        //更新链表里的引用对象
        while (cur != null){
            //设置新节点的next

            map.get(cur).next = map.get(cur.next);
            //设置新节点的random
            map.get(cur).random = map.get(cur.random);
            cur = cur.next;
        }
        //返回新新的头节点
        return map.get(head);
    }

}
