package leet.methods._2_stackAndqueue.review.L155;

import java.util.Stack;

public class Leet155_r2 {
    class MinStack {
        private long min = 0;
        private Stack<Long> stack = new Stack<>();
        public MinStack() {

        }

        public void push(int val) {
            //当栈空时，设置最小值min
            if(stack.empty()){
                stack.add(0l);
                min = val;
            }else {
                long tmp = val - min;
                if(tmp<0){
                    min = val;
                }
                stack.add(tmp);
            }
        }

        public void pop() {
            long tmp = stack.pop();
            if(tmp <0){
                min = min - tmp;
            }
        }

        public int top() {
            //如果栈顶元素小于0 表示该元素为最小值min
            if(stack.peek()<0){
                return (int) min;
            }
            return (int) (stack.peek() + min);
        }

        public int getMin() {
            return (int) min;
        }
    }
}
