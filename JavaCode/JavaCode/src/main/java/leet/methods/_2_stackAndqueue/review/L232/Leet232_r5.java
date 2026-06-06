package leet.methods._2_stackAndqueue.review.L232;

import java.util.Stack;

/// 使用栈实现队列
public class Leet232_r5 {
    Stack<Integer> in = new Stack<>();
    Stack<Integer> out = new Stack<>();
    public Leet232_r5() {

    }

    public void push(int x) {
        in.push(x);
    }

    public int pop()
    {
        if(out.empty()){
            while (!in.empty()){
                out.push(in.pop());
            }
        }
        return out.pop();
    }

    public int peek() {
        if(out.empty()){
            while (!in.empty()){
                out.push(in.pop());
            }
        }
        return out.peek();
    }

    public boolean empty() {
        return in.empty()&& out.empty();
    }
}
