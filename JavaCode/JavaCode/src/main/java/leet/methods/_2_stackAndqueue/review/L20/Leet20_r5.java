package leet.methods._2_stackAndqueue.review.L20;

import java.util.Stack;

/**
 * 20. 有效的括号
 * 给定一个只包括 '('，')'，'{'，'}'，'['，']' 的字符串 s ，判断字符串是否有效。
 * 有效字符串需满足：
 * 1. 左括号必须用相同类型的右括号闭合。
 * 2. 左括号必须以正确的顺序闭合。
 * 示例 1：
 * 输入：s = "()"
 * 输出：true
 * 示例 2：
 * 输入：s = "()[]{}"
 * 输出：true
 * 示例 3：
 * 输入：s = "(]"
 * 输出：false
 * 示例 4：
 * 输入：s = "([)]"
 * 输出：false
 * 示例 5：
 * 输入：s = "{[]}"
 * 输出：true
 * 提示：
 * 1 <= s.length <= 10^4
 * s 仅由括号 '()[]{}' 组成
 */
public class Leet20_r5 {
    public boolean isValid(String s) {
        Stack<Character> stack = new Stack<>();
        for (int i = 0; i < s.length(); i++) {
            char c = s.charAt(i);
            switch (c) {
                case '[':
                    stack.add(']');
                    break;
                case '{':
                    stack.add('}');
                    break;
                case '(':
                    stack.add(')');
                    break;
                default:
                if(stack.empty() || stack.pop() != c)return false;
            }
        }
        return stack.empty();
    }
}
