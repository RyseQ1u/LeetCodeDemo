package leet._class.stackAndqueue;

 public class ListNode_Leet115 {
     public int val;
     /// 子节点
     public ListNode_Leet115 next;
     /// 父节点
     public ListNode_Leet115 pre;
     /// 最小节点
     public ListNode_Leet115 min;
     public ListNode_Leet115() {}
     public ListNode_Leet115(int val) { this.val = val; }
     public ListNode_Leet115(int val, ListNode_Leet115 next) { this.val = val; this.next = next; }

     // 重写 equals 方法
     @Override
     public boolean equals(Object o) {
         // 1. 基本检查
         if (this == o) return true;
         if (o == null || getClass() != o.getClass()) return false;

         ListNode_Leet115 current = this;
         ListNode_Leet115 other = (ListNode_Leet115) o;

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
