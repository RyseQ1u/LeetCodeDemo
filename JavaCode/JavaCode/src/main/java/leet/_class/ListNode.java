package leet._class;

 public class ListNode {
     public int val;
     public ListNode next;
     public ListNode() {}
     public ListNode(int val) { this.val = val; }
     public ListNode(int val, ListNode next) { this.val = val; this.next = next; }

     // 重写 equals 方法
     @Override
     public boolean equals(Object o) {
         // 1. 基本检查
         if (this == o) return true;
         if (o == null || getClass() != o.getClass()) return false;

         ListNode current = this;
         ListNode other = (ListNode) o;

         // 2. 逐个节点迭代比较
         while (current != null && other != null) {
             if (current.val != other.val) return false;
             current = current.next;
             other = other.next;
         }

         // 3. 检查是否同时到达末尾（长度相同）
         return current == null && other == null;
     }
 }
