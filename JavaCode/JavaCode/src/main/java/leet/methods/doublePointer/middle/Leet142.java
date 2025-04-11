package leet.methods.doublePointer.middle;

import leet._class.linklist.ListNode;

public class Leet142 {


    /**
     * 使用快慢双指针
     * 通过计算两次节点相遇，算出结果
     * @param head
     * @return
     */
    public ListNode detectCycle(ListNode head) {
        //快慢指针都从头节点开始
        ListNode flast = head,slow = head;
        //第一次遍历，寻找第一次相遇的地方
        //设置快指针一次走两步，慢指针一次走一步，快指针每次都多走一步，若有环则一定会相遇
        while (true){
            //代表链表遍历完成，没有闭环
            if(flast==null||flast.next==null)return null;
            flast = flast.next.next;
            slow = slow.next;
            //代表第一次相遇
            if(flast==slow)break;;
        }
        //第二次遍历，寻找节点入口
        //相遇时 慢指针的总路径刚好等于n个环的周长 slowLength = n * c
        //设环入口的距离为 k ，则慢指针的路径又等于 slowLength = k + b * c
        //所以设置快指针从头节点出发，每次走一步，当快指针走到入口时，慢指针刚好也到达入口
        flast = head;
        while (flast != slow){
            flast = flast.next;
            slow=slow.next;

        }
        return  flast;
    }


}
