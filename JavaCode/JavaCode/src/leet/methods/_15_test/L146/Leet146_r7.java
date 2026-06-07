package leet.methods._15_test.L146;

import java.util.HashMap;

public class Leet146_r7 {
    class LRUCache {

        class DbListNode{
            public  DbListNode pre;
            public  DbListNode next;
            public int key;
            public int value;

            public DbListNode(int key, int value) {
                this.key = key;
                this.value = value;
            }

            public DbListNode() {
            }
        }

        //链表+Hashmap实现
        private final DbListNode head;
        private final DbListNode tail;
        private final HashMap<Integer,DbListNode> map;
        private final int capacity;
        private int size;
        public LRUCache(int capacity) {
            head = new DbListNode();
            tail = new DbListNode();
            map = new HashMap<>(capacity);
            this.capacity = capacity;
            this.size = 0;
            head.next=tail;
            tail.pre=head;
        }

        public int get(int key) {
            if(map.containsKey(key)){
                DbListNode node = map.get(key);
                moveToHead(node);
                return node.value;
            }
            return -1;
        }

        public void put(int key, int value) {
            if(map.containsKey(key)){
                DbListNode node = map.get(key);
                node.value=value;
                moveToHead(node);
            }else {
                DbListNode node = new DbListNode(key, value);
                addToHead(node);
                map.put(key,node);
                size++;
                if(size>capacity){
                    DbListNode removed = removeLast();
                    map.remove(removed.key);
                }
            }
        }

        //链表基本操作
        private  void addToHead(DbListNode node){
            node.pre = head;
            node.next = head.next;
            head.next.pre = node;
            head.next =  node;
        }
        private void removeNode(DbListNode node){
            node.pre.next = node.next;
            node.next.pre = node.pre;
        }
        private DbListNode removeLast() {
            DbListNode removed = tail.pre;
            removeNode(removed);
            return removed;
        }
        private void moveToHead(DbListNode node){
            removeNode(node);
            addToHead(node);
        }
    }
}
