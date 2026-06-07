package leet.methods._15_test.L146;

import java.util.HashMap;

public class Leet146_r5 {
    class LRUCache {
        //双向链表+HashMap

        class DLinkListNode {
            public int key;
            public int value;
            public DLinkListNode prev;
            public DLinkListNode next;

            public DLinkListNode() {
            }

            public DLinkListNode(int key, int value) {
                this.key = key;
                this.value = value;
            }
        }

        private final int capacity;
        private int size;
        private final DLinkListNode head;
        private final DLinkListNode tail;
        private final HashMap<Integer, DLinkListNode> map;

        public LRUCache(int capacity) {
            this.capacity = capacity;
            this.size = 0;
            this.head = new DLinkListNode();
            this.tail = new DLinkListNode();
            this.map = new HashMap<>(capacity);
            head.next = tail;
            tail.prev = head;
        }

        public int get(int key) {
            DLinkListNode node = map.get(key);
            if (node != null) {
                moveToHead(node);
                return node.value;
            } else {
                return -1;
            }
        }

        public void put(int key, int value) {
            DLinkListNode node = map.get(key);
            if (node == null) {
                node = new DLinkListNode(key, value);
                map.put(key, node);
                addToHead(node);
                size++;
                if (size > capacity) {
                    DLinkListNode removeNode = removeLast();
                    map.remove(removeNode.key);
                    size--;
                }
            } else {
                node.value = value;
                moveToHead(node);
            }
        }

        //添加到头部
        private void addToHead(DLinkListNode node) {
            node.prev = head;
            node.next = head.next;
            head.next.prev = node;
            head.next = node;
        }

        //移除节点
        private void removeNode(DLinkListNode node) {
            node.next.prev = node.prev;
            node.prev.next = node.next;
        }

        //移动节点到头部
        private void moveToHead(DLinkListNode node) {
            removeNode(node);
            addToHead(node);
        }

        //移除最后一个节点
        private DLinkListNode removeLast() {
            DLinkListNode node = this.tail.prev;
            removeNode(node);
            return node;
        }
    }
}
