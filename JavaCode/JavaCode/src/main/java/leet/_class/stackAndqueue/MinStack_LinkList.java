package leet._class.stackAndqueue;

public class MinStack_LinkList {

    /// 使用双向链表实现
    public ListNode_Leet115 root;

    public MinStack_LinkList() {
        root = new ListNode_Leet115();
    }

    /**
     *
     * 插入元素
     * @param val 插入的值
     */
    public void Push(int val) {
        ListNode_Leet115 cur =  new ListNode_Leet115(val);
        if(root.next==null){

            root.next=cur;
            root.min = cur;
        }else {

            ListNode_Leet115 tmp = root.next;
            root.next=cur;
            cur.next=tmp;
            if(root.min.val > cur.val){
                cur.min=root.min    ;
                root.min    =cur;

            }
        }
    }

    public void Pop() {
        ListNode_Leet115 tmp = root.next;
        root.next=tmp.next;
    }

    public int Top() {
        ListNode_Leet115 tmp = root.next;
        root.next=tmp.next;
        return tmp.val;
    }

    public int GetMin() {
        ListNode_Leet115 min = root.min;
        min.pre=min.next;
        return min.val;
    }
}
