package leet.methods._15_test.L146;

import java.util.HashMap;

public class Leet146_r6 {
    class LRUCache {

        class DBListNode{
            public DBListNode pre ;
            public DBListNode next ;
            public int key;
            public int value;

            public DBListNode(int  key, int value) {
                this.key = key;
                this.value = value;
            }

            public DBListNode() {
            }
        }

        private final DBListNode head;
        private final DBListNode tail;
        private final HashMap<Integer,DBListNode> map;
        private final int capacity;
        private int size;

        public LRUCache(int capacity) {
            head = new DBListNode();
            tail = new DBListNode();
            map = new HashMap<>(capacity);
            this.capacity = capacity;
            size= 0;
            head.next = tail;
            tail.pre =head;
        }

        public int get(int key) {
            if(map.containsKey(key)){
                DBListNode node = map.get(key);
                moveToHead(node);
                return node.value;
            }else {

            return -1;
            }
        }

        public void put(int key, int value) {
            if(map.containsKey(key)){
                DBListNode node = map.get(key);
                node.value = value;
                moveToHead(node);
            }else {
                DBListNode node = new DBListNode(key,value);
                map.put(key,node);
                addToHead(node);
                size++;
                if(size>capacity){
                    DBListNode remove = removeLast();
                    map.remove(remove.key);
                    size--;
                }
            }
        }

        private  void addToHead(DBListNode node){
            node.pre = head;
            node.next = head.next;
            head.next.pre = node;
            head.next = node;
        }

        private void removeNode(DBListNode node){
            node.next.pre = node.pre;
            node.pre.next=node.next;
        }

        private DBListNode removeLast(){
            DBListNode tmp = tail.pre;
            removeNode(tmp);
            return tmp;
        }
        private void moveToHead(DBListNode node){
             removeNode(node);
             addToHead(node);
        }
    }
}
