package leet.methods.doublePointer.easy;

import leet._class.linklist.ListNode;

public class Leet876 {


    /**
     * 使用双指针 遍历两次
     * @return
     */
    public ListNode middleNode(ListNode head) {
        //n 节点总数
        int n=0;
        ListNode cur = head;
        //遍历链表
        while (cur!=null){
            cur=cur.next;
            n++;

        }
        cur = head;
        //计算中节点位置
        int quotient = n/2,k = 0;
        while (k < quotient){
            cur=cur.next;
            k++;
        }
        return  cur;
    }



}
