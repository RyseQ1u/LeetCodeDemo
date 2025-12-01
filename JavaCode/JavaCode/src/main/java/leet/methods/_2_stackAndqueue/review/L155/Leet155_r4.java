package leet.methods._2_stackAndqueue.review.L155;

import java.util.Stack;

/**
 * 155. 最小栈
 * 设计一个支持 push ，pop ，top 操作，并能在常数时间内检索到最小元素的栈。
 * push(x) —— 将元素 x 推入栈中。
 * pop() —— 删除栈顶的元素。
 * top() —— 获取栈顶元素。
 * getMin() —— 检索栈中的最小元素。
 * 示例:
 * 输入：
 * ["MinStack","push","push","push","getMin","pop","top","getMin"]
 * [[],[-2],[0],[-3],[],[],[],[]]
 * 输出：
 * [null,null,null,null,-3,null,0,-2]
 * 解释：
 * MinStack minStack = new MinStack();
 * minStack.push(-2);
 * minStack.push(0);
 * minStack.push(-3);
 * minStack.getMin(); // 返回 -3.
 * minStack.pop();
 * minStack.top();    // 返回 0.
 * minStack.getMin(); // 返回 -2.
 * 提示：
 * pop、top 和 getMin 操作总是在 非空栈 上调用。
 */
public class Leet155_r4 {
    class MinStack {
        private final Stack<Long> stack= new Stack<>();
        private long min = 0;
        public MinStack() {

        }

        public void push(int val) {
            if(stack.isEmpty()){
                min = val;
                stack.add(0L);
            }else {
                long sub = val - min;
                if(sub<0){
                    min = val;
                }
                stack.add(sub);
            }
        }

        public void pop() {
            long tmp = stack.pop();
            if(tmp<0){
                min-=tmp;
            }
        }

        public int top() {
            long tmp = stack.peek();
            if(tmp < 0){
                return (int) min;
            }else {
                return (int) (tmp + min);
            }
        }

        public int getMin() {
            return (int) min;
        }
    }
}
