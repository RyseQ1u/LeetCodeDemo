package leet._class.stackAndqueue;

import java.util.Stack;

/**
 * 使用stack实现最小栈
 */
public class MinStack_Stack {

    /// 原栈
    private Stack<Integer> stack;

    /// 辅助栈
    private Stack<Integer> minStack;


    public MinStack_Stack() {
        stack = new Stack<Integer>();
        minStack = new Stack<Integer>();
    }

    /**
     *
     * 插入元素
     * @param val 插入的值
     */
    public void Push(int val) {
        stack.push(val);
        //如果当前值比最小值小，插入辅助栈
        if(minStack.isEmpty()||val<=minStack.peek()){
            minStack.push(val);
        }
    }

    /**
     * 移除顶上的元素
     */
    public void Pop() {
        //如果移除的是最小值，则将辅助栈的最小值弹出
        if(stack.pop().equals(minStack.peek())){
            minStack.pop();
        }
    }

    /**
     * 查看顶上的元素
     * @return 顶上的元素
     */
    public int Top() {
        return  stack.peek();
    }

    /**
     * 获取最小值
     * @return 最小值
     */
    public int GetMin() {
        return minStack.peek();
    }
}
