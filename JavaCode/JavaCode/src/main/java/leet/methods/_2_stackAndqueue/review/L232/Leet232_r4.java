package leet.methods._2_stackAndqueue.review.L232;

import java.util.Stack;

public class Leet232_r4 {
    Stack<Integer> stackIn = new Stack<>();
    Stack<Integer> stackOut = new Stack<>();
    public Leet232_r4() {

    }

    public void push(int x) {
            stackIn.push(x);
    }

    public int pop() {
        if(stackOut.isEmpty()){
            while(!stackIn.isEmpty()){
                stackOut.push( stackIn.pop() );
            }
        }
        return stackOut.pop();
    }

    public int peek() {
        if(stackOut.isEmpty()){
            while(!stackIn.isEmpty()){
                stackOut.push( stackIn.pop() );
            }
        }
        return stackOut.peek();
    }


    public boolean empty() {
        return stackIn.isEmpty()&&stackOut.isEmpty();
    }
}
