package leet.methods._3_hashTable.easy.review.L409;

/**
 * 409. 最长回文串
 * 给你一个由大小写英文字母组成的字符串 s ，返回 通过重新排列 s 中的字母 所能形成的最长回文串的长度
 * 示例 1：
 * 输入:s = "abccccdd"
 * 输出:7
 * 解释:我们可以构造的最长回文串是"dccaccd",其长度为 7。
 * 示例 2：
 * 输入:s = "a"
 * 输出:1
 * 解释:最长回文串是"a",其长度为 1。
 * 提示：
 * 1 <= s.length <= 2000
 * s 仅由大小写英文字母组成
 */
public class L409_r7 {
    public int longestPalindrome(String s) {
        int[] map = new int[128];
        for (int i = 0; i < s.length(); i++) {
            map[s.charAt(i)]++;
        }
        int odd  = 0;
        for (int i : map) {
            if((i&1) == 1) odd++;
        }
        return odd == 0?s.length():s.length()-odd+1;
    }
}
