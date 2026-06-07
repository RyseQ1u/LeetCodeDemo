package leet.methods._2_stackAndqueue.review.L232;

import java.util.Stack;

/// 使用栈实现队列
public class Leet232_r6 {
    private final Stack<Integer> in = new Stack<>();
    private final Stack<Integer> out = new Stack<>();
    public Leet232_r6() {

    }

    public void push(int x) {
        in.add(x);
    }

    public int pop() {
        if(out.empty()){
            while (!in.empty()){
                out.add(in.pop());
            }
        }
        return out.pop();
    }

    public int peek() {
        if(out.empty()){
            while (!in.empty()){
                out.add(in.pop());
            }
        }
        return out.peek();
    }

    public boolean empty() {
        return in.empty() && out.empty();
    }
}
