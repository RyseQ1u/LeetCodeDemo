package leet.methods._4_doublePointer.review.L876;

import leet._class.linklist.ListNode;

public class L876_r1 {
    public ListNode middleNode(ListNode head) {
        ListNode middle = head;
        int count =0, midIndex=0;
        while (head!=null){
            head=head.next;
            count++;
            // 每次前进时，判断当前节点数是奇数还是偶数
            if(count%2==0) {
                middle = middle.next;
            }
        }
        return middle;
    }
}
