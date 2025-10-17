package leet.methods._1_linklist.middle;

import leet._class.linklist.ListNode;

public class Leet86_r1 {

    ///分隔链表
    public ListNode partition(ListNode head, int x) {
        //创建小元素链表
        ListNode smallFirst = new ListNode(0);
        //创建大元素链表
        ListNode bigFirst = new ListNode(0);
        //负责遍历
        ListNode small = smallFirst,big=bigFirst;
        while (head!=null){
            if(head.val>=x){
                big.next =head;
                big = big.next;
            }else {
                small.next=head;
                small= small.next;
            }
            head=head   .next   ;
        }
        //合并两个列表
        small.next = bigFirst.next;
        //收尾
        big.next=null;
        return smallFirst.next;
    }
    
}
