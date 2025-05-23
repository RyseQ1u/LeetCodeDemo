package leet.methods.mock.middle;

import java.util.Stack;

public class Leet946 {


    public boolean validateStackSequences(int[] pushed, int[] popped) {
        Stack<Integer> stack = new Stack<>();
        //popped指针 记录的是出栈元素的顺序
        int pI = 0;
        for (int i = 0; i < pushed.length; i++) {
            //模拟插入
            stack.push(pushed[i]);
            //判断栈顶的数据 是否为出栈的数据
            while (!stack.isEmpty() && stack.peek() == popped[pI]){
                //出栈
                stack.pop();
                pI++;
            }

        }
        //如果栈空表示可以还原
        return  stack.isEmpty();
    }
}


