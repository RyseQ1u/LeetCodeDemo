package leet.methods._4_doublePointer.review.L160;

import leet._class.linklist.ListNode;

/**
 * 160. 相交链表
 * 给定两个单链表的头节点 headA 和 headB ，请找出并返回两个单链表相交的起始节点。如果两个链表没有交点，返回 null 。
 * 输入：intersectVal = 8, listA = [4,1,8,4,5], listB = [5,0,1,8,4,5], skipA = 2, skipB = 3
 * 输出：Intersected at '8'
 * 解释：从各自的表头开始算起，链表 A 为 [2,6,4]，链表 B 为 [1,5]。由于这两个链表不相交，所以 intersectVal 必须为 0，而 skipA 和 skipB 可以是任意值。
 * 由于 skipA = 3 且 skipB = 1，链表 A 将会到达链表 B 的第一个节点。
 * 提示：
 * listA 和 listB 的节点数目范围在 1 到 3 * 104 。
 * 1 <= Node.val <= 3 * 104
 * 0 <= skipA < listA.length
 * 0 <= skipB < listB.length
 * 如果两个链表没有交点，intersectVal 为 0 ，否则Intersected at node 8 (注意，如果两个链表相交，那么交点中的节点不能是两个链表的末尾节点！)。
 * 链表相交的 Definition：两个链表相交，当且仅当两个链表的末尾节点相同。
 * 进阶：你能否设计一个时间复杂度 O(n) 且仅用 O(1) 内存的解决方案？
 */
public class L160_r4 {
    public ListNode getIntersectionNode(ListNode headA, ListNode headB) {
        ListNode a = headA, b = headB;
        while (a != b) {
            a = a.next == null ? headB : a.next;
            b = b.next == null ? headA : b.next;
        }
        return a;
    }
}
