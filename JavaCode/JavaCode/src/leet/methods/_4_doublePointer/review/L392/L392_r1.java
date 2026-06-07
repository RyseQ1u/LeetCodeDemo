
package leet.methods._4_doublePointer.review.L392;

/*
392. 判断子序列
给定字符串 s 和 t ，判断 s 是否为 t 的子序列。
你可以认为 s 和 t 中仅包含英文小写字母。字符串 t 可能很长（长度 ~= 500,000），而 s 是个短字符串（长度 <=100）。
字符串 s 是字符串 t 的子序列，当它们中的所有字符出现在 t 中，且顺序一致，但不要求连续。例如，"ace" 是 "abcde" 的子序列。
示例 1:
输入: s = "abc", t = "ahbgdc"
输出: true
示例 2:
输入: s = "axc", t = "ahbgdc"
输出: false
后续挑战 :
如果有大量输入的 S，称作 S1, S2, ... , Sk，其中 k >= 10亿，你需要依次检查它们是否为 T 的子序列。在这种情况下，你会怎样改变代码？
提示：
0 <= s.length <= 100
0 <= t.length <= 500,000
两个字符串都只由小写字符组成。
 */
public class L392_r1 {

    public boolean isSubsequence(String s, String t) {
        int si=0,ti =0;
        int sl = s.length(), tl = t.length();
        if(sl==0)return true;
        while (si < sl && ti < tl) {
            if (s.charAt(si) == t.charAt(ti)) {
                if (++si == sl) {
                    return true;
                }
            }
            ti++;
        }
        return false;
    }
}
