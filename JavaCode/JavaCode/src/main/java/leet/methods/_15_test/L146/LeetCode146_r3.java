package leet.methods._15_test.L146;

import java.util.HashMap;

public class LeetCode146_r3 {
    class LRUCache {
        class DLinkedNode{
            public int key;
            public int value;
            public DLinkedNode pre;
            public DLinkedNode next;

            public DLinkedNode(int key, int value) {
                this.key = key;
                this.value = value;
            }

            public DLinkedNode() {
            }
        }

        private final DLinkedNode head;
        private final DLinkedNode tail;
        private final int capacity;
        private int size;
        private final HashMap<Integer,DLinkedNode> map;
        public LRUCache(int capacity) {
            this.capacity=capacity;
            this.size=0;
            map=new HashMap<>(capacity);
            head=new DLinkedNode();
            tail=new DLinkedNode();
            head.next=tail;
            tail.pre=head;
        }

        public int get(int key) {
            DLinkedNode node = map.get(key);
            if(node==null) return -1;
            moveToHead(node);
            return node.value;
        }

        public void put(int key, int value) {
            DLinkedNode node = map.get(key);
            if(node==null){
                node = new DLinkedNode(key,value);
                map.put(key,node);
                addToHead(node);
                size++;
                if(size>capacity){
                    DLinkedNode removeNode = removeTail();
                    map.remove(removeNode.key);
                }
            }else {
                node.value=value;
                moveToHead(node);
            }
        }

        void addToHead(DLinkedNode node){
            node.next=head.next;
            node.pre=head;
            head.next.pre=node;
            head.next=node;
        }

        void removeNode(DLinkedNode node){
            node.pre.next=node.next;
            node.next.pre=node.pre;
        }

        void moveToHead(DLinkedNode node){
            removeNode(node);
            addToHead(node);
        }

        DLinkedNode removeTail(){
            DLinkedNode node = tail.pre;
            removeNode(node);
            return node;
        }

    }
}
