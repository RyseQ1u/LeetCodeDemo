package leet.methods._2_stackAndqueue.review.L232;

import java.util.Stack;

public class Leet232_r3 {



    public Leet232_r3() {

    }
    private Stack<Integer> in = new Stack<Integer>()    ;;
    private Stack<Integer> out = new Stack<Integer>()    ;;
    public void push(int x) {
        in.push(x);
    }

    public int pop() {
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
        return in.empty()&&out.empty() ;
    }
}
