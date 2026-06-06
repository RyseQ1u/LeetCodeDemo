package leet.methods._15_test.L146;

import java.util.HashMap;

public class LeetCode146_r2 {
    class LRUCache {

        class DLinkedList{
            DLinkedList pre;
            DLinkedList next;
            int key;
            int value;

            public DLinkedList() {
            }

            public DLinkedList(int key, int value) {
                this.key = key;
                this.value = value;
            }
        }


        private final DLinkedList head;
        private final DLinkedList tail;
        private final HashMap<Integer,DLinkedList> map;
        int capacity,size;

        public LRUCache(int capacity) {
            this.head =new DLinkedList();
            this.tail =new DLinkedList();
            map= new HashMap<>(capacity);
            this.capacity=capacity;
            this.size=0;
            head.next=tail;
            tail.pre=head;
        }

        public int get(int key) {
            DLinkedList node = map.get(key);
            if(node==null){
                return -1;
            }
            removeToHead(node);
            return node.value;
        }

        public void put(int key, int value) {
            DLinkedList node = map.get(key);
            if(node==null){
                node = new DLinkedList(key,value);
                map.put(key,node);
                addToHead(node);
                size++;
                if(size>capacity){
                    DLinkedList removeNode = removeToTail();
                    map.remove(removeNode.key);
                    size--;
                }
            }else {
                node.value=value;
                removeToHead(node);
            }
        }

        void addToHead(DLinkedList node){
            node.pre=head;
            node.next=head.next;
            head.next.pre=node;
            head.next=node;
        }

        void removeNode(DLinkedList node){
            node.pre.next=node.next;
            node.next.pre=node.pre;
        }

        void removeToHead(DLinkedList node){
            removeNode(node);
            addToHead(node);
        }

        DLinkedList removeToTail(){
            DLinkedList node = tail.pre;
            removeNode(node);
            return node;
        }
    }
}
