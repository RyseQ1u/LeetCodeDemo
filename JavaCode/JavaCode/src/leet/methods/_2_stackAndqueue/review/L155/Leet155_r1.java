package leet.methods._2_stackAndqueue.review.L155;

import java.util.Stack;

public class Leet155_r1 {
    class MinStack {
        private Stack<Long> stack = new Stack<Long>();
        private long min = 0;

        public void push(int val) {
            if(stack.empty()){
                stack.push(0l);
                min= val;
            }else {
                long diff = val - min;
                if(diff<0){
                    min= val;
                }
                stack.push(diff);
            }
        }

        public void pop() {
            long tmp = stack.pop();
            if(tmp<0){
                min= min - tmp;
            }
        }

        public int top() {
            long tmp = stack.peek();
            if(tmp>0){
            return (int) (tmp+min);

            }
            return (int) tmp;
        }

        public int getMin() {

            return (int) min;
        }
    }
}
