package leet.methods._2_stackAndqueue.review.L232;

import java.util.Stack;

/// 使用栈实现队列
public class Leet232_r7 {

    private final Stack<Integer>  in =  new Stack<>();
    private final Stack<Integer>  out =  new Stack<>();


    public Leet232_r7() {

    }

    public void push(int x) {
        in.add(x);
    }

    public int pop() {
        if(out.isEmpty()){
            while (!in.isEmpty()){
                out.add(in.pop());
            }
        }
        return out.pop();
    }

    public int peek() {
        if(out.isEmpty()){
            while (!in.isEmpty()){
                out.add(in.pop());
            }
        }
        return out.peek();
    }

    public boolean empty() {
        return in.isEmpty()&& out.empty();
    }
}
