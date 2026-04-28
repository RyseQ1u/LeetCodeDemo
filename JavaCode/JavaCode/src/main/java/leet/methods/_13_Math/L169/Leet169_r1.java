package leet.methods._13_Math.L169;

import java.util.Stack;

public class Leet169_r1 {
    public int majorityElement(int[] nums) {
        Stack<Integer> stack = new Stack<>();
        for (int num : nums) {
            if (stack.isEmpty() || stack.peek() == num) {
                stack.push(num);
            } else {
                stack.pop();
            }
        }
        return stack.peek();
    }

    public int majorityElement_V2(int[] nums) {
        int res =0 ,cnt =0 ;
        for (int num : nums) {
            if(cnt==0){
                res = num;
                cnt++;
            }else {
                cnt += res ==num?1:-1;
            }
        }
        return res;
    }
}
