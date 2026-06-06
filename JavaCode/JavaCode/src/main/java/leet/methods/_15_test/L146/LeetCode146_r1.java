package leet.methods._15_test.L146;

import java.util.HashMap;
import java.util.Map;

public class LeetCode146_r1 {
    /// 使用hashmap 和 双向链表  实现
    class LRUCache {

        class DLinkedNode {
            public DLinkedNode pre;
            public DLinkedNode next;
            public int value;
            public int key;

            public DLinkedNode( int key,int value) {
                this.value = value;
                this.key = key;
            }

            public DLinkedNode() {
            }
        }

        private final Map<Integer, DLinkedNode> cache = new HashMap<>();
        private final int capacity;
        private int size;
        private final DLinkedNode head;
        private final DLinkedNode tail;


        public LRUCache(int capacity) {
            this.capacity = capacity;
            this.size = 0;
            head = new DLinkedNode();
            tail = new DLinkedNode();
            head.next = tail;
            tail.pre = head;
        }

        public int get(int key) {
            DLinkedNode node = cache.get(key);
            if(node==null){
                return -1;
            }
            //移动到链表头部
            moveToHead(node);
            return node.value;
        }

        public void put(int key, int value) {
            DLinkedNode node = cache.get(key);
            if(node==null){
                DLinkedNode newNode = new DLinkedNode(key, value);
                cache.put(key,newNode);
                addToHead(newNode);
                size++;
                if(size>capacity){
                    DLinkedNode tail = removeToTail();
                    cache.remove( tail.key  );
                    size--;
                }
            }else {
                node.value=value;
                moveToHead(node);
            }
        }

        private void addToHead(DLinkedNode node){
            node.pre=head;
            node.next=head.next;
            head.next.pre=node;
            head.next=node;
        }

        private void removeNode(DLinkedNode node){
            node.pre.next = node.next;
            node.next.pre = node.pre;
        }

        private void moveToHead(DLinkedNode node){
            removeNode(node);
            addToHead(node);
        }
        private DLinkedNode removeToTail(){
            DLinkedNode node= tail.pre;
            removeNode(node);
            return node;
        }
    }
}
