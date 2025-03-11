package leet._class.stackAndqueue;

import java.util.Stack;

/**
 * 使用栈stack实现的队列
 */
class MyQueue_Leet232 {

    //正向栈
    Stack<Integer> stack ;
    //反向栈 用于弹出数据
    Stack<Integer> reserveStack ;


    public MyQueue_Leet232() {
        stack = new Stack<>();
        reserveStack = new Stack<>();
    }

    public void push(int x) {
        //将元素加入到正向栈
        stack.push(x);
    }

    //如果反向栈里面有数据直接弹出反向栈栈顶的数据 此时的数据即队列头元素
    public int pop() {

        //如果反向栈为空，将正向栈数据加入其中
        if(reserveStack.isEmpty()){
            while (!stack.isEmpty()){
                reserveStack.push(stack.pop());
            }
        }
        return reserveStack.pop();
    }

    //peek 方法同 pop
    public int peek() {
        if(reserveStack.isEmpty()){
            while (!stack.isEmpty()){
                reserveStack.push(stack.pop());
            }
        }
        return reserveStack.peek();
    }

    //判断是否为空时需要同时判断两个栈是否为空
    public boolean empty() {
        return stack.isEmpty() && reserveStack.isEmpty();
    }
}
