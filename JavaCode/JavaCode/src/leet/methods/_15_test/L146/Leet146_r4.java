package leet.methods._15_test.L146;

import java.util.HashMap;

public class Leet146_r4 {
    class LRUCache {

        class DLinkedListNode {
            public int key;
            public int value;
            public DLinkedListNode prev;
            public DLinkedListNode next;

            public DLinkedListNode() {
            }

            public DLinkedListNode(int key, int value) {
                this.key = key;
                this.value = value;
            }
        }

        HashMap<Integer, DLinkedListNode> map;
        DLinkedListNode head, tail;
        int size, capacity;

        public LRUCache(int capacity) {
            this.map = new HashMap<>(capacity);
            this.head = new DLinkedListNode();
            this.tail = new DLinkedListNode();
            this.size = 0;
            this.capacity = capacity;
            head.next = tail;
            tail.prev = head;
        }

        public int get(int key) {
            DLinkedListNode node = map.get(key);
            if(node==null)return -1;
            moveToHead(node);
            return node.value;
        }

        public void put(int key, int value) {
            DLinkedListNode node = map.get(key);
            if(node==null){
                node = new DLinkedListNode(key,value);
                addToHead(node);
                map.put(key,node);
                size++;
                if(size>capacity){
                    DLinkedListNode remove =  removeLast();
                    map.remove(remove.key);
                    size--;
                }
            }else {
                node.value=value;
                moveToHead(node);
            }
        }

        private void addToHead(DLinkedListNode node) {
            node.prev = head;
            node.next = head.next;
            head.next.prev = node;
            head.next = node;
        }

        private DLinkedListNode removeLast() {
            DLinkedListNode node = tail.prev;
            node.prev.next = tail;
            tail.prev = node.prev;
            return node;
        }

        private void removeNode(DLinkedListNode node) {
            node.prev.next = node.next;
            node.next.prev = node.prev;
        }

        private void moveToHead(DLinkedListNode node) {
            removeNode(node);
            addToHead(node);
        }
    }
}
