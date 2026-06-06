package leet.methods._2_stackAndqueue.review.rclass;

import java.util.Stack;

/**
 * 不使用辅助栈
 * 栈来记录和min值的差值
 */
public class MinStackc_Stack_r1 {

    //存放与最小值的差值
    private Stack<Long>stack;
    //记录最小值
    private long min;

    public MinStackc_Stack_r1() {
        stack=new Stack<Long>();
    }

    public void push(int val) {
        if(stack.isEmpty()){
            //设置第一个元素为最小值
            min=val;
            //当前差值为0
            stack.push(0L);
        }else{
            //计算差值
            long diff=(long)(val-min);
            if(diff<0){
                //设置当前值为最小值
                min=val;
            }
            stack.push(diff);
        }
    }

    public void pop() {
        long temp=stack.pop();
        if(temp<0){
            //更新最小值时元素是负数
            //此时弹出的是当前最小值，所以需要更新
            min=min-temp;
        }
    }

    public int top() {
        long temp=stack.peek();
        if(temp>0){
            //返回差值+最小值的和
            return (int)(temp+min);
        }else{
            return (int)min;
        }
    }

    public int getMin() {
        return (int)min;
    }

}

